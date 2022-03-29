package org.tech.town.hola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gu_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //메인화면 랭킹 viewpager
        val fragmentList = listOf(PopularAreaFragment(),  SampleFragment())

        val pagerAdapter = ViewPagerAdapter(fragmentList, this)
        viewPager.adapter = pagerAdapter

        //구 선택
        seoDaeMonIv.setOnClickListener {
            val guName = "seoDaeMon"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        gangSeoIv.setOnClickListener {
            val guName = "gangSeo"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        yangCheonIv.setOnClickListener {
            val guName = "yangCheon"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        guRoIv.setOnClickListener {
            val guName = "guRo"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        youngDeongPoIv.setOnClickListener {
            val guName = "youngDeongPo"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        dongJakIv.setOnClickListener {
            val guName = "dongJak"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        gwanAkIv.setOnClickListener {
            val guName = "gwanAk"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        geumCheonIv.setOnClickListener {
            val guName = "geumCheon"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        seoChoIv.setOnClickListener {
            val guName = "seoCho"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        gangNamIv.setOnClickListener {
            val guName = "gangNam"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        songPaIv.setOnClickListener {
            val guName = "songPa"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        gangDongIv.setOnClickListener {
            val guName = "songPa"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        maPoIv.setOnClickListener {
            val guName = "maPo"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        yongSanIv.setOnClickListener {
            val guName = "yongSan"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        seongDongIv.setOnClickListener {
            val guName = "seongDong"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        gwangJinIv.setOnClickListener {
            val guName = "gwangJin"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        jungIv.setOnClickListener {
            val guName = "jung"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        dongDaeMonIv.setOnClickListener {
            val guName = "dongDaeMon"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        jungRrangIv.setOnClickListener {
            val guName = "jungRang"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        ennPyungIv.setOnClickListener {
            val guName = "ennPyung"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        jongRoIv.setOnClickListener {
            val guName = "jongRo"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        seongBukIv.setOnClickListener {
            val guName = "seongBuk"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        gangBukIv.setOnClickListener {
            val guName = "gangBuk"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        doBongIv.setOnClickListener {
            val guName = "doBong"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }

        noWonIv.setOnClickListener {
            val guName = "noWon"

            val intent = Intent(this, GuDetail::class.java)
            intent.putExtra("guName", guName)
            startActivity(intent)

        }
    }
}