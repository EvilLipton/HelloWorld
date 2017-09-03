package com.example.foreng.helloepam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.foreng.helloepam.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_main = (Button) findViewById(R.id.button);

        button_main.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(android.view.View view) {
                Toast.makeText(MainActivity.this, R.string.toast_name, Toast.LENGTH_LONG).show();

            }
        });



    }
}
