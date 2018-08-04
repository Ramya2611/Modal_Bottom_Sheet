package com.example.ramya.modal_bottom_sheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Bottom_Sheet.BottomSheetListener{

    private TextView mtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextview=findViewById(R.id.txt);

        Button More = (Button)findViewById(R.id.more);
        More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottom_Sheet bottom_sheet = new Bottom_Sheet();
                bottom_sheet.show(getSupportFragmentManager(),"Bottom_Sheet");
            }
        });
    }

    @Override
    public void onButtonClicked(String text) {
        mtextview.setText(text);

    }
}
