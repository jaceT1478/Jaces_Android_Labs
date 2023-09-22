package ui

import algonquin_cst2355.toul0023.MainViewModel
import algonquin_cst2355.toul0023.databinding.ActivityMainBinding
import android.R
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    private lateinit var model: MainViewModel
    private lateinit var variableBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        model = ViewModelProvider(this).get(MainViewModel::class.java)


        val variableBinding = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(variableBinding?.getRoot())

        model.editString.observe(this, Observer { newText ->
            // Update the TextView with the new text
            variableBinding.textview.text = newText

            variableBinding.mybutton.setOnClickListener {

            }
            val logoAlgonquin = findViewById<ImageButton>(R.id.widget_frame)

            logoAlgonquin.setOnClickListener(View.OnClickListener {
                val width = it.width
                val height = it.height


                val toastMessage = "The width = $width and height = $height"
                Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_SHORT).show()
                })








    })



}}