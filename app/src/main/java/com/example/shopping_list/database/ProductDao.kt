package com.example.shopping_list.database

import androidx.room.*
import com.example.shopping_list.model.Product


@Dao
interface ProductDao {

    @Query("SELECT * FROM product_table")
    suspend fun getAllProducts(): List<Product>

    @Insert
    suspend fun insertProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("DELETE FROM product_table")
    suspend fun deleteAllProducts()

}
