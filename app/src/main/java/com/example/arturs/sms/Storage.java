package com.example.arturs.sms;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.alespero.expandablecardview.ExpandableCardView;

public class Storage extends AppCompatActivity {

    private ImageButton btnStorageAdd;
    private Button btnQuantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        btnStorageAdd = (ImageButton)findViewById(R.id.btnStorageAdd);
        btnStorageAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StorageAdd();
            }
        });

        btnQuantity = (Button)findViewById(R.id.btn_quantity);
        btnQuantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Quantity();
            }
        });


    }




//    public void Quantity(){
//        EditText txt_quantity = (EditText)findViewById(R.id.txt_quantity);
//        String quantity = txt_quantity.getText().toString();
//        txt_quantity.setText(quantity);
//    }


    public void StorageAdd(){
        Intent intent = new Intent(this, Storage2.class);
        startActivity(intent);
    }
}
