package xyz.tanishq.madhousecolorsanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class linker extends AppCompatActivity {
    Button practice;
    Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linker);
        practice = (Button) findViewById(R.id.practice);
        test = (Button) findViewById(R.id.test);
        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(linker.this,MainActivity.class);
                startActivity(intent);
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(linker.this,test.class);
                startActivity(intent);
            }
        });
    }
}
