package net.lebit.robotdd.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import net.lebit.robotdd.R;
import net.lebit.robotdd.models.Guest;

import java.util.List;

/**
 * Created by ataeschner on 29.04.2016.
 */
public class GuestListAdapter extends ArrayAdapter<Guest>{

    private List<Guest> mGuest;
    private Context mContext;
    public GuestListAdapter(Context context, List<Guest> guests) {
        super(context, R.layout.guest_list_custom_row);
        mGuest = guests;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mGuest.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Holder mHolder;

        final Guest selectedGuest = mGuest.get(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.guest_list_custom_row, null);

            mHolder = new Holder();
            mHolder.guestName = (TextView) view.findViewById(R.id.text_view_guests_name);
            mHolder.guestEmail = (TextView) view.findViewById(R.id.text_view_guests_email);
            mHolder.guestHeadshot = (ImageView) view.findViewById(R.id.image_view_guest_head_shot);

            view.setTag(mHolder);
        } else {
            mHolder = (Holder) view.getTag();
        }

        mHolder.guestName.setText(selectedGuest.getName());
        Log.d("Adapter", selectedGuest.getName());
        mHolder.guestEmail.setText(selectedGuest.getEmailAddress());
        Picasso.with(mContext)
                .load(selectedGuest.getProfileImagePath())
                .fit()
                .placeholder(R.drawable.profile_icon)
                .into(mHolder.guestHeadshot);
        return view;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class Holder {
        public ImageView guestHeadshot;
        public TextView guestName, guestEmail;
    }
}
