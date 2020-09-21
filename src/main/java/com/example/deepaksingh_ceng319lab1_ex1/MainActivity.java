package com.example.deepaksingh_ceng319lab1_ex1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t = manager.beginTransaction();
        Frag1 m1=new Frag1();
        t.add(R.id.frame1, m1);
        t.commit();


        Toast.makeText(this, "onCreate are executed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart are executed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Toast.makeText(this, "onStop are executed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"onDestroy are executed",Toast.LENGTH_LONG).show();
        }

    public void fl(String s) {
        FragmentManager manager1=getSupportFragmentManager();
        FragmentTransaction tl=manager1.beginTransaction();
        Frag2 m22=new Frag2();
        Bundle b2=new Bundle();
        b2.putString("s",s);
        m22.setArguments(b2);
        tl.replace(R.id.frame1,m22);
        tl.commit();

    }
}
