package com.jundat95.studentmanager.ui.main;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

import com.jundat95.studentmanager.repository.local.model.StudentModel;

import java.util.Collections;
import java.util.List;
import java.util.Observable;

/**
 * Created by tinhngo on 21/09/2017.
 */

public class StudentVieModel extends BaseObservable {

    private List<StudentModel> studentModels;
    private Context context;

    public StudentVieModel(Context context) {
        this.studentModels = Collections.emptyList();
        this.context = context;
    }

    @Bindable
    public List<StudentModel> getStudents() {
        return this.studentModels;
    }

    public void setStudents(List<StudentModel> students) {
        this.studentModels.addAll(students);
        notifyChange();
    }

    public void onClick(View view) {
        Toast.makeText(context, "hello add", Toast.LENGTH_SHORT).show();
    }
}
