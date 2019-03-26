package xyz.tanishq.madhousecolorsanimals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import xyz.tanishq.madhousecolorsanimals.R;

public class game extends AppCompatActivity {
    ImageView curView = null;
    private int countPair = 0;
    final int[] drawable = new int[] {
            R.drawable.sample_0,
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_6,
            R.drawable.sample_7
    };
    int[] pos = {0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
    int currentPos = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageAdapter imageAdapter = new ImageAdapter(this);
        GridView gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(imageAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (currentPos < 0 ) {
                    currentPos = position;
                    curView = (ImageView) view;
                    ((ImageView) view).setImageResource(drawable[pos[position]]);
                }
                else {
                    if (currentPos == position) {
                        ((ImageView) view).setImageResource(R.drawable.hidden);
                    } else if (pos[currentPos] != pos[position]) {
                        curView.setImageResource(R.drawable.hidden);
                        Toast.makeText(game.this, "Not Match!", Toast.LENGTH_LONG).show();
                    } else {
                        ((ImageView) view).setImageResource(drawable[pos[position]]);
                        countPair++;
                        if (countPair == 8) {
                            Toast.makeText(game.this, "You Win!", Toast.LENGTH_LONG).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}

