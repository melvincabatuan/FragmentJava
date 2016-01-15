package ph.edu.dlsu.hellofragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFragment myFragment = new MyFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, myFragment)
                .commit();
    }
}