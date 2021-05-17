package com.mudassir.domain

import io.reactivex.rxjava3.core.Scheduler

interface SchedulerProvider {
    val subscribeOn: Scheduler
    val observeOn: Scheduler
    val newThread: Scheduler
}