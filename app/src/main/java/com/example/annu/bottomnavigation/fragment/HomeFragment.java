package com.example.annu.bottomnavigation.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.annu.bottomnavigation.R;
import com.example.annu.bottomnavigation.activity.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
/*
public Spinner spnCity;
*/
public Button  btnSave;

//String[] city={"Wagholi", "Hadapsar","Hinjebadi","Saswad","Sawarget","VimanNager"};


    public HomeFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //noinspection MoveFieldAssignmentToInitializer
        /*spnCity=view.findViewById(R.id.spnCity);
        btnSave=view.findViewById( R.id.btnSave );
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line,city);
        spnCity.setAdapter(cityAdapter);
        btnSave.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"\ncity : " +spnCity.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }
        });*/
        // Inflate the layout for this fragment

        return view;
    }



}
