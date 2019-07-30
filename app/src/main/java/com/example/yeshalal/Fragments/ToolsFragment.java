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


public class ToolsFragment extends Fragment {

    private LinearLayout linearLayoutScanButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate (R.layout.fragment_tools, container, false);

        linearLayoutScanButton = view.findViewById (R.id.tools_scan_button_id);
        linearLayoutScanButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                getFragmentManager ().beginTransaction ().replace (R.id.fragment_container, new ScanFragment ()).commit ();

            }
        });

        return view;
    }


}
