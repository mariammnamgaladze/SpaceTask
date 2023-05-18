package com.example.spacetask

import com.example.spacetask.data.Citizen
import com.example.spacetask.data.Entrepreneur
import com.example.spacetask.data.Political

class Bank {
    var bankCommision: Float = 0.0f

    fun transferFee(user: Any) {
        when (user) {
            is Entrepreneur -> {
                val fee = user.income * 0.1f
                user.balance -= fee
                bankCommision += fee
            }
            is Political -> {
                val fee = user.income * 0.2f
                user.balance -= fee
                bankCommision += fee
            }
        }
    }

    fun monthlyFee(users:List<Any>){
        users.forEach{
            when(it){
                is Citizen ->{
                    val fee = it.income * 0.2f
                    it.balance -= fee
                    bankCommision += fee
                }
                is Entrepreneur -> {
                    val fee = it.income * 0.4f
                    it.balance -= fee
                    bankCommision += fee
                }
                is Political -> {
                    val fee = it.income * 0.6f
                    it.balance -= fee
                    bankCommision += fee
                }

            }
        }
    }
}


