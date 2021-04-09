package com.soogil.example

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        addNumber(1,3);
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun addNumber(a:Int, b:Int, c:Int = 30) = println(a+b+c)

    private fun whenTest(anyType:Any) {
        when(anyType) {
            "string" -> println(anyType)
            is Int -> println(anyType)
            else -> print("else 구문입니다.")
        }


//        val result = when(anyType) {
//            "string" -> anyType
//            is Int -> anyType.toString()
//            else -> "else 구문입니다."
//        }
//
//        return result
    }

    private fun forAndWhileTest() {
        for(i in 'a'..'z') {
            println(i)
        }
        for (i in 1..9) {
            println(i)
        }
        for (i in 9 downTo 1) {
            println(i)
        }
        for (i in 0..9 step 3) {
            println(i)
        }

        var i = 0
        do { // do while 은 한번은 꼭 실행됨
            print(i++)
        } while(i < 5)
    }
}