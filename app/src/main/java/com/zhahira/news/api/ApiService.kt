package com.zhahira.news.api

import com.zhahira.news.models.LoginRequest
import com.zhahira.news.models.LoginResponse
import com.zhahira.news.models.RegisterRequest
import com.zhahira.news.models.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("api_basic/register.php")
    fun register(
        @Field("username") username:String,
        @Field("password") password:String,
        @Field("fullname") fullname:String,
        @Field("email") email:String,
    ): Call<RegisterResponse>

    @FormUrlEncoded
    @POST("api_basic/login.php")
    fun login(
        @Field("username") username: String,
        @Field("password") password: String,
    ): Call<LoginResponse>
}