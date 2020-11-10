package com.safcsp.foodstation.Client

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "BottomNavigationF"

class BottomNavigationFragment: Fragment() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_navigation_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bottomNavigationView = view.findViewById(R.id.bottom_navigation)
    }

    override fun onStart() {
        super.onStart()

        bottomNavigationView.setOnNavigationItemSelectedListener {when(it.itemId){
            R.id.page_1 -> Log.d(TAG, "page 1")
            R.id.page_2 -> Log.d(TAG, "page 2")
            R.id.page_3 -> Log.d(TAG, "page 3")
            R.id.page_4 -> Log.d(TAG, "page 4")
            else -> Log.d(TAG, "nothing")
        }
            true
        }
    }
}