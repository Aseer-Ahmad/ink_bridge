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
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    FrameLayout fr;
    client c;
    writer w;
    About b;
    Setting s;

    private static final int RC_SIGN_IN = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authentication();

        //bnv=findViewById(R.id.main_nav);
        fr=findViewById(R.id.main_frame);

        c = new client();
        w=new writer();
        b=new About();
        s=new Setting();

        /*
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
        */

    }

    private void authentication() {

        // Choose authentication providers
        List providers = Arrays.asList(
                new AuthUI.IdpConfig.GoogleBuilder().build(),
                new AuthUI.IdpConfig.FacebookBuilder().build());

        // Create and launch sign-in intent
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .build(),
                RC_SIGN_IN);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);

            if (resultCode == RESULT_OK) {
                // Successfully signed in
                Toast.makeText(getApplicationContext(), "Sign Successful", Toast.LENGTH_SHORT).show();
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                // ...
            } else {
                // Sign in failed. If response is null the user canceled the
                // sign-in flow using the back button. Otherwise check
                // response.getError().getErrorCode() and handle the error.
                // ...
                Toast.makeText(getApplicationContext(), "Sign in failed", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private void setFragment(Fragment fragment) {

        FragmentTransaction frag=getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.main_frame, fragment);
        frag.commit();
    }
}



