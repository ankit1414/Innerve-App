package com.avishigoyal.innerve;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.avishigoyal.innerve.R;

public class LoginActivity extends AppCompatActivity {
    private static String user_email;
    private static String  password;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText emailField = findViewById(R.id.editText);
        final EditText passwordField = findViewById(R.id.editText2);
        Button login = findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(emailField.getText().toString().equals("") || passwordField.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext() , "please enter valid emailId and password" , Toast.LENGTH_SHORT).show();
                }
                else{
                    user_email = emailField.getText().toString();


                    password = passwordField.getText().toString();


                    Intent i=new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i);

                }



            }
        });
//        overridePendingTransition(0,0);
//        View relativeLayout=findViewById(R.id.login_container);
//        Animation animation= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
//        relativeLayout.startAnimation(animation);





    }

    public static String getUser_email() {
        return user_email;
    }

    public static String getPassword() {
        return password;
    }
}
