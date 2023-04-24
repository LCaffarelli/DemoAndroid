package com.example.demoandroid.demoNavFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demoandroid.R
import com.example.demoandroid.databinding.ActivityDemoNavigationBinding

class DemoNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Pour charger la vue en dataBinding, On utilise DataBindingUtil, on met en typage le nom autogénéré , on reprecise le context avec this, et la vue
        DataBindingUtil.setContentView<ActivityDemoNavigationBinding>(this,R.layout.activity_demo_navigation )
    }
}