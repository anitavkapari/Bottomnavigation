package com.example.annu.bottomnavigation.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.annu.bottomnavigation.DB.DBHelper;
import com.example.annu.bottomnavigation.Person;
import com.example.annu.bottomnavigation.R;
import com.example.annu.bottomnavigation.RecyclerclickListner;

import java.util.List;

public class PersonListAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    List<Person> persons;
    DBHelper dbHelper;

   public PersonListAdapter(List<Person> persons, DBHelper dbHelper) { //constructor
        this.persons = persons;
        this.dbHelper = dbHelper;

   /* List<Person> personList; RecyclerclickListner listener;
    public PersonListAdapter(List<Person> studentList, RecyclerclickListner listener) {
        this.personList = studentList;
        this.listener = listener;*/
    }


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( viewGroup.getContext( ) ).inflate( R.layout.profile_list, null );
        return new PersonViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int i) {
        final Person person = persons.get( i );
        //holder.imgperson.setImageResource(person.getImage());
        holder.txtName.setText( "Name :" + person.getName( ) );
        holder.txtAddress.setText( "Address :" + person.getAddress( ) );
        holder.txtPhone.setText( "Phone :" + person.getPhone( ) );
        holder.btnDelete.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                boolean isDelete = dbHelper.deleatePerson( person.getId( ) );
                if (isDelete) {
                    persons.remove( person );
                    notifyDataSetChanged( );
                }
            }
        } );
    }


    @Override
    public int getItemCount() {
        return persons.size();
    }
}
