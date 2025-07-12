//package org.example.project
//
//
//import org.bson.Document
//import com.mongodb.ConnectionString
//import com.mongodb.MongoClientSettings
//import com.mongodb.ServerApi
//import com.mongodb.ServerApiVersion
//import com.mongodb.client.MongoClient
//import com.mongodb.kotlin.client.coroutine.MongoClient
//import kotlinx.coroutines.runBlocking
//import java.lang.System.getenv
//import java.sql.DriverManager.println
//
//
//object MongoClientConnectionExample {
//    private var username = "default";
//    private var password = "0";
//    private var routeId = "";
//    fun main() {
//        password = getenv("keypwd") ?: "default_value";
//        username = getenv("username") ?:"default_value";
//        routeId = getenv("userrouteid") ?:"default_value";
//        val user = username
//        val password = this.password
//        val connectionString = "mongodb+srv://Kipedo000:${password}@cluster0.rpmloin.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
//
//        val serverApi = ServerApi.builder()
//            .version(ServerApiVersion.V1)
//            .build()
//
//        val mongoClientSettings = MongoClientSettings.builder()
//            .applyConnectionString(ConnectionString(connectionString))
//            .serverApi(serverApi)
//            .build()
//
//        // Create a new client and connect to the server
//        MongoClient.create(mongoClientSettings).use { mongoClient ->
//            val database = mongoClient.getDatabase("admin")
//            runBlocking {
//                database.runCommand(Document("ping", 1))
//            }
//            println("Pinged your deployment. You successfully connected to MongoDB!")
//        }
//    }
//
//}
