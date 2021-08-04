package com.example.ordibehesht;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import app.akexorcist.bluetotohspp.library.BluetoothSPP;
import app.akexorcist.bluetotohspp.library.BluetoothState;
import app.akexorcist.bluetotohspp.library.DeviceList;

public class MainActivity extends AppCompatActivity {

    BluetoothSPP bt;
    TextView textStatus;

    TextView out_humidity;
    TextView out_light;
    TextView out_fan;
    TextView out_pomp;

    Menu menu;

    private NumberPicker fan_picker;
    private NumberPicker light_picker;
    private String[] pickerVals;

    int valuePickerFan;
    int valuePickerLight;

    int counter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fan_picker = findViewById(R.id.fan);
        fan_picker.setMaxValue(9);
        fan_picker.setMinValue(0);
        pickerVals  = new String[] {"Off", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        fan_picker.setDisplayedValues(pickerVals);

        fan_picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {


            }
        });

        light_picker = findViewById(R.id.light);
        light_picker.setMaxValue(9);
        light_picker.setMinValue(0);
        pickerVals  = new String[] {"Off", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        light_picker.setDisplayedValues(pickerVals);

        light_picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {

            }
        });

        textStatus = findViewById(R.id.textStatus);

        out_humidity= findViewById(R.id.out_humidity);
        out_light= findViewById(R.id.out_light);
        out_fan= findViewById(R.id.out_fan);
        out_pomp= findViewById(R.id.out_pomp);




        bt = new BluetoothSPP(this);







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == R.id.menu_android_connect) {

        }
        return super.onOptionsItemSelected(item);
    }





}