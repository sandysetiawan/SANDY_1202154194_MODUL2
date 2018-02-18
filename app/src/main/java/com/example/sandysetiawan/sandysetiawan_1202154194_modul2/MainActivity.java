package com.example.sandysetiawan.sandysetiawan_1202154194_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton dine,take;
    RadioGroup menu;
    Button pesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Sandy 1202154194", Toast.LENGTH_LONG).show();



        dine = (RadioButton) findViewById(R.id.dine);
        take = (RadioButton) findViewById(R.id.take);
        menu = (RadioGroup) findViewById(R.id.menu);
        pesan = (Button) findViewById(R.id.pesan);

        pesan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    if (dine.isChecked()){
        startActivity(new Intent(MainActivity.this, DineIn.class));
    }
    if ((take.isChecked())){
        startActivity(new Intent(MainActivity.this, TakeAway.class));
    }
    }

}
