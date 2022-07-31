package com.arfinrahmat.demo.user.database

import com.mongodb.client.MongoClient
import org.litote.kmongo.KMongo
import org.springframework.stereotype.Component

@Component
class DatabaseComponent {
    companion object {
        private const val DB_URL = "mongodb+srv://arfinrahmat:Ocem1945@cluster0.uk5vk.mongodb.net/?retryWrites=true&w=majority"
    }

    val database: MongoClient = KMongo.createClient(DB_URL)
}