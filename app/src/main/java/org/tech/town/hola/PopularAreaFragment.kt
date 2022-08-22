package org.tech.town.hola

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.android.volley.NetworkResponse
import com.android.volley.ParseError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.HttpHeaderParser
import com.android.volley.toolbox.StringRequest
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_gu.*
import kotlinx.android.synthetic.main.fragment_popular_area.view.*
import org.json.JSONObject
import org.tech.town.hola.dataClass.DongScore
import org.tech.town.hola.guFragment.DoBongFragment

import java.io.UnsupportedEncodingException
import java.nio.charset.StandardCharsets

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PopularAreaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PopularAreaFragment : Fragment() {



        // 1. Context를 할당할 변수를 프로퍼티로 선언(어디서든 사용할 수 있게)
        lateinit var mainActivity: MainActivity

        override fun onAttach(context: Context) {
            super.onAttach(context)

            // 2. Context를 액티비티로 형변환해서 할당
            mainActivity = context as MainActivity
        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val rootView = inflater.inflate(R.layout.fragment_popular_area, container, false)
        val url = "http://10.0.2.2:8080/main"

        val request = object: StringRequest(
            Request.Method.GET,
            url,
            {

                val jsonObject = JSONObject(it)
                val jsonArray = jsonObject.getJSONArray("district_total")


                var scoreList = mutableListOf<Double>()
                for (i in 0..jsonArray.length() -1){
                    scoreList.add(jsonArray.getJSONObject(i).getDouble("score"))
                }
                var sortedScoreList = scoreList.sorted().reversed()



                for (i in 0..jsonArray.length() -1){
                    if (sortedScoreList[0] ==scoreList[i])
                        rootView.firstTv.text=jsonArray.getJSONObject(i).getString("name")
                    else if (sortedScoreList[1] ==scoreList[i])
                        rootView.secondTv.text=jsonArray.getJSONObject(i).getString("name")
                    else if (sortedScoreList[2] ==scoreList[i])
                        rootView.thirdTv.text=jsonArray.getJSONObject(i).getString("name")
                }


            },
            {

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
        MainActivity.requestQueue?.add(request)


        return rootView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 코드 작성


    }






}