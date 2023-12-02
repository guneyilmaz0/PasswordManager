package net.swade.passwordmanager

import net.guneyilmaz0.mongos.MongoSObject

data class PasswordData (
    val website: String,
    val nickname: String,
    val password: String,
    val category: Category
) : MongoSObject()

enum class Category(val value: String){
    SOCIAL("Social"),
    EMAIL("Email"),
    FINANCE("Finance"),
    ENTERTAINMENT("Entertainment"),
    OTHER("Other");

    companion object{
        fun getByValue(value: String): Category{
            return entries.first { it.value == value }
        }
    }
}