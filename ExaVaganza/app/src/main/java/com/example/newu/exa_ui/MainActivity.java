package com.example.newu.exa_ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    FrameLayout fr;
    client c;
    writer w;
    About b;
    Setting s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv=findViewById(R.id.main_nav);
        fr=findViewById(R.id.main_frame);

        c = new client();
        w=new writer();
        b=new About();
        s=new Setting();

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.nav_writer:
                        //bnv.setItemBackgroundResource(R.color.colorWhite);
                        setFragment(w);
                        return true;
                    case R.id.nav_client:
                        // bnv.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(c);
                        return true;
                    case R.id.nav_about:
                        // bnv.setItemBackgroundResource(R.color.colorPrimary);
                       // setFragment(b);
                       // startActivity(new Intent(getApplicationContext(), About.class));
                        return true;
                    case R.id.nav_setting:
                        setFragment(s);
                    default:
                        return false;

                }

            }
        });

    }


    private void setFragment(Fragment fragment) {

        FragmentTransaction frag=getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.main_frame, fragment);
        frag.commit();
    }
}



