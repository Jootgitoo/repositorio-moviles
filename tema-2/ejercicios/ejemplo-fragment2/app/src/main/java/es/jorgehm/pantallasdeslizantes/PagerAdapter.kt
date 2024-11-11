package es.jorgehm.pantallasdeslizantes

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> { FirstFragment() }
            1 -> { SecondFragment() }
            1 -> { ThirdFragment() }
            else -> { throw Resources.NotFoundException("Position not found")}
        }
    }
}