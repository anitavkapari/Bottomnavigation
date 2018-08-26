package com.example.annu.bottomnavigation.fragment;


import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.annu.bottomnavigation.DB.DBHelper;
import com.example.annu.bottomnavigation.Person;
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
    EditText edtName,edtAddress,edtPhone;
   // ImageView imgPerson;


//String[] city={"Wagholi", "Hadapsar","Hinjebadi","Saswad","Sawarget","VimanNager"};


    public HomeFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Inflate the layout for this fragment
        //imgPerson=view.findViewById( R.id.imgPerson );
        btnSave=view.findViewById( R.id.btnSave );
        edtName=view.findViewById( R.id.edtName );
        edtAddress=view.findViewById( R.id.edtAddress);
        edtPhone=view.findViewById( R.id.edtPhone);
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
        btnSave.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                //String image = imgPerson.getImageAlpha( );
                String name = edtName.getText( ).toString( ).trim( );
                String address = edtAddress.getText( ).toString( ).trim( );
                String phone = edtPhone.getText( ).toString( ).trim( );
                Person person = new Person( name, address, phone );
                DBHelper dBholder = new DBHelper( getActivity( ) );
                boolean isAddes = dBholder.addPerson( person );
                if (isAddes) {
                    Toast.makeText( getActivity( ), "Recod Added", Toast.LENGTH_SHORT ).show( );
                }
            }
        } );

        return view;
    }



}
