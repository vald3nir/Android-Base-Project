package com.vald3nir.appName.data.repository.remote.auth

import android.app.Activity
import android.content.Context
import com.vald3nir.appName.data.dtos.ClientDTO
import com.vald3nir.appName.data.dtos.LoginDTO

interface AuthRepository {

    suspend fun login(
        activity: Activity,
        loginDTO: LoginDTO,
        onSuccess: () -> Unit,
        onError: (e: Exception?) -> Unit,
    )

    suspend fun loadLoginData(context: Context?): LoginDTO?

    suspend fun saveLoginData(context: Context?, loginDTO: LoginDTO)

    suspend fun registerNewUser(
        activity: Activity,
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onError: (e: Exception?) -> Unit,
    )

    suspend fun registerClient(
        activity: Activity,
        clientDTO: ClientDTO,
        onSuccess: () -> Unit,
        onError: (e: Exception?) -> Unit,
    )
}