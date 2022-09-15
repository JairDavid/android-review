package com.example.practice_design.domain

import java.io.Serializable

data class Person(var name:String, var lastName:String, var address:String, var zip: String, var pic:String): Serializable {
}