package com.example.newu.exa_ui.Gallery;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newu.exa_ui.R;

/* the activity that opens when book item is clicked
   so its better to convert to fragment
* */

public class Book_activity extends AppCompatActivity {

    private TextView tvtitle, tvdescription, tvcategory;
    private ImageView img;
    ImageButton btn;

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_activity);

        btn=findViewById(R.id.button_book_activity);
        tvtitle=findViewById(R.id.txttitle);
        tvdescription=findViewById(R.id.txtdesc);
        tvcategory=findViewById(R.id.txtcat);

        img=findViewById(R.id.book_thumbnail);


        Intent intent=getIntent();
        String title=intent.getExtras().getString("Title");
        String description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Thumbnail");

        tvtitle.setText(title);
        tvdescription.setText(description);

        img.setImageResource(image);




        //convert this activity to fragment

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }

}
