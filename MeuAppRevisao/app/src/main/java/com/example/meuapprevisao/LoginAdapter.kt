package com.example.meuapprevisao

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class LoginAdapter (private val frags : List<Fragment>,
                    private val titles : List<String>,
                    manager: FragmentManager): FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    // retorna quantas Tabs vou ter
    override fun getCount() = frags.size

    // determina qual fragmentt voltará em casa posição
    override fun getItem(position: Int) = frags[position]

    // determina qual texto vai em cada Tab
    override fun getPageTitle(position: Int) = titles[position]

}