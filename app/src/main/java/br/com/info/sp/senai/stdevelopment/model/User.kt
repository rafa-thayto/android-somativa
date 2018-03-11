package br.com.info.sp.senai.stdevelopment.model

/**
 * Created by Rafael on 10/03/2018.
 */
class User {

    var id: Long = 0
    var name: String = ""
    var email: String = ""
    var password: String = ""

    constructor (name: String, email: String, password: String) {
        this.name = name
        this.email = email
        this.password = password
    }
}