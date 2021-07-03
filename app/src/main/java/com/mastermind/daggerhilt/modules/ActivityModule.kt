package com.mastermind.daggerhilt.modules

import com.mastermind.daggerhilt.model.Battery
import com.mastermind.daggerhilt.model.Cobalt
import com.mastermind.daggerhilt.model.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {


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

    @ActivityScoped
    @Provides
    fun getBattery(cobalt : Cobalt,lithium : Lithium ):Battery{
        return Battery(cobalt,lithium)
    }

}