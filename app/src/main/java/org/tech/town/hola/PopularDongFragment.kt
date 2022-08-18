package org.tech.town.hola

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Room
import kotlinx.android.synthetic.main.fragment_popular_area.view.*
import kotlinx.android.synthetic.main.fragment_popular_dong.view.*
import org.json.JSONObject
import org.tech.town.hola.roomdb.AppDatabase

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PopularDongFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PopularDongFragment : Fragment() {

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
        val db = Room.databaseBuilder(
            mainActivity , AppDatabase::class.java, "database"
        ).allowMainThreadQueries().build()

        val data = db.dao().getAll().toString().substring(10 until db.dao().getAll().toString().length)


        val jsonObject = JSONObject(data)
        val jsonArray = jsonObject.getJSONArray("dong_total")
        // Inflate the layout for this fragment
        var scoreList = mutableListOf<Double>()
        for (i in 0..jsonArray.length() -1){
            scoreList.add(jsonArray.getJSONObject(i).getDouble("score"))
        }
        var sortedScoreList = scoreList.sorted().reversed()


        val rootView = inflater.inflate(R.layout.fragment_popular_dong, container, false)

        for (i in 0..jsonArray.length() -1){
            if (sortedScoreList[0] ==scoreList[i])
                rootView.dongFirstTv.text=jsonArray.getJSONObject(i).getString("name")
            else if (sortedScoreList[1] ==scoreList[i])
                rootView.dongSecondTv.text=jsonArray.getJSONObject(i).getString("name")
            else if (sortedScoreList[2] ==scoreList[i])
                rootView.dongThirdTv.text=jsonArray.getJSONObject(i).getString("name")
        }


        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 코드 작성


    }


}