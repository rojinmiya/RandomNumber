package com.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnFirst, btnSecond;
    private TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand=new Random();
        int rand_int1=rand.nextInt(50);
        int rand_int2=rand.nextInt(50);


        btnFirst=(Button) findViewById(R.id.btnFirst);
        btnSecond=(Button) findViewById(R.id.btnSecond);
        tvOutput=(TextView) findViewById(R.id.tvOutput);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });



    }
}
