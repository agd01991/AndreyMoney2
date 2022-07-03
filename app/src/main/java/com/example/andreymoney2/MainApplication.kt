package com.example.andreymoney2

import android.app.Application
import com.example.andreymoney2.data.remote.RemoteDataSource
import com.example.andreymoney2.data.remote.service.RemoteService
import com.example.andreymoney2.data.repository.AppRepository

class MainApplication : Application() {
    lateinit var repository: AppRepository
    override fun onCreate() {
        super.onCreate()

        val remoteService = RemoteDataSource.getInstance().create(RemoteService::class.java)
        repository = AppRepository(remoteService)
    }
}