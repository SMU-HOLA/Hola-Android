package org.tech.town.hola.guFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.*
import com.android.volley.toolbox.HttpHeaderParser
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_gu.*
import org.json.JSONObject
import org.tech.town.hola.dataClass.DongScore
import org.tech.town.hola.DongScoreAdapter
import org.tech.town.hola.GuDetail
import org.tech.town.hola.R
import java.io.UnsupportedEncodingException
import java.nio.charset.StandardCharsets


class DongJakFragment : Fragment() {


    lateinit var guDetail: GuDetail
    override fun onAttach(context: Context)
    {   super.onAttach(context)
        guDetail = context as GuDetail
    }


    private val adapter = DongScoreAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_gu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 코드 작성
        val layoutManager = LinearLayoutManager(guDetail, LinearLayoutManager.VERTICAL, false)
        dongRecyclerView.layoutManager = layoutManager

        DoBongFragment.requestQueue = Volley.newRequestQueue(guDetail)
        send()

    }
    fun send() {
        val url = "http://10.0.2.2:8080/district/12"

        val request = object: StringRequest(
            Request.Method.GET,
            url,
            {

                val jsonObject = JSONObject(it)
                val jsonArray = jsonObject.getJSONArray("dongList")

                guNameTv.text = jsonObject.getString("name")
                cultureScoreTv.text = jsonObject.getString("culture")
                convenienceScoreTv.text = jsonObject.getString("convenience")
                welfareScoreTv.text = jsonObject.getString("welfare")
                greeneryScoreTv.text = jsonObject.getString("greenery")
                medicalScoreTv.text = jsonObject.getString("medical")
                trafficScoreTv.text = jsonObject.getString("transport")
                activityScoreTv.text = jsonObject.getString("activity")
                avgScoreTv.text = jsonObject.getString("totalScore")


                for (i in 0..jsonArray.length()-1){
                    adapter.items.add(DongScore(jsonArray.getJSONObject(i).getString("name"),
                        jsonArray.getJSONObject(i).getDouble("culture"),
                        jsonArray.getJSONObject(i).getDouble("convenience"),
                        jsonArray.getJSONObject(i).getDouble("welfare"),
                        jsonArray.getJSONObject(i).getDouble("greenery"),
                        jsonArray.getJSONObject(i).getDouble("medical"),
                        jsonArray.getJSONObject(i).getDouble("transport"),
                        jsonArray.getJSONObject(i).getDouble("activity"),

                        ))
                }

                dongRecyclerView.adapter = adapter

            },
            {
                textView.text = "${it.message}"
            }

        ){
            override fun parseNetworkResponse(response: NetworkResponse): Response<String>? {
                return try {
                    val utf8String = String(response.data, StandardCharsets.UTF_8)
                    Response.success(utf8String, HttpHeaderParser.parseCacheHeaders(response))
                } catch (e: UnsupportedEncodingException) {
                    // log error
                    Response.error(ParseError(e))
                } catch (e: Exception) {
                    // log error
                    Response.error(ParseError(e))
                }
            }

        }

        request.setShouldCache(true)
        DoBongFragment.requestQueue?.add(request)


    }

}