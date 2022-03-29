package org.tech.town.hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_gu_detail.*

class GuDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gu_detail)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        dongRecyclerView.layoutManager = layoutManager

        val guName = intent.getStringExtra("guName")

        val adapter = DongScoreAdapter()
        if (guName.equals("seoDaeMon")) {
            mapIv.setImageResource(R.drawable.map_seodaemon)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter
        }
        else if (guName.equals("gangSeo")){
            mapIv.setImageResource(R.drawable.map_gangseo)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("youngDeongPo")){
            mapIv.setImageResource(R.drawable.map_youngdeongpo)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("yangCheon")){
            mapIv.setImageResource(R.drawable.map_yangchun)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("guRo")){
            mapIv.setImageResource(R.drawable.map_guro)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }

        else if (guName.equals("geumCheon")){
            mapIv.setImageResource(R.drawable.map_geumcheon)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("dongJak")){
            mapIv.setImageResource(R.drawable.map_dongjak)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("gwanAk")){
            mapIv.setImageResource(R.drawable.map_gwanak)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("seoCho")){
            mapIv.setImageResource(R.drawable.map_seocho)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("gangNam")){
            mapIv.setImageResource(R.drawable.map_gangnam)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("songPa")){
            mapIv.setImageResource(R.drawable.map_songpa)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("gangDong")){
            mapIv.setImageResource(R.drawable.map_gangdong)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("maPo")){
            mapIv.setImageResource(R.drawable.map_mapo)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("yongSan")){
            mapIv.setImageResource(R.drawable.map_yongsan)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("seongDong")){
            mapIv.setImageResource(R.drawable.map_seongdong)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("gwangJin")){
            mapIv.setImageResource(R.drawable.map_gwangjin)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("jung")){
            mapIv.setImageResource(R.drawable.map_jung)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("dongDaeMon")){
            mapIv.setImageResource(R.drawable.map_dongdaemon)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("jungRang")){
            mapIv.setImageResource(R.drawable.map_jungrang)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("ennPyung")){
            mapIv.setImageResource(R.drawable.map_ennpyung)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("jongRo")){
            mapIv.setImageResource(R.drawable.map_jongro)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("seongBuk")){
            mapIv.setImageResource(R.drawable.map_seongbuk)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("gangBuk")){
            mapIv.setImageResource(R.drawable.map_gangbuk)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("doBong")){
            mapIv.setImageResource(R.drawable.map_dobong)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }
        else if (guName.equals("noWon")){
            mapIv.setImageResource(R.drawable.map_nowon)
            adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
            adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
            dongRecyclerView.adapter = adapter

        }



    }
}