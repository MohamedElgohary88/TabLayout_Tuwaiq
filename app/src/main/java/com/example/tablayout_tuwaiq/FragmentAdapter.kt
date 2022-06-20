package com.example.tablayout_tuwaiq

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentManager: FragmentManager , lifecycle: Lifecycle)
    :FragmentStateAdapter(fragmentManager,lifecycle){

    val fragmentList:ArrayList<Fragment> = ArrayList()
    val fragmentTittle:ArrayList<String> = ArrayList()

    override fun getItemCount(): Int {
       return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
    fun addFragment(fragment: Fragment,tittle:String){
        fragmentList.add(fragment)
        fragmentTittle.add(tittle)
    }
}