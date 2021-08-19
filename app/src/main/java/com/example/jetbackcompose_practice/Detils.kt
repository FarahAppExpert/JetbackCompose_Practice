package com.example.jetbackcompose_practice

class Detils (var FullName : String, var Age : String, var Phone : String)
{
   lateinit var fullname_ : String
    lateinit var age_ : String
    lateinit var phone_ : String

    init {
        this.fullname_ = FullName
        this.age_ = Age
        this.phone_ = Phone
    }
}