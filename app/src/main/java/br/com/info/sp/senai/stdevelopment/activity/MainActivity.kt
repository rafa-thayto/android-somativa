package br.com.info.sp.senai.stdevelopment.activity

import android.app.Fragment
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.info.sp.senai.stdevelopment.R
import br.com.info.sp.senai.stdevelopment.fragment.ContactFragment
import br.com.info.sp.senai.stdevelopment.fragment.HistoryFragment
import br.com.info.sp.senai.stdevelopment.fragment.HomeFragment
import br.com.info.sp.senai.stdevelopment.fragment.ListFragment
import kotlinx.android.synthetic.main.activity_main.*

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
    val fragmentTransaction = beginTransaction()
    fragmentTransaction.func()
    fragmentTransaction.commit()
}

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, HomeFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_history -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, HistoryFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_contact -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ContactFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_list -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ListFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, HomeFragment())

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

//    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
//
//        fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
//                         savedInstanceState: Bundle?): View? {
//            return inflater?.inflate(R.layout.fragment_home, container, false)
//        }
//    }
}

