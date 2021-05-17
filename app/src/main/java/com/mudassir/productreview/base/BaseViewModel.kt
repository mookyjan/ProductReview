package com.mudassir.productreview.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

abstract class BaseViewModel : ViewModel() {

    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    // variable for loading progress
    val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading
    val _empty = MutableLiveData(false)
    val empty: LiveData<Boolean> = _empty
    // variable for error message
    val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error
//    val empty = ObservableBoolean(true)

    protected fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    private fun clearDisposables() {
        compositeDisposable.clear()
    }

    override fun onCleared() {
        clearDisposables()
    }

}