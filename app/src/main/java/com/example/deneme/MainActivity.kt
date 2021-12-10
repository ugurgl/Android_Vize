package com.example.deneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseBooleanArray
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_ekle = findViewById(R.id.btn_ekle) as Button
        val clean = findViewById(R.id.btn_temizle) as Button
        val textView = findViewById(R.id.txt_yazi) as EditText
        val listView = findViewById(R.id.liste)as ListView
        val delete = findViewById(R.id.btn_sil)as Button


        var itemlist= arrayListOf<String>()
        var adapter = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_multiple_choice, itemlist )

       btn_ekle.setOnClickListener{

           itemlist.add(textView.text.toString())
           listView.adapter=adapter
           adapter.notifyDataSetChanged()
           textView.clearComposingText()
       }
        clean.setOnClickListener{
            itemlist.clear()
            adapter.notifyDataSetChanged()
        }
        /*listView.setOnItemClickListener { adapterView, view, i,  l-> android.widget.Toast.makeText(this,
            "Seçimin: "+itemlist.get(i),android.widget.Toast.LENGTH_SHORT).show()
        }*/

        /*delete.setOnClickListener {
            val position: SparseBooleanArray = listView.checkedItemPositions
            val count = listView.count
            var item = count -1
            while (item>=0){
                if (position.get(item)){
                    adapter.remove(itemlist.get(item))
                }
                item --
            }
            position.clear()
            adapter.notifyDataSetChanged()

        }*/







    }
}