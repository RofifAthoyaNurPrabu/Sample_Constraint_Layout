package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edmail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btSignin);
        edmail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                nama=edmail.getText().toString();
                password=edpassword.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda:"+nama+"dan password anda:"+password+"", Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}