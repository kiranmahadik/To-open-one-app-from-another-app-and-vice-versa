package in.kiran.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button mBtnOpenAppTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mBtnOpenAppTwo = findViewById(R.id.btnOpenAppTwo);

        mBtnOpenAppTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = getPackageManager().getLaunchIntentForPackage("in.kiran.apptwo");
                startActivity(intent1);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
