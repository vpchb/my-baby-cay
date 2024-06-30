package com.example.inventory.data

import java.util.concurrent.Flow

class OfflineItemsRepository(private val itemDao: ItemDao) : ItemsRepository {

    override fun getAllItemsStream(): List<List<Item>> = itemDao.getAllItems()

    override fun getItemStream(id:Int): List<Item?> = itemDao.getItem(id)

    override suspend fun insertItem(item: Item) = itemDao.insert(item)

    override suspend fun deleteItem(item: Item) = itemDao.delete(item)

    override suspend fun updateItem(item: Item) = itemDao.update(item)


}