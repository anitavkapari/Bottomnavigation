package com.example.annu.bottomnavigation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.annu.bottomnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashBordFragment extends Fragment {


    public DashBordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dash_bord, container, false);
    }

    /**
     * A simple {@link Fragment} subclass.
     */
   /* public static class HomeFragment extends Fragment {


        public HomeFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_home, container, false);
        }

    }*/
}
