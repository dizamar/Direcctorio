package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_item_cometario.*
import kotlinx.android.synthetic.main.activity_pantalla1.*
import kotlinx.android.synthetic.main.activity_perfil.*


class perfil : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    private val TAG = "Mesage"
    private lateinit var  listaComentarios: MutableList<Comi1>
    private lateinit var comentario : TextView
    private lateinit var btn_send2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
        database = FirebaseDatabase.getInstance().reference
        listaComentarios= mutableListOf()
        addchild()
        rv_perfil.layoutManager = LinearLayoutManager(this)
        rv_perfil.adapter = AdapterComentario ( listaComentarios , this)
        comentario=findViewById(R.id.txt_comentario)

        btn_send2 = findViewById(R.id.btnSend)
        btn_send2.setOnClickListener {
            val texto_com = txt_comentario.text.toString()
            val rango = rbar.toString().toDouble()
            newcommint(texto_com,rango)
            }
        }


    private fun newcommint(texto: String, calificacion: Double?) {
        val commi = Comi1(texto, calificacion)
        database.child("Categoria").setValue(commi)
    }
    private fun addchild(){

        database.addChildEventListener(object : ChildEventListener {
            override fun onChildAdded(dataSnapshot: DataSnapshot, s: String?) {

                val oficio= ArrayList<String>()
                val td = dataSnapshot.value as MutableList<Comi1>
                listaComentarios=td


                Log.d("TAG", dataSnapshot.value!!.toString())
            }

            override fun onChildChanged(dataSnapshot: DataSnapshot, s: String?) {

            }

            override fun onChildRemoved(dataSnapshot: DataSnapshot) {

            }

            override fun onChildMoved(dataSnapshot: DataSnapshot, s: String?) {

            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        })

    }

}
