package com.example.andreymoney2.data.repository

import com.example.andreymoney2.data.remote.service.RemoteService

class AppRepository (private val remoteService: RemoteService) {
    suspend fun test() {
        val test = remoteService.getLatestVaults()
        println(test)
    }
}