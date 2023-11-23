package com.teameetmeet.meetmeet.data.network.api

import com.teameetmeet.meetmeet.data.network.entity.LoginResponse
import com.teameetmeet.meetmeet.data.network.entity.RefreshAccessTokenRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("auth/refresh")
    fun refreshAccessToken(@Body refreshAccessTokenRequest: RefreshAccessTokenRequest): LoginResponse
}