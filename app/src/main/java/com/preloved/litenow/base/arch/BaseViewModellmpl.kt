package com.preloved.litenow.base.arch

import android.util.Log
import androidx.lifecycle.ViewModel

open class BaseViewModellmpl: ViewModel(), BaseContract.BaseViewModel {
    override fun logResponse(msg: String?) {
        Log.d(BaseViewModellmpl::class.java.simpleName, msg.orEmpty())
    }
}