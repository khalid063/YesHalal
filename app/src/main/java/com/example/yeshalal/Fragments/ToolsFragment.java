package com.example.yeshalal.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.yeshalal.R;


public class ToolsFragment extends Fragment {

    private LinearLayout linearLayoutScanButton;
    //Code for expandable layout Section One
    //LinearLayout linearLayoutScanButton;
    RelativeLayout relativeLayoutExpanOne;
    ImageView imageViewButtonExpanDown, imageViewButtonExpanUp;

    //Code for expandable layout Section Two
    LinearLayout linearLayoutScanButton_sectionTwo;
    RelativeLayout relativeLayoutExpanTwo_sectionTwo;
    ImageView imageViewButtonExpanDown_sectionTwo, imageViewButtonExpanUp_sectionTwo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate (R.layout.fragment_tools, container, false);

        // Call toolbar
        linearLayoutScanButton = view.findViewById (R.id.tools_scan_button_id);

        //Code for expandable layout Section One
        imageViewButtonExpanDown = view.findViewById (R.id.down_arrow_tools_page);
        relativeLayoutExpanOne = view.findViewById (R.id.ExpanlayoutOne_contentPartOne);
        imageViewButtonExpanUp = view.findViewById (R.id.up_arrow_tools_page);

        //Code for expandable layout Section Two
        imageViewButtonExpanDown_sectionTwo = view.findViewById (R.id.down_arrow_tools_page_Two);
        relativeLayoutExpanTwo_sectionTwo = view.findViewById (R.id.ExpanlayoutTwo_contentPartOne);
        imageViewButtonExpanUp_sectionTwo = view.findViewById (R.id.up_arrow_tools_page_Two);


        // fragment change when press scan button of toolbar of head
        linearLayoutScanButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                getFragmentManager ().beginTransaction ().replace (R.id.fragment_container, new ScanFragment ()).commit ();

            }
        });

        //Code for expandable layout Section One , Expand Down
        imageViewButtonExpanDown.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                relativeLayoutExpanOne.setVisibility (View.VISIBLE);
                imageViewButtonExpanDown.setVisibility (View.GONE);
                imageViewButtonExpanUp.setVisibility (View.VISIBLE);
            }
        });

        //Code for expandable layout Section One , Expand Up
        imageViewButtonExpanUp.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                relativeLayoutExpanOne.setVisibility (View.GONE);
                imageViewButtonExpanDown.setVisibility (View.VISIBLE);
                imageViewButtonExpanUp.setVisibility (View.GONE);
            }
        });
        // End of Section one expandable layout

        //Code for expandable layout Section Two , Expand Down
        imageViewButtonExpanDown_sectionTwo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                relativeLayoutExpanTwo_sectionTwo.setVisibility (View.VISIBLE);
                imageViewButtonExpanDown_sectionTwo.setVisibility (View.GONE);
                imageViewButtonExpanUp_sectionTwo.setVisibility (View.VISIBLE);
            }
        });

        //Code for expandable layout Section Two , Expand Up
        imageViewButtonExpanUp_sectionTwo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                relativeLayoutExpanTwo_sectionTwo.setVisibility (View.GONE);
                imageViewButtonExpanDown_sectionTwo.setVisibility (View.VISIBLE);
                imageViewButtonExpanUp_sectionTwo.setVisibility (View.GONE);
            }
        });

        return view;
    }


}
