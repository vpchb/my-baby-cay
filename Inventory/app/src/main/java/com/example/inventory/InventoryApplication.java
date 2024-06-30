package com.example.inventory;

class InventoryApplication : Application(){
    lateinit var container: AppContainer


    override fun onCreate(){
        super.onCreate()
        container = AppDataContainer(this)
        }
    }

