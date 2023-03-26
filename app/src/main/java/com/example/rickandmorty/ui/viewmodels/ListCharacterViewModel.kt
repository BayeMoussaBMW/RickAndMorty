package com.example.rickandmorty.ui.viewmodels

import androidx.lifecycle.*
import com.example.rickandmorty.api.NetworkServices
import com.example.rickandmorty.db.ResultDao
import com.example.rickandmorty.model.Result
import kotlinx.coroutines.launch

class ListCharacterViewModel(
    private val networkServices: NetworkServices,
    private val resultDao: ResultDao
) : ViewModel() {
    private var _data = MutableLiveData<List<Result>>()

    val data: LiveData<List<Result>?>
        get() = _data

    private var _character = MutableLiveData<Result>()

    val dataList: LiveData<List<Result>> = resultDao.getResults().asLiveData()

    val character: LiveData<Result>
        get() = _character

    fun insertList(list: List<Result>){
            insertData(list)
    }

    private fun insertData(list: List<Result>) {
        viewModelScope.launch {
            resultDao.insert(list)
        }
    }

    fun getCharacters(): List<Result>? {
        viewModelScope.launch {
            val data = networkServices.proceedGetAllCharacters().characters
            _data.value = data
        }
        return data.value
    }
}

class ListCharacterViewModelFactory(
    private val networkServices: NetworkServices,
    private val resultDao: ResultDao
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListCharacterViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ListCharacterViewModel(networkServices, resultDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}