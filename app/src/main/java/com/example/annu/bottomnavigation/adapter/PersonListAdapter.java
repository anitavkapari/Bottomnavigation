package com.example.annu.bottomnavigation.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.annu.bottomnavigation.Person;
import com.example.annu.bottomnavigation.R;
import com.example.annu.bottomnavigation.RecyclerclickListner;

import java.util.List;

public class PersonListAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private List<Person> personList; RecyclerclickListner listener;
    public PersonListAdapter(List<Person> studentList, RecyclerclickListner listener) {
        this.personList = studentList;
        this.listener = listener;
    }


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate( R.layout.profile_list,null);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int i) {
        Person person=personList.get(i);
        holder.imgperson.setImageResource(person.getImageId());
        holder.txtName.setText(person.getName());
        holder.txtAddress.setText(person.getAddress());
        holder.txtPhone.setText(person.getPhone());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
