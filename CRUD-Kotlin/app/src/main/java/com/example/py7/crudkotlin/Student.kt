package com.example.py7.crudkotlin

class Student {

    var id: Int? = null
    var name: String? = null
    var college: String? = null
    var rollno: String? = null

    constructor(id: Int, name: String, college: String, rollno:String){
        this.id = id
        this.name = name
        this.college = college
        this.rollno = rollno
    }
}