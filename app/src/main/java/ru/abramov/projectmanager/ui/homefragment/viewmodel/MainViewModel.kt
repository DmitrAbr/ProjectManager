package ru.abramov.projectmanager.ui.homefragment.viewmodel

import androidx.lifecycle.ViewModel
import ru.abramov.projectmanager.ui.homefragment.repository.MainRepository

class MainViewModel(val repository: MainRepository):ViewModel() {

    constructor():this(MainRepository())

    fun loadData() = repository.items

}