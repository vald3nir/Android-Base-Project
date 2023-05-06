package com.vald3nir.appName.presentation.auth

import android.os.Bundle
import com.vald3nir.R
import com.vald3nir.appName.domain.common.view.BaseActivity

class AuthActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}