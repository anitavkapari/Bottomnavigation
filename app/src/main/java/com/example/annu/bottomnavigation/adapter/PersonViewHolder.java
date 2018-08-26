package com.example.annu.bottomnavigation.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.annu.bottomnavigation.R;
import com.example.annu.bottomnavigation.RecyclerclickListner;

public class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView imgperson;
    ImageButton btnDelete;
    TextView txtName,txtAddress,txtPhone;
    RecyclerclickListner listner;

    public PersonViewHolder(@NonNull View itemView) {
        super( itemView );
       // imgperson = itemView.findViewById( R.id.imgPerson );
        txtName = itemView.findViewById( R.id.txtName );
        txtAddress = itemView.findViewById( R.id.txtAddress );
        txtPhone = itemView.findViewById( R.id.txtPhone );
        itemView.setOnClickListener( this );
    }
   @Override
    public void onClick(View view){
        listner.onClick( view,getAdapterPosition() );
    }

    }
