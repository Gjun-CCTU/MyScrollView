package com.angus.myscrollview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    Button B[] = new Button[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout)findViewById(R.id.ll);

        View.OnClickListener OCL = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = (String) ((Button)view).getText();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        };

        for(int i=0; i< 20; i++){
            B[i] = new Button(MainActivity.this);
            B[i].setText("按鈕" + (i +1));
            LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(200, 100);
            layout.addView(B[i], btnParams);
            B[i].setOnClickListener(OCL);
            EditText et = new EditText(MainActivity.this);
            et.setHint("輸入元件" +(i+1));
            LinearLayout.LayoutParams etParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            layout.addView(et, etParams);
        }
    }
}
