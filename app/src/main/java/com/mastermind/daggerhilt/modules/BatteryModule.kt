package com.mastermind.daggerhilt.modules

import com.mastermind.daggerhilt.model.Battery
import com.mastermind.daggerhilt.model.Cobalt
import com.mastermind.daggerhilt.model.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BatteryModule {

    @Provides
    fun getCobalt():Cobalt{
        return Cobalt()
    }

    @Provides
    fun getLithium(): Lithium {
        val lithium = Lithium()
        lithium.test()
        return lithium
    }

    @Provides
    fun getBattery(cobalt : Cobalt,lithium : Lithium ):Battery{
        return Battery(cobalt,lithium)
    }

}