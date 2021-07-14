package com.mastermind.daggerhilt.di

import com.mastermind.daggerhilt.data.PostRequest
import com.mastermind.daggerhilt.utils.NetworkConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getBaseUrl(): String = NetworkConstants.BASE_URL


    @Singleton
    @Provides
    fun getRetrofit(baseUrl: String): Retrofit =
        Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
            .build()


    @Singleton
    @Provides
    fun getPostRequest(retrofit: Retrofit): PostRequest = retrofit.create(PostRequest::class.java)


}