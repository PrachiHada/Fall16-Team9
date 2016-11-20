package com.eatorshare.eatorshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void page1(View view) {
        Intent intent = new Intent(this, AddNewItem.class);
        startActivity(intent);
    }

    public void page2(View view) {
        Intent intent = new Intent(this, ManageFood.class);
        startActivity(intent);
    }

    public void page3(View view) {
        Intent intent = new Intent(this, FoodWasted.class);
        startActivity(intent);
    }

}
