package algonquin_cst2355.toul0023;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity<val> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button Number = findViewById(R.id.Number); // Replace 'yourButtonId' with the actual ID of your button
        Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    }
    ActivityResultLauncher<Intent> cameraResult = registerForActivityResult( new ActivityResultContracts.StartActivityForResult(),new ActivityResultCallback<ActivityResult>() {

        @Override

        public void onActivityResult(ActivityResult result) {

            if (result.getResultCode() == Activity.RESULT_OK) {

                Intent data = null;
                data = result.getData();
                Bitmap thumbnail = data.getParcelableExtra("data");

                ImageView profileImage = null;
                profileImage.setImageBitmap(thumbnail);

            }

        }

    } );

}