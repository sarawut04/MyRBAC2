package rbac.sunprakon.kittisak.myrbac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rbac.sunprakon.kittisak.myrbac.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add fragment
        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.mainContainer,mainFragment)
                    .commit();
        }
    } //main method

} //main class
