package org.tech.town.hola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem

import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_gu_detail.*
import org.tech.town.hola.guFragment.*


class GuDetail : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout
    val adapter = DongScoreAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gu_detail)


        searchIv.setOnClickListener {
            val intent = Intent(this, GuSearch::class.java)
            startActivity(intent)
        }

        val guName = intent.getStringExtra("guName")
        if (guName.equals("gangSeo")) {
            changeFragment(GangSeoFragment())
        }
        else if(guName.equals("gangNam")){
            changeFragment(GangNamFragment())
        }
        else if(guName.equals("gangDong")){
            changeFragment(GangDongFragment())
        }
        else if (guName.equals("seoDaeMon")) {
            changeFragment(SeoDaeMonFragment())
        }
        else if (guName.equals("youngDeongPo")){
            changeFragment(YoungDeongPoFragment())

        }
        else if (guName.equals("yangCheon")){
            changeFragment(YangCheonFragment())

        }
        else if (guName.equals("guRo")){
            changeFragment(GuRoFragment())

        }

        else if (guName.equals("geumCheon")){
            changeFragment(GeumCheonFragment())

        }
        else if (guName.equals("dongJak")){
            changeFragment(DongJakFragment())

        }
        else if (guName.equals("gwanAk")){
            changeFragment(GwanAkFragment())

        }
        else if (guName.equals("seoCho")){
            changeFragment(SeoChoFragment())

        }
        else if (guName.equals("songPa")){
            changeFragment(SongPaFragment())

        }
        else if (guName.equals("gangDong")){
            changeFragment(GangDongFragment())

        }
        else if (guName.equals("maPo")){
            changeFragment(MaPoFragment())

        }
        else if (guName.equals("yongSan")){
            changeFragment(YongSanFragment())

        }
        else if (guName.equals("seongDong")){
            changeFragment(SeongDongFragment())

        }
        else if (guName.equals("gwangJin")){
            changeFragment(GwangJinFragment())

        }
        else if (guName.equals("jung")){
            changeFragment(JungFragment())
        }
        else if (guName.equals("dongDaeMon")){
            changeFragment(DongDaeMonFragment())

        }
        else if (guName.equals("jungRang")){
            changeFragment(JungRangFragment())
        }
        else if (guName.equals("ennPyung")){
            changeFragment(EnnPyungFragment())

        }
        else if (guName.equals("jongRo")){
            changeFragment(JongRoFragment())

        }
        else if (guName.equals("seongBuk")){
            changeFragment(SeongBukFragment())

        }
        else if (guName.equals("gangBuk")){
            changeFragment(GangBukFragment())

        }
        else if (guName.equals("doBong")){
            changeFragment(DoBongFragment())

        }
        else if (guName.equals("noWon")){
            changeFragment(NoWonFragment())

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
            R.id.gangSeoMenu->{
                changeFragment(GangSeoFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gangNamMenu-> {
                changeFragment(GangNamFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gangDongMenu-> {
                changeFragment(GangDongFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gangBukMenu-> {
                changeFragment(GangBukFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }

            R.id.gwanAkMenu-> {
                changeFragment(GwanAkFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.gwangJinMenu-> {
                changeFragment(GwangJinFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.guRoMenu-> {
                changeFragment(GuRoFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.geumCheonMenu-> {
                changeFragment(GeumCheonFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.noWonMenu-> {
                changeFragment(NoWonFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.doBongMenu-> {
                changeFragment(DoBongFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.dongDaeMonMenu-> {
                changeFragment(DongDaeMonFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.dongJakMenu-> {
                changeFragment(DongJakFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.maPoMenu-> {
                changeFragment(MaPoFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seoDaeMonMenu-> {
                changeFragment(SeoDaeMonFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seoChoMenu-> {
                changeFragment(SeoChoFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seongDongMenu-> {
                changeFragment(SeongDongFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.seongBukMenu-> {
                changeFragment(SeongBukFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.songPaMenu-> {
                changeFragment(SongPaFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.yangCheonMenu-> {
                changeFragment(YangCheonFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.youngDeongPoMenu-> {
                changeFragment(YoungDeongPoFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.yongSanMenu-> {
                changeFragment(YongSanFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.ennPyungMenu-> {
                changeFragment(EnnPyungFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.jongRoMenu-> {
                changeFragment(JongRoFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.jungMenu-> {
                changeFragment(JungFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
            R.id.jungRangMenu-> {
                changeFragment(JungRangFragment())
                drawerLayout.closeDrawer(Gravity.LEFT)
            }

        }
        return false
    }


    // fragment 변경 함수
    private fun changeFragment(fragment: Fragment) {
        with(supportFragmentManager.beginTransaction()) {
            replace(guDetailFrameLayout.id, fragment)
            commit()
        }
    }

}