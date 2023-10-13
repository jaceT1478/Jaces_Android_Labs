package algonquin_cst2355.toul0023



import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tAG = "MainActivity"
        Log.d( tAG, "Message")
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" )

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener { clk: View? -> }
        val nextPage = Intent(this@MainActivity, SecondActivity::class.java)

    }



    override fun onStart() {
        super.onStart()
        Log.w("MainActivity", "In onStart() - The application is now visible on screen.")
    }

    override fun onPause() {
        super.onPause()
        Log.w("MainActivity" , " In onPause()- The application no longer responds to user input")
    }

    override fun onResume() {
        super.onResume()
        Log.w("MainActivity" , "In onResume - The application is now responding to user input" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MainActivity" , "In onDestroy() - Any memory used by the application is freed.")
    }

    override fun onStop(){
        super.onStop()
        Log.w("MainActivity" , "In onStop() - The application is no longer visible.")
    }

    override fun startActivity(intent: Intent?) {
        super.startActivity(Intent())
    }

}
