package net.lebit.robotdd.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import net.lebit.robotdd.R;
import net.lebit.robotdd.adapters.GuestListAdapter;
import net.lebit.robotdd.data.SampleData;
import net.lebit.robotdd.models.Guest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ataeschner on 29.04.2016.
 */
public class GuestListFragment extends Fragment{
    private View mLayout;
    private ListView mListView;
    private GuestListAdapter mAdapter;
    private List<Guest> mGuests;


    public static GuestListFragment newInstance() {
        return new GuestListFragment();
    }

    public GuestListFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mLayout = inflater.inflate(R.layout.fragment_guest_list, container, false);
        initializeView();
        return mLayout;
    }

    private void initializeView() {
        mListView = (ListView) mLayout.findViewById(R.id.guestListView);
        mGuests = SampleData.getSampleGuests();
        mAdapter = new GuestListAdapter(getContext(), mGuests);
        mListView.setAdapter(mAdapter);
    }
}
