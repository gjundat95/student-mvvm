package com.jundat95.studentmanager.ui.main;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jundat95.studentmanager.R;
import com.jundat95.studentmanager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements Observable {

    private ActivityMainBinding activityMainBinding;
    private StudentVieModel studentVieModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBinding();
        setupRecyclerView(activityMainBinding.rvListStudent);
    }

    private void initBinding() {
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        studentVieModel = new StudentVieModel(this);
        activityMainBinding.setStudent(studentVieModel);
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        StudentAdapter studentAdapter = new StudentAdapter();
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
}
