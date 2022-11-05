package com.davit.encrypefilesecurity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.davit.encrypesecurityfile.EncryptKey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EncryptKey(this,"data.txt").writeEncrypt("my secret")

        /**
         * for read file from encrypt
         * */
        /*EncryptKey(this,"data.txt").readEncrypt()*/
    }
}