package org.tech.town.hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_gu_detail.*



class GuDetail : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout
    val adapter = DongScoreAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gu_detail)




        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        dongRecyclerView.layoutManager = layoutManager

        val guName = intent.getStringExtra("guName")


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



        val toolbar: Toolbar = findViewById(R.id.toolbar) // toolBar를 통해 App Bar 생성
        setSupportActionBar(toolbar) // 툴바 적용

        supportActionBar?.setDisplayHomeAsUpEnabled(true) // 드로어를 꺼낼 홈 버튼 활성화
        supportActionBar?.setHomeAsUpIndicator(R.drawable.navi_menu) // 홈버튼 이미지 변경
        supportActionBar?.setDisplayShowTitleEnabled(false) // 툴바에 타이틀 안보이게

        // 네비게이션 드로어 생성
        drawerLayout = findViewById(R.id.drawer_layout)

        // 네비게이션 드로어 내에있는 화면의 이벤트를 처리하기 위해 생성
        navigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this) //navigation 리스너


    }

    // 툴바 메뉴 버튼이 클릭 됐을 때 실행하는 함수
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // 클릭한 툴바 메뉴 아이템 id 마다 다르게 실행하도록 설정
        when(item!!.itemId){
            android.R.id.home->{
                // 햄버거 버튼 클릭시 네비게이션 드로어 열기
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    // 드로어 내 아이템 클릭 이벤트 처리하는 함수
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.gangNamMenu-> {
                mapIv.setImageResource(R.drawable.map_gangnam)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gangDongMenu-> {
                mapIv.setImageResource(R.drawable.map_gangdong)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gangBukMenu-> {
                mapIv.setImageResource(R.drawable.map_gangbuk)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gangSeoMenu-> {
                mapIv.setImageResource(R.drawable.map_gangseo)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gwanAkMenu-> {
                mapIv.setImageResource(R.drawable.map_gwanak)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gwangJinMenu-> {
                mapIv.setImageResource(R.drawable.map_gwangjin)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.guRoMenu-> {
                mapIv.setImageResource(R.drawable.map_guro)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.geumCheonMenu-> {
                mapIv.setImageResource(R.drawable.map_geumcheon)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.noWonMenu-> {
                mapIv.setImageResource(R.drawable.map_nowon)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.doBongMenu-> {
                mapIv.setImageResource(R.drawable.map_dobong)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.dongDaeMonMenu-> {
                mapIv.setImageResource(R.drawable.map_dongdaemon)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.dongJakMenu-> {
                mapIv.setImageResource(R.drawable.map_dongjak)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.maPoMenu-> {
                mapIv.setImageResource(R.drawable.map_mapo)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seoDaeMonMenu-> {
                mapIv.setImageResource(R.drawable.map_seodaemon)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seoChoMenu-> {
                mapIv.setImageResource(R.drawable.map_seocho)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seongDongMenu-> {
                mapIv.setImageResource(R.drawable.map_seongdong)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seongBukMenu-> {
                mapIv.setImageResource(R.drawable.map_seongbuk)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.songPaMenu-> {
                mapIv.setImageResource(R.drawable.map_songpa)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.yangCheonMenu-> {
                mapIv.setImageResource(R.drawable.map_yangchun)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.youngDeongPoMenu-> {
                mapIv.setImageResource(R.drawable.map_youngdeongpo)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.yongSanMenu-> {
                mapIv.setImageResource(R.drawable.map_yongsan)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.ennPyungMenu-> {
                mapIv.setImageResource(R.drawable.map_ennpyung)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.jongRoMenu-> {
                mapIv.setImageResource(R.drawable.map_jongro)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.jungMenu-> {
                mapIv.setImageResource(R.drawable.map_jung)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.jungRangMenu-> {
                mapIv.setImageResource(R.drawable.map_jungrang)
                adapter.items.add(DongScore("연희동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("신촌동", 4.6, 4, 4.8, 5, 3, 2.7))
                adapter.items.add(DongScore("홍은동", 4.6, 4, 4.8, 5, 3, 2.7))
                dongRecyclerView.adapter = adapter
                drawerLayout.closeDrawer(Gravity.LEFT)
            }

        }
        return false
    }
}