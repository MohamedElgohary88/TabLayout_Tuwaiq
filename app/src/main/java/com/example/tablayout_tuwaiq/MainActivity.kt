package com.example.tablayout_tuwaiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prepareTabs()
    }

    private fun prepareTabs() {
       val fragmentAdapter = FragmentAdapter(supportFragmentManager,lifecycle)
        fragmentAdapter.addFragment(FirstFragment(),"Tab 1")
        fragmentAdapter.addFragment(SecondFragment(),"Tab 2")

        viewpager?.adapter = fragmentAdapter
        TabLayoutMediator(tablayout!!,viewpager!!){ tab,position ->
            tab.text = fragmentAdapter.fragmentTittle[position]
        }.attach()
    }

}