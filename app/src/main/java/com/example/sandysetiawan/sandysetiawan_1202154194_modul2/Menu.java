package com.example.sandysetiawan.sandysetiawan_1202154194_modul2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    ImageView foto1;
    ImageView foto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toast.makeText(getApplicationContext(), "Data Telah Disimpan", Toast.LENGTH_LONG).show();

    foto1 = (ImageView) findViewById(R.id.foto1);
    foto1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(Menu.this, DeskripsiAjinomoto.class));
    }

}
