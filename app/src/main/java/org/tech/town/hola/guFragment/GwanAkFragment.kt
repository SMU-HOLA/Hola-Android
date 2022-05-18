package org.tech.town.hola.guFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_gu.*
import org.tech.town.hola.DongScore
import org.tech.town.hola.DongScoreAdapter
import org.tech.town.hola.GuDetail
import org.tech.town.hola.R


class GwanAkFragment : Fragment() {
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

        mapIv.setImageResource(R.drawable.map_gwanak)
        adapter.items.add(DongScore("관악동", 4.6, 4, 4.8, 5, 3, 2.7))
        adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
        adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
        dongRecyclerView.adapter = adapter
    }

}