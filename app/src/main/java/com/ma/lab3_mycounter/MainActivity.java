package com.ma.lab3_mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Update count to txCount
     */
    private void setCount(){
        TextView txtCounter = this.findViewById(R.id.txtCount);
        txtCounter.setText(""+this.count);
    }
    public void increase(View view) {
        this.count++;

        this.setCount();
    }

    public void decrease(View view) {
        this.count--;

        this.setCount();
    }
    private int count = 0;
}