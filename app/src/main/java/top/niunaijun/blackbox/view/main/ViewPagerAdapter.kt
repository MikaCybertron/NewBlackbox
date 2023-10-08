package top.niunaijun.blackbox.view.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import top.niunaijun.blackbox.view.apps.AppsFragment

class ViewPagerAdapter(appCompatActivity: AppCompatActivity) : FragmentStateAdapter(appCompatActivity) {
    private var fragmentList = mutableListOf<AppsFragment>()

    fun replaceData(list: MutableList<AppsFragment>) {
        this.fragmentList = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}