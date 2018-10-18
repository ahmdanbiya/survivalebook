package com.ccdp.appakhir2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Lokasi extends Fragment {
    private Button mButtonStart;

    public Lokasi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_psikologi,
                container, false);
        mButtonStart = (Button) rootView.findViewById(R.id.button1);

        return rootView;
    }
    public void updateDetail() {        {
        }
    }

}
