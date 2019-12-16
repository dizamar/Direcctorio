package com.example.prueba


import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
class Comi {
    var name: String? = null

    constructor() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    constructor(username: String?) {
        this.name = username

    }
}
