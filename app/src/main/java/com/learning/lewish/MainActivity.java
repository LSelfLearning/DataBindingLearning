package com.learning.lewish;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewDataBinding viewDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewDataBinding.setVariable(BR.presenter,new Presenter());
    }
    public class Presenter{
        public void onNormalClick(View view){
            Toast.makeText(MainActivity.this, "onNormalClick", Toast.LENGTH_SHORT).show();
        }
        public void onListClick(View view){
            Toast.makeText(MainActivity.this, "onListClick", Toast.LENGTH_SHORT).show();
        }
    }
}
