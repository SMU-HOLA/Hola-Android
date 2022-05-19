package org.tech.town.hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_gu_search.*
import kotlinx.android.synthetic.main.fragment_gu.*

class GuSearch : AppCompatActivity() {

    private val adapter = GuListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gu_search)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        guSearchRecyclerView.layoutManager = layoutManager

        adapter.items.add(GuList("강남구"))
        adapter.items.add(GuList("강동구"))
        adapter.items.add(GuList("강북구"))
        adapter.items.add(GuList("강서구"))
        adapter.items.add(GuList("관악구"))
        adapter.items.add(GuList("광진구"))
        adapter.items.add(GuList("구로구"))
        adapter.items.add(GuList("금천구"))
        adapter.items.add(GuList("노원구"))
        adapter.items.add(GuList("도봉구"))
        adapter.items.add(GuList("동대문구"))
        adapter.items.add(GuList("동작구"))
        adapter.items.add(GuList("마포구"))
        adapter.items.add(GuList("서대문구"))
        adapter.items.add(GuList("서초구"))
        adapter.items.add(GuList("성동구"))
        adapter.items.add(GuList("성북구"))
        adapter.items.add(GuList("송파구"))
        adapter.items.add(GuList("양천구"))
        adapter.items.add(GuList("영등포구"))
        adapter.items.add(GuList("용산구"))
        adapter.items.add(GuList("은평구"))
        adapter.items.add(GuList("종로구"))
        adapter.items.add(GuList("중구"))
        adapter.items.add(GuList("중랑구"))
        guSearchRecyclerView.adapter = adapter
    }
}