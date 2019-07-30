package com.example.yeshalal.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.yeshalal.R;


public class ScanFragment extends Fragment {

    private LinearLayout linearLayoutToolsButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate (R.layout.fragment_scan, container, false);

        linearLayoutToolsButton = view.findViewById (R.id.home_tools_button_id);
        linearLayoutToolsButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                getFragmentManager ().beginTransaction ().replace (R.id.fragment_container, new ToolsFragment ()).commit ();

            }
        });

        return view;
    }


}
