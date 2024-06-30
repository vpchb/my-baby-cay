package com.example.inventory.data

import java.util.concurrent.Flow

/**
 *
 */
interface ItemsRepository {
    /**
     *
     */
    fun getAllItemsStream(): List<List<Item>>

    /**
     *
     */
    fun getItemStream(id: Int): List<Item?>
    /**
     *
     */
    suspend fun insertItem(item: Item)
    /**
     *
     */
    suspend fun deleteItem(item: Item)
    /**
     *
     */
    suspend fun updateItem(item: Item)
}