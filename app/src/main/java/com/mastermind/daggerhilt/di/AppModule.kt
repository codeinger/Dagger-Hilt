package com.mastermind.daggerhilt.di

import android.content.Context
import androidx.room.Room
import com.mastermind.daggerhilt.data.room.MyRoomDB
import com.mastermind.daggerhilt.data.room.dao.PostDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getDbName() : String = "RoomDb"

    @Singleton
    @Provides
    fun getRoomDb(@ApplicationContext context: Context,name : String) : MyRoomDB =
        Room.databaseBuilder(context,MyRoomDB::class.java,name).build()

    @Singleton
    @Provides
    fun getPostDao(db : MyRoomDB) : PostDao = db.getPostDao()

}