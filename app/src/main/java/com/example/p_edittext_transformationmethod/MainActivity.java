package com.example.p_edittext_transformationmethod;
//EditText 顯示密碼/隱藏功能
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText et_password;
    private ImageView ivEye;
    private boolean isOpenEye = false;
    //绑定id

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_password = findViewById(R.id.et_password);
        ivEye = findViewById(R.id.iv_eye);

        //密码是否可见
        ivEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isOpenEye) {
                    ivEye.setSelected(true);
                    isOpenEye = true;
                    //密码可见
                    et_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    ivEye.setSelected(false);
                    isOpenEye = false;
                    //密码不可见
                    et_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
}
