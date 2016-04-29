package net.lebit.robotdd;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.lebit.robotdd.fragments.AppStateFragment;

public class MainActivity extends AppCompatActivity {
    public static final String STATE_FRAGMENT_TAG = "GuestListState";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addStateFragment();
    }

    private void addStateFragment() {
        if (getSupportFragmentManager().findFragmentByTag(STATE_FRAGMENT_TAG) == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(AppStateFragment.newInstance(), STATE_FRAGMENT_TAG);
            transaction.commit();
        }
    }
}
