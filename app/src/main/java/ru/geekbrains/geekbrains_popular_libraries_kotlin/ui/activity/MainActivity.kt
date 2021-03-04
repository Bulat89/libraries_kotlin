package ru.geekbrains.geekbrains_popular_libraries_kotlin.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.geekbrains.geekbrains_popular_libraries_kotlin.databinding.ActivityMainBinding
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.presenter.MainPresenter
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null

    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener(View.OnClickListener {
            presenter.batton1CounterClick()
        })
        vb?.btnCounter2?.setOnClickListener(View.OnClickListener {
            presenter.batton2CounterClick()
        })
        vb?.btnCounter3?.setOnClickListener(View.OnClickListener {
            presenter.batton3CounterClick()
        })

    }


    override fun setBtn_counter1Text(text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun setBtn_counter2Text(text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setBtn_counter3Text(text: String) {
        vb?.btnCounter3?.text = text
    }
}