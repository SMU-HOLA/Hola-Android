package org.tech.town.hola

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val fragments:List<Fragment>,fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return fragments.size
    } //프래그먼트 배열의 크기


    override fun createFragment(position: Int): Fragment {
        return fragments[position] //반활될 프래그먼트
    }

}