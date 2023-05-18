package com.example.spacetask.data

data class Citizen(
    val name: String,
    var income: Float,
    var balance: Float,
    val citizenship: String
)
data class Entrepreneur(
    val name: String,
    var income: Float,
    var balance: Float,
    val area: String
)
data class Political(
    val name: String,
    var income: Float,
    var balance: Float,
    val politicalParty: String
)




