package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_pantalla1.*

class pantalla1 : AppCompatActivity() {
    val TAG = "MyMessage"
    /*private lateinit var oficios : MutableList<String>
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla1)
        oficios = mutableListOf ()
        database = FirebaseDatabase.getInstance().getReference("comentario")

        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = Adapteritem (applicationContext, oficios)


    }*/

    private lateinit var database: DatabaseReference
    val animals : ArrayList <String> = ArrayList ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla1)
        addAnimals ()
        database = FirebaseDatabase.getInstance().getReference("comentario")
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = Adapteritem ( animals , this )
    }


    private fun leer () {
        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val post = dataSnapshot.getValue(Comi::class.java)

            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException())

            }
        }

        database.addValueEventListener(postListener)
        //postReference.addValueEventListener(postListener)
    }

    fun addAnimals() {

    }


}
