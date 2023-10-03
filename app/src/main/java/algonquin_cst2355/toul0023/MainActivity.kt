package algonquin_cst2355.toul0023

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var imgView: ImageView
    lateinit var sw: Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgView = findViewById(R.id.imageView3);
        sw = findViewById(R.id.switch1);

        sw.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { btn: CompoundButton?, isChecked: Boolean ->

            if (isChecked) {
                val rotate = RotateAnimation(
                    0f,
                    360f,
                    Animation.RELATIVE_TO_SELF,
                    0.5f,
                    Animation.RELATIVE_TO_SELF,
                    0.5f
                )
                rotate.duration = 5000
                rotate.repeatCount = Animation.INFINITE
                rotate.interpolator = LinearInterpolator()
                imgView.startAnimation(rotate)

            }

            else {
                imgView.clearAnimation();
            }
        })


    }
}