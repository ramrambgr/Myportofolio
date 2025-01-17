package com.example.projectpenelitian.di

import android.content.Context
import com.example.projectpenelitian.data.UserRepository
import com.example.projectpenelitian.data.pref.UserPreference
import com.example.projectpenelitian.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}