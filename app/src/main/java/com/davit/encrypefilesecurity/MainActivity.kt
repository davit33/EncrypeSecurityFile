package com.davit.encrypefilesecurity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.davit.encrypesecurityfile.EncryptKey
import com.davit.encrypesecurityfile.EncryptString

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //EncryptKey(this,"data.txt").writeEncrypt("my secret")

        /**
         * for read file from encrypt
         * */
        /*EncryptKey(this,"data.txt").readEncrypt()*/

        // Usage example
        val plainText = "Hello, World!"
        val password = "mySecretPassword"

        val encryptedText = EncryptString().encrypt(plainText, password)
        println("Encrypted: $encryptedText")
        Log.e("test", "Encrypted:  $encryptedText")

        val decryptedText = EncryptString().decrypt(encryptedText, password)
        Log.e("test","Decrypted: $decryptedText")
    }
}