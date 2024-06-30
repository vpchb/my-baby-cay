package com.example.inventory.data

import android.content.Context

interface AppContainer {
    val itemsRepository: ItemsRepository
}
/**
 * [AppContonier] implementation that provides instance of [offlineItemsRepository]
 */


class  AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implemetation for [ItemsRepository]
     */

    override val itemsRepository: ItemsRepository by lazy {
        OfflineItemsRepository(InventoryDatabase.getDatabase(context).itemDao())
    }
}