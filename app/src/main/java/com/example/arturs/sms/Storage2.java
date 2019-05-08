package com.example.arturs.sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Storage2 extends AppCompatActivity {

    public static boolean quantity=false, width=false, length=false, quantityL=false;
    private CheckBox chb_quantity, chb_width, chb_length, chb_quantityL;
    private Button addMaterial2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage2);

        addMaterial2 = (Button)findViewById(R.id.btn_addMaterial2);
        addMaterial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage();
            }
        });
    }



    public void Storage(){

//        if(chb_quantity.isChecked()){
//            quantity=true;
//        }
//        if(chb_width.isChecked()){
//            width=true;
//        }
//        if(chb_length.isChecked()){
//            length=true;
//        }
//        if(chb_quantityL.isChecked()){
//            quantityL=true;
//        }
        Intent intent = new Intent(this, Storage.class);
        startActivity(intent);


    }
}
