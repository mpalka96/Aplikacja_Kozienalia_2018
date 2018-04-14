package com.example.marci.aplikacja_kozienalia_2018;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.strona_glowna:
                        Intent intent0 = new Intent(mapa.this, MainActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.kalendarz:
                        Intent intent1 = new Intent(mapa.this, kalendarz.class);
                        startActivity(intent1);
                    case R.id.ulubione:
                        Intent intent2 = new Intent(mapa.this, ulubione.class);
                        startActivity(intent2);
                    case R.id.mapa:
                        return true;
                }
                return false;
            }
        };
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);
    }
}
