package com.fgihub.steph.coronadev.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fgihub.steph.coronadev.network.news.NewsApi
import com.fgihub.steph.coronadev.network.news.NewsProperty
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


enum class NewsApiStatus { LOADING, ERROR, DONE }

class HomeViewModel : ViewModel() {
    // The internal MutableLiveData String that stores the most recent response
    private val _status = MutableLiveData<NewsApiStatus>()

    // The external immutable LiveData for the response String
    val status: LiveData<NewsApiStatus>
        get() = _status

    private val _properties = MutableLiveData<List<NewsProperty>>()
    val properties: LiveData<List<NewsProperty>>
        get() = _properties

    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(
        viewModelJob + Dispatchers.Main )

    /**
     * Call getMarsRealEstateProperties() on init so we can display status immediately.
     */
    init {
        getNewsProperties()
    }

    /**
     * Sets the value of the status LiveData to the Mars API status.
     */
    private fun getNewsProperties() {
        coroutineScope.launch {
            var getPropertiesDeferred = NewsApi.retrofitService.getProperties()

            try {
                //_status.value = NewsApiStatus.LOADING
                var listResult = getPropertiesDeferred.await()
                if (listResult.size > 0) {
                    //_status.value = NewsApiStatus.DONE
                    _properties.value = listResult
                }
            } catch (e: Exception) {
                //_status.value = NewsApiStatus.ERROR
                _properties.value = ArrayList()
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}
