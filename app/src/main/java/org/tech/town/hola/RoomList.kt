package org.tech.town.hola

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.*
import com.android.volley.toolbox.HttpHeaderParser
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_room_list.*
import kotlinx.android.synthetic.main.fragment_gu.*
import org.json.JSONObject
import org.tech.town.hola.dataClass.DongScore
import org.tech.town.hola.dataClass.Room
import org.tech.town.hola.guFragment.DoBongFragment
import java.io.UnsupportedEncodingException
import java.nio.charset.StandardCharsets

class RoomList: AppCompatActivity() {
    companion object{
        var requestQueue: RequestQueue? = null
    }

    val adapter = RoomAdapter()


    override fun onCreate(savedInstance: Bundle?){
        super.onCreate(savedInstance)
        setContentView(R.layout.activity_room_list)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        roomRecyclerView.layoutManager = layoutManager

        val dongId: Int = intent.getIntExtra("dongId", 1)
        val dongName:String? = intent.getStringExtra("dongName")
        requestQueue = Volley.newRequestQueue(applicationContext)


        send(dongId, dongName.toString())



    }
    fun send(dongId: Int, dongName: String) {
        val url = "http://10.0.2.2:8080/estate/$dongId"

        val request = object: StringRequest(
            Request.Method.GET,
            url,
            {
                dongNameTv.text = dongName
                val str: String = "{estate: $it}"
                val jsonObject = JSONObject(str)
                val jsonArray = jsonObject.getJSONArray("estate")

                for (i in 0..jsonArray.length()-1){

                    adapter.items.add(
                        Room(jsonArray.getJSONObject(i).getString("deposite"),
                        jsonArray.getJSONObject(i).getString("type"),
                        jsonArray.getJSONObject(i).getString("explain"),
                        jsonArray.getJSONObject(i).getString("info"),

                        )
                    )
                }

                roomRecyclerView.adapter = adapter

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
        requestQueue?.add(request)


    }
}