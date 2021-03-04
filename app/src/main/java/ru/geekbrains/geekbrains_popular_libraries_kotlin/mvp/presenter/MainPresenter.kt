package ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.presenter

import ru.geekbrains.geekbrains_popular_libraries_kotlin.R
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.CountersModel
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.view.MainView

class MainPresenter(val mainView: MainView) {
    val model = CountersModel()

    fun batton1CounterClick() {
        mainView.setBtn_counter1Text(model.next(0).toString())
    }

    fun batton2CounterClick() {
        mainView.setBtn_counter2Text(model.next(1).toString())
    }

    fun batton3CounterClick() {
        mainView.setBtn_counter3Text(model.next(2).toString())

    }
}