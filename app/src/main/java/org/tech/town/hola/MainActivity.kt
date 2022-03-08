package org.tech.town.hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //메인화면 랭킹 viewpager
        val fragmentList = listOf(PopularAreaFragment(),  SampleFragment())

        val pagerAdapter = ViewPagerAdapter(fragmentList, this)
        viewPager.adapter = pagerAdapter

    }
}