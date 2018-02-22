package com.exam.tangfan.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private EditText accountEdit;   //帐号框
    private EditText passwordEdit;  //密码框
    private Button login;   //登录按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        accountEdit = (EditText)findViewById(R.id.account);
        passwordEdit = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = accountEdit.getText().toString();  //帐号
                String password = passwordEdit.getText().toString();    //密码
                if(account.equals("tang") && password.equals("123")){   //判断帐号和密码是否正确
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);  //正确就跳转到主界面
                    finish();
                }else{
                    //帐号密码不正确 给出提示
                    Toast.makeText(LoginActivity.this,"帐号或密码错误！",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
