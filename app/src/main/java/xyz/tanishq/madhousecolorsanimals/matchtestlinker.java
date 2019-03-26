package xyz.tanishq.madhousecolorsanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class matchtestlinker extends AppCompatActivity {
    Button testpractice;
    Button game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchtestlinker);

        testpractice = (Button)findViewById(R.id.testpractice);
        game = (Button)findViewById(R.id.game);

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(matchtestlinker.this,game.class);
                startActivity(intent);
            }
        });
        testpractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(matchtestlinker.this,linker.class);
                startActivity(intent);
            }
        });
    }
}
