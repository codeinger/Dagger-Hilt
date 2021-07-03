package com.mastermind.daggerhilt.modules

import com.mastermind.daggerhilt.model.Processor
import com.mastermind.daggerhilt.model.Snapdragon
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    fun getProcessor(snapdragon: Snapdragon): Processor = snapdragon

    @Provides
    @Named("Core")
    fun getCore() = 8

    @Provides
    @Named("ClockSpeed")
    fun getClockSpeed() = 3

}