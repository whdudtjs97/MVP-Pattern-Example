package com.example.mvppattern.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvppattern.databinding.ActivityMainBinding
import com.example.mvppattern.presenter.Presenter
import com.example.mvppattern.presenter.PresenterImpl

class MainActivity : AppCompatActivity() , Presenter.View{

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
   private val presenter by lazy { PresenterImpl(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            presenter.increase()
        }

        binding.button2.setOnClickListener{
            presenter.discrease()
        }
    }

    override fun show(data: Int) {
        binding.textview2.text = "$data"
    }
}