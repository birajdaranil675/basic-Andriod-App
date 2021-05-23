package com.example.myapp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity {

    ListView listView;
    String string[] = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        listView = findViewById(R.id.listview1);
        arrayAdapter = new ArrayAdapter(ContextMenuActivity.this, android.R.layout.simple_list_item_1, string);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.call:
                Toast.makeText(this, "CALL", Toast.LENGTH_LONG).show();
                break;

            case R.id.sms:
                Toast.makeText(this, "SMS", Toast.LENGTH_LONG).show();
                break;

            case R.id.email:
                Toast.makeText(this, "Email", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onContextItemSelected(item);
    }
}