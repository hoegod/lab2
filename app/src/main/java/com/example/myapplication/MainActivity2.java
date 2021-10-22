package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText ed_name = findViewById(R.id.gamer);
        TextView tv_text = findViewById(R.id.status);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btn_scissor = findViewById(R.id.scissor);
        Button btn_stone = findViewById(R.id.stone);
        Button btn_papper = findViewById(R.id.papper);
        Button btn_mora = findViewById(R.id.mora);
        btn_mora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed_name.length()<1)
                    tv_text.setText("請輸入玩家姓名");
                else{
                    tv
                }
            }
        });

    }
}