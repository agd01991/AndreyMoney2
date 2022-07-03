package com.example.andreymoney2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.andreymoney2.viwemodel.AppViweModel
import com.example.andreymoney2.viwemodel.VaultViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: AppViweModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var repository = (application as MainApplication).repository
        mainViewModel = ViewModelProvider(this, VaultViewModelFactory(repository)).get(AppViweModel::class.java)

        setContentView(binding.root)

    }
}