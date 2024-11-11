package es.jorgehm.pantallasdeslizantes

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import es.jorgehm.pantallasdeslizantes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager =  findViewById(R.id.viewPager)

        viewPager.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager){ tab, index ->
            tab.text = when(index){
                0 -> {"First"}
                1 -> {"Second"}
                2 -> {"Third"}
                else -> { throw Resources.NotFoundException("Positions not found")}
            }
        }.attach()

    }
}