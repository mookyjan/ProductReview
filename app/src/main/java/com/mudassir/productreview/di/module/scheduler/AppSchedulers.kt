package com.mudassir.productreview.di.module.scheduler

import com.mudassir.domain.SchedulerProvider
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers

class AppSchedulers : SchedulerProvider {

    override val subscribeOn: Scheduler
        get() = Schedulers.io()
    override val observeOn: Scheduler
        get() = AndroidSchedulers.mainThread()
    override val newThread: Scheduler
        get() = Schedulers.newThread()
}