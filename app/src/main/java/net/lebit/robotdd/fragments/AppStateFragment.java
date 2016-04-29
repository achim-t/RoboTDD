package net.lebit.robotdd.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.lebit.robotdd.MainActivity;
import net.lebit.robotdd.R;

/**
 * Created by ataeschner on 29.04.2016.
 */
public class AppStateFragment extends Fragment{

    MainActivity parentActivity;

    public static AppStateFragment newInstance(){
        return new AppStateFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        parentActivity = (MainActivity) getActivity();
        openFragment(GuestListFragment.newInstance(), "Guest List");
    }

    private void openFragment(GuestListFragment fragment, String screenTitle) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
        parentActivity.getSupportActionBar().setTitle(screenTitle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_app_state, container, false);
    }

}
