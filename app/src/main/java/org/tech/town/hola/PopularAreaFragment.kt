package org.tech.town.hola

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_gu.*
import kotlinx.android.synthetic.main.fragment_popular_area.view.*
import org.json.JSONObject
import org.tech.town.hola.roomdb.AppDatabase

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


//    val jsonString = """
//        {
//    "district_total": [
//        {
//            "type": "DISTRICT",
//            "id": 1,
//            "name": "종로구",
//            "score": 97.0
//        },
//        {
//            "type": "DISTRICT",
//            "id": 3,
//            "name": "용산구",
//            "score": 95.0
//        },
//        {
//            "type": "DISTRICT",
//            "id": 2,
//            "name": "중구",
//            "score": 94.0
//        },
//        {
//            "type": "DISTRICT",
//            "id": 4,
//            "name": "성동구",
//            "score": 92.0
//        },
//        {
//            "type": "DISTRICT",
//            "id": 5,
//            "name": "광진구",
//            "score": 90.0
//        }
//    ]}
//    """.trimIndent()
//    // toJson -> getKeyArray("district_total") -> array[0].get("name")




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val db = Room.databaseBuilder(
           mainActivity , AppDatabase::class.java, "database"
        ).allowMainThreadQueries().build()

        val data = db.dao().getAll().toString().substring(10 until db.dao().getAll().toString().length)


        val jsonObject = JSONObject(data)
        val jsonArray = jsonObject.getJSONArray("district_total")
        // Inflate the layout for this fragment
        var scoreList = mutableListOf<Double>()
        for (i in 0..jsonArray.length() -1){
            scoreList.add(jsonArray.getJSONObject(i).getDouble("score"))
        }
        var sortedScoreList = scoreList.sorted().reversed()


        val rootView = inflater.inflate(R.layout.fragment_popular_area, container, false)

        for (i in 0..jsonArray.length() -1){
            if (sortedScoreList[0] ==scoreList[i])
                rootView.firstTv.text=jsonArray.getJSONObject(i).getString("name")
            else if (sortedScoreList[1] ==scoreList[i])
                rootView.secondTv.text=jsonArray.getJSONObject(i).getString("name")
            else if (sortedScoreList[2] ==scoreList[i])
                rootView.thirdTv.text=jsonArray.getJSONObject(i).getString("name")
        }


        return rootView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 코드 작성


    }




}