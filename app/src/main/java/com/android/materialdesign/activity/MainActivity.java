package com.android.materialdesign.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.android.materialdesign.R;
import com.android.materialdesign.fragment.LoginFragment;
import com.android.materialdesign.fragment.OneFragment;
import com.android.materialdesign.fragment.ProfileFragment;
import com.android.materialdesign.fragment.SettingsFragment;
import com.android.materialdesign.fragment.TabPageFragment;
import com.android.materialdesign.fragment.ThreeFragment;
import com.android.materialdesign.fragment.TwoFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setFabButton();
        fragmentManager=getSupportFragmentManager();
        loginFrag();
    }

    public void setFabButton(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.show_profile){
            profileFrag();
        }
        else if(id == R.id.show_settings){
            settingsFrag();
        }
        return super.onOptionsItemSelected(item);
    }





    /* All Function to load any Fragment */

    public void loginFrag(){
        Fragment fragment=new LoginFragment();
        fragmentManager.beginTransaction().replace(R.id.container_main,fragment).commitAllowingStateLoss();
    }

    public void profileFrag(){
        Fragment fragment=new ProfileFragment();
        fragmentManager.beginTransaction().replace(R.id.container_main,fragment).commitAllowingStateLoss();
    }

    public void settingsFrag(){
        Fragment fragment=new SettingsFragment();
        fragmentManager.beginTransaction().replace(R.id.container_main,fragment).commitAllowingStateLoss();
    }

    public  void oneFrag(){
        Fragment fragment = new OneFragment();
        fragmentManager.beginTransaction().replace(R.id.container_main,fragment).commitAllowingStateLoss();
    }

    public void twoFrag(){
        Fragment fragment=new TwoFragment();
        fragmentManager.beginTransaction().replace(R.id.container_main,fragment).commitAllowingStateLoss();
    }

    public void threeFrag(){
        Fragment fragment = new ThreeFragment();
        fragmentManager.beginTransaction().replace(R.id.container_main,fragment).commitAllowingStateLoss();
    }

    public void tabPage(){
        Fragment fragment = new TabPageFragment();
        fragmentManager.beginTransaction().replace(R.id.container_main,fragment).commitAllowingStateLoss();
    }

}
