package com.mudassir.domain

import io.reactivex.rxjava3.core.Single

abstract class SingleUseCase<in Params,T> protected constructor(private val schedulers:SchedulerProvider) {

    abstract fun buildUseCaseObservable(params: Params?): Single<T>

    fun execute(params: Params?=null) : Single<T> {
        val observable = this.buildUseCaseObservable(params)
            .subscribeOn(schedulers.subscribeOn)
            .observeOn(schedulers.observeOn)
        return observable
    }

}