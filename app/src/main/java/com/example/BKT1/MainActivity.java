package com.example.BKT1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a2050531200246_doanthaiphien_baiktth1.R;

public class MainActivity extends AppCompatActivity {
    boolean kt=true;
 //   public static Database database;
    ConstraintLayout mMainLayout;
    EditText passLogin,usernameLogin;
    SharedPreferences sharedPreferences;
    CheckBox checkBox;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("Datalogin",MODE_PRIVATE);
        usernameLogin = (EditText) findViewById(R.id.edt_phone);
        passLogin = (EditText) findViewById(R.id.edt_password);
        checkBox = (CheckBox) findViewById(R.id.cb_savePassword);
        buttonLogin = (Button) findViewById(R.id.login_btn);

        if (sharedPreferences.getBoolean("checked",false)==true){
            usernameLogin.setText(sharedPreferences.getString("taikhoan",""));
            passLogin.setText(sharedPreferences.getString("matkhau",""));
            checkBox.setChecked(true);
        }else checkBox.setChecked(false);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usernameLogin.getText().toString().equals("nha") && passLogin.getText().toString().equals("2050531200241")) {
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(MainActivity.this, ListCongAn.class);
                    startActivity(intent);
                    checkRemember();
                }
                else Toast.makeText(MainActivity.this,"Sai thông tin tài khoản hoặc mật khẩu",Toast.LENGTH_SHORT).show();
            }
        });


    }
    private void checkRemember() {
        String us=usernameLogin.getText().toString().trim()+"";
        String pas= passLogin.getText().toString().trim()+"";
        if (checkBox.isChecked()) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("taikhoan", us);
            editor.putString("matkhau", pas);
            editor.putBoolean("checked", true);
            editor.commit();
        }else {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("taikhoan", us);
            editor.putString("matkhau", pas);
            editor.putBoolean("checked", false);
            editor.commit();
        }

    }
}