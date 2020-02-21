package com.example.dialogfragement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        FragmentManager mng=getSupportFragmentManager();
        myFragementDialog dialog=new myFragementDialog();
        dialog.show(mng,"myFragementDialog");
    }
}
