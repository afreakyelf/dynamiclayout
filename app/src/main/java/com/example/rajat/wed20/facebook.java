package com.example.rajat.wed20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.datatype.Duration;


public class facebook extends AppCompatActivity {

    String password,username;
    TextView toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        LinearLayout l = new LinearLayout(this);
        ViewGroup.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        l.setLayoutParams(lp);
        l.setGravity(Gravity.CENTER);
        l.setPadding(10,0,10,0);
        l.setOrientation(LinearLayout.VERTICAL);

        LinearLayout ll2 = new LinearLayout(this);
        ViewGroup.LayoutParams lp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView tuser = new TextView(this);
        tuser.setText("Username: ");
        final EditText eusername = new EditText(this);
        eusername.setWidth(800);
        ll2.setOrientation(LinearLayout.HORIZONTAL);
        ll2.setLayoutParams(lp2);
        ll2.addView(tuser);
        ll2.addView(eusername);


        LinearLayout ll3 = new LinearLayout(this);
        ViewGroup.LayoutParams lp3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView tpass = new TextView(this);
        tpass.setText("Password: ");
        final EditText epasswprd = new EditText(this);
        epasswprd.setWidth(800);

        ll3.setOrientation(LinearLayout.HORIZONTAL);
        ll3.setLayoutParams(lp3);
        ll3.addView(tpass);
        ll3.addView(epasswprd);

        Button submit = new Button(this);
        submit.setText("Submit");
        l.addView(ll2);
        l.addView(ll3);
        l.addView(submit);
        setContentView(l);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = eusername.getText().toString();
                password = epasswprd.getText().toString();

                LayoutInflater l = getLayoutInflater();
                v =l.inflate(R.layout.activity_facebook,null);
                Toast t = new Toast(facebook.this);
                toast = v.findViewById(R.id.toast);
                toast.setText("User Registered with username: "+username+" and password: "+password);
                t.setView(v);

                t.setDuration(Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
            }
        });


    }
}
