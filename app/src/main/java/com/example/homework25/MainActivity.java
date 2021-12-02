package com.example.homework25;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText gmail, pin;
    private Button btn1;
    private TextView textView1, textView2,textView3, textView4;
    String email = "admin@gmail.com";
    String password = "admin" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onClick();


    }

    private void onClick() {
        btn1.setOnClickListener(view -> {
            if (gmail.getText().toString().equals(email)&&pin.getText().toString().equals(password)){
                gmail.setVisibility(View.GONE);
                pin.setVisibility(View.GONE);
                btn1.setVisibility(View.GONE);
                textView1.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);
                Toast.makeText(this,"вы  успешно зашли ",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this, "Неправильные данные!",Toast.LENGTH_SHORT).show();
            }
        });
        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void afterTextChanged(Editable editable) {
                if  (gmail.getText().toString().length()>0){
                    btn1.setBackgroundColor(getColor(R.color.grey));
                }else{
                    btn1.setBackgroundColor(getColor(R.color.grey_2));
                }
            }
        });
    }

    private void initView() {
        gmail = findViewById(R.id.edit_2);
        pin = findViewById(R.id.edit_1);
        btn1 = findViewById(R.id.btn_send);
        textView2 = findViewById(R.id.text3);
        textView3 = findViewById(R.id.btn_send);
        textView4 = findViewById(R.id.btn_send);
        gmail = findViewById(R.id.edit_2);
        gmail = findViewById(R.id.edit_2);
        gmail = findViewById(R.id.edit_2);
    }
}