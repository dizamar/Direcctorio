package com.example.prueba

/*import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class pantalla1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla1)}
}*/
/*import android.content.Context import android.net.Uri
import android.os.Bundle import android.support.v4.app.Fragment
//import android.support.v7.widget.LinearLayoutManager
//import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions

//import com.fish.isyania.aplikasipemesananreparasi.R
//import com.fish.isyania.aplikasipemesananreparasi.model.Promo
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
/*import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.diskon_row.view.*
import kotlinx.android.synthetic.main.diskon_row.view.promoImage*/


class HomeFragment : Fragment() {
    lateinit var mRecyclerView: RecyclerView
    lateinit var mDatabase: DatabaseReference
    lateinit var options : FirebaseRecyclerOptions<Comi>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.activity_pantalla1, container, false)

        mDatabase = FirebaseDatabase.getInstance().getReference("categoria")
        mRecyclerView = rootView.findViewById(R.id.rv_list)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.setLayoutManager(LinearLayoutManager(context))

        logRecyclerView()

        return rootView
    }

    override fun onStart() {
        super.onStart()
    }

    private fun logRecyclerView() {
        var FirebaseRecyclerAdapter = object : FirebaseRecyclerAdapter<Promo, PromoViewHolder>(options){
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromoViewHolder {

                var view: View = LayoutInflater.from(context)
                    .inflate(R.layout.activity_item_cometario, parent, false)

                return PromoViewHolder(view)
            }

            override fun onBindViewHolder(holder: PromoViewHolder, position: Int, model: Promo) {
                Picasso.with(context).load(model!!.image).into(holder!!.itemView.rootView.promoImage)
            }

//            override fun populateViewHolder(viewHolder: PromoViewHolder?, model: Promo?, position: Int) { //                //viewHolder??.itemView.userName.setText(model.name) //                Picasso.with(context).load(model!!.image).into(viewHolder!!.itemView.rootView.promoImage) //            }

        }
        mRecyclerView.adapter = FirebaseRecyclerAdapter
    }


    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }

    class PromoViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){

    } }
*/