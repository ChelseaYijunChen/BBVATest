package com.example.yc.bbvatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.yc.bbvatest.fragment.MapFragment;
import com.example.yc.bbvatest.fragment.listViewFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.container) != null) {
            if (savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction().add(R.id.container, new listViewFragment()).commit();

            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);//Menu Resource, Menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new MapFragment()).addToBackStack(null).commit();

                return true;
            case R.id.item2:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new listViewFragment()).addToBackStack(null).commit();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
