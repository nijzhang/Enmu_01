package com.example.a15625.enmu_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.setGlade:
                Toast.makeText(MainActivity.this,"年级设置",Toast.LENGTH_SHORT).show();
                break;
            case R.id.setClass:
                Toast.makeText(MainActivity.this,"班级设置",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.startBtn:
                Toast.makeText(MainActivity.this,"开始",Toast.LENGTH_SHORT).show();
                break;
            case R.id.endBtn:
                Toast.makeText(MainActivity.this,"结束",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }
}
