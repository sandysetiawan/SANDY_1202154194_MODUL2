package com.example.sandysetiawan.sandysetiawan_1202154194_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DineIn extends AppCompatActivity implements View.OnClickListener {
    Button pesan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        Toast.makeText(getApplicationContext(), "Pesanan Dine In", Toast.LENGTH_LONG).show();

        pesan2 = (Button) findViewById(R.id.pesan2);

        pesan2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(DineIn.this, Menu.class));

    }
}
