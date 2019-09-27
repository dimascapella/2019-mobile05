package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.Dips;
import polinema.ac.id.starterchapter05.fragments.PushUp;
import polinema.ac.id.starterchapter05.fragments.standhand;

public class TugasFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_fragment);
    }

    public void handlerhandstand(View view) {
        Fragment frag = getSupportFragmentManager().findFragmentById(R.id.layout);
        if(frag == null || frag instanceof PushUp || frag instanceof Dips){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.layout,new standhand(), "STAND_HAND");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerpushup(View view) {
        Fragment frag = getSupportFragmentManager().findFragmentById(R.id.layout);
        if(frag == null || frag instanceof standhand || frag instanceof Dips){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.layout,new PushUp(), "PUSH_UP");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerdips(View view) {
        Fragment frag = getSupportFragmentManager().findFragmentById(R.id.layout);
        if(frag == null || frag instanceof standhand || frag instanceof PushUp){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.layout,new Dips(), "DIPS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
