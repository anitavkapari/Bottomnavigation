package com.example.annu.bottomnavigation.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.annu.bottomnavigation.R;
import com.example.annu.bottomnavigation.fragment.DashBordFragment;
import com.example.annu.bottomnavigation.fragment.HomeFragment;
import com.example.annu.bottomnavigation.fragment.NotificationFragment;
import com.example.annu.bottomnavigation.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private TextView changeFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    changeFragment(new HomeFragment());
                    return true;
                case R.id.navigation_dashboard:
                    changeFragment(new DashBordFragment());
                    return true;
                case R.id.navigation_notifications:
                    changeFragment(new NotificationFragment());
                    return true;
                case R.id.navigation_profile:
                    changeFragment(new ProfileFragment());
                    return true;
            }
            return false;
        }
    };

    public void changeFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.parent,fragment);
        fragmentTransaction.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        changeFragment(new HomeFragment());

    }

}
