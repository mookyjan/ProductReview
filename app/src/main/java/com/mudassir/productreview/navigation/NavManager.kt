package com.mudassir.productreview.navigation

import androidx.navigation.NavArgs
import androidx.navigation.NavDirections

class NavManager {
    private var navEventListener: ((navDirections: NavDirections) -> Unit)? = null

    private var navPopBackStactListener :((isPopInclusive: Boolean)->Unit)?= null

    private var argsEventListener: (() -> NavArgs?)? = null

    fun getArgs(): NavArgs? = argsEventListener?.invoke()

    fun navigate(navDirections: NavDirections) {
        navEventListener?.invoke(navDirections)
    }

    fun setOnNavEvent(navEventListener: (navDirections: NavDirections) -> Unit) {
        this.navEventListener = navEventListener
    }

    fun setArgsEvent(eventListener: () -> NavArgs?) {
        this.argsEventListener = eventListener
    }


    fun pobBackStack(boolean: Boolean){
        navPopBackStactListener?.invoke(boolean)
    }

    fun popBackStack(navPopBackStactListener: (isPopInclusive: Boolean)->Unit){
        this.navPopBackStactListener =navPopBackStactListener
    }
}