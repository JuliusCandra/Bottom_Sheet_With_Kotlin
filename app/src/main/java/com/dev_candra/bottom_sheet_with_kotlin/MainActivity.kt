package com.dev_candra.bottom_sheet_with_kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Aksi()
    }

    private fun Aksi(){
        val inflate = layoutInflater.inflate(R.layout.bottom_sheet_layout,null)
        val message = "082311558341"
        val bottomSheat = BottomSheetDialog(this)
        bottomSheat.setContentView(inflate)
        button1.setOnClickListener {
            bottomSheat.show()
        }
        view1(inflate,message)
        initialActionBar()

    }

    private fun makeToast(message: String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    private fun view1(view: View,message: String){
        view.teksCall.setOnClickListener {
            makeToast("Memanggil")
            val intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:$message"))
            startActivity(intent)
        }
        view.teks_share.setOnClickListener {
            makeToast("Share")
        }
        view.teksCall1.setOnClickListener {
            makeToast("Memanggil")
        }
        view.teksCall2.setOnClickListener {
            makeToast("Memanggil")
        }
        view.teks_share1.setOnClickListener {
            makeToast("Share")
        }
    }

    private fun initialActionBar(){
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.title = "Candra Julius Sinaga"
            actionBar.subtitle = "Contoh Bottom Sheet Dialog"
        }
    }
}
