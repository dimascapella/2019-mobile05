package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.activities.DynamicActivity;
import polinema.ac.id.starterchapter05.activities.StaticActivity;
import polinema.ac.id.starterchapter05.activities.TugasFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickStaticFragment(View view) {
        Intent i = new Intent(this, StaticActivity.class);
        startActivity(i);
    }

    public void handlerClickDynamicFragment(View view) {
        Intent i = new Intent(this, DynamicActivity.class);
        startActivity(i);
    }

    public void handlerClickPraktikumFragment(View view) {
        Intent i = new Intent(this, TugasFragment.class);
        startActivity(i);
    }
}
