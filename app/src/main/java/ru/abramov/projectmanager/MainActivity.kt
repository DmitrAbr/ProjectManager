package ru.abramov.projectmanager

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.abramov.projectmanager.ui.homefragment.HomeFragment

class MainActivity : AppCompatActivity(){

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var FAB: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FAB = findViewById(R.id.floatBtnAdd)
        setStatusBarColor(getColor(R.color.black))
        bottomNavigationView = findViewById(R.id.bottomNavView)
        val navController = findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navController)

        bottomNavigationView.menu.getItem(2).setEnabled(false)
        bottomNavigationView.background = null



    }


    fun onClickToAddProject(view: View){
        val intent = Intent(this, AddProjectActivity::class.java)
        startActivity(intent)
    }

    private fun setStatusBarColor(color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = color
        }
    }


}
