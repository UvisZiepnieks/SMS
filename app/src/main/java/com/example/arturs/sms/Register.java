package com.example.arturs.sms;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private ImageButton register;
    private CheckBox checkbox;
    private EditText user, password, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        hideSystemUI();
        user = (EditText) findViewById(R.id.txt_user);
        password = (EditText) findViewById(R.id.txt_password);
        email = (EditText) findViewById(R.id.txt_email);

        register = (ImageButton)findViewById(R.id.btnRegister2);
        checkbox = (CheckBox)findViewById(R.id.checkBox);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkbox.isChecked() && user.length()!=0 && password.length()!=0 && email.length()!=0){
                    openDialog();
                }else{
                    Toast.makeText(Register.this, "Jāatļāuj saziņa caur e-pastu!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openDialog() {

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        // Set Custom Title
        TextView title = new TextView(this);
        // Title Properties
        title.setText("Sazināsimies e-pastā");
        title.setPadding(40, 50, 10, 10);   // Set Position
        title.setGravity(Gravity.LEFT);
        title.setTextColor(Color.BLACK);
        title.setTextSize(20);
        alertDialog.setCustomTitle(title);

        // Set Message
        TextView msg = new TextView(this);
        // Message Properties
        msg.setText("Mēs sazināsimies ar Jums e-pastā un aktivizēsim kontu!");
        msg.setGravity(Gravity.LEFT);
        msg.setPadding(40, 50, 30, 10);
        msg.setTextColor(Color.GRAY);
        msg.setTextSize(16);
        alertDialog.setView(msg);

        // Set Button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"Turpināt", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Main();
            }
        });
        new Dialog(getApplicationContext());
        alertDialog.show();

        // Set Properties for OK Button
        final Button okBT = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL);
        LinearLayout.LayoutParams neutralBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
        neutralBtnLP.gravity = Gravity.RIGHT;
        okBT.setPadding(10, 10, 10, 10);   // Set Position
        okBT.setTextColor(Color.BLUE);
        okBT.setLayoutParams(neutralBtnLP);
    }

    public void Main(){
        Intent intent = new Intent(this, Main.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void hideSystemUI(){
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}