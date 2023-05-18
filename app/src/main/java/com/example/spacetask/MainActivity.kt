package com.example.spacetask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spacetask.data.Citizen
import com.example.spacetask.data.Entrepreneur
import com.example.spacetask.data.Political

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main() {
    val bank = Bank()
    val citizen = Citizen(
        "Mariam Namgaladze",
        100f,
        100f,
        "Georgian"
    )
    val political = Political(
        "Barak Obama",
        100f,
        100f,
        "Democratic"
    )
    val entrepreneur = Entrepreneur(
        "Elon Musk",
        100f,
        100f,
        "TESLA"
    )
    bank.transferFee(political)
    bank.transferFee(citizen)
    bank.transferFee(entrepreneur)
    bank.monthlyFee(listOf(political, citizen, entrepreneur))
    println("Citizen's balance after trans ${citizen.balance}")
    println("Politician's balance after trans ${political.balance}")
    println("Entrepreneur's balance after trans ${entrepreneur.balance}")
    println("total income for bank ${bank.bankCommision}")
}

