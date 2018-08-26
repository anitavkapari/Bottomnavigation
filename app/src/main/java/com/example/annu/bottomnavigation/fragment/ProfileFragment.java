package com.example.annu.bottomnavigation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.annu.bottomnavigation.DB.DBHelper;
import com.example.annu.bottomnavigation.Person;
import com.example.annu.bottomnavigation.R;
import com.example.annu.bottomnavigation.RecyclerclickListner;
import com.example.annu.bottomnavigation.adapter.PersonListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public  class ProfileFragment extends Fragment /*implements RecyclerclickListner*/ {
    RecyclerView rvPerson;
    //private List<Person> personList;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_profile, container, false );
        rvPerson = view.findViewById( R.id.rvPerson );
        //rvPerson.setLayoutManager(new LinearLayoutManager(this));
        rvPerson.setLayoutManager( new LinearLayoutManager( getActivity( ) ) );
        DBHelper dbholder=new DBHelper( getActivity() );//
        List<Person> persons=dbholder.getAllPerson();//
        //adding data list
       /* personList.add( new Person( R.drawable.profile,
                "Anita.", "Saswad", "9763075433" ) );*/
       // PersonListAdapter personListAdapter = new PersonListAdapter( persons ,this);
        PersonListAdapter adapter=new PersonListAdapter(persons , (RecyclerclickListner) dbholder );
        rvPerson.setAdapter( adapter );
        return view;


        // Inflate the layout for this fragment
    }
    /*@Override
    public void onClick(View view, int position) {
        //Person student = personList.get(position);
       //Toast.makeText(this, position.ge
    }*/

}
