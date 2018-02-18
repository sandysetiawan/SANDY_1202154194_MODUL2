package com.example.sandysetiawan.sandysetiawan_1202154194_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity implements View.OnClickListener {
    Button pesan1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        Toast.makeText(getApplicationContext(), "Pesanan Take Away", Toast.LENGTH_LONG).show();

        pesan1 = (Button) findViewById(R.id.pesan1);

        pesan1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(TakeAway.this, Menu.class));
    }
}
