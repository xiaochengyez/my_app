package com.example.myapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView name ;   //用户名
    TextView  pass;    //密码

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);

    }
    public void Check(View view) {
        String mname = "gongxc";
        String mpass = "123456";
        String user = name.getText().toString().trim();
        String pwd = pass.getText().toString().trim();
        if (user.equals(mname) && pwd.equals(mpass)) {
            Toast.makeText(this,
                    "恭喜，通过", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,
                    "很遗憾，继续努力", Toast.LENGTH_SHORT).show();
        }

    }
}
