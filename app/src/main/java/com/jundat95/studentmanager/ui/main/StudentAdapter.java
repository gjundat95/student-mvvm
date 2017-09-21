package com.jundat95.studentmanager.ui.main;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jundat95.studentmanager.R;
import com.jundat95.studentmanager.databinding.RecyclerItemStudentBinding;
import com.jundat95.studentmanager.repository.local.model.StudentModel;

import java.util.Collections;
import java.util.List;

/**
 * Created by tinhngo on 20/09/2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentHolder>{

    private List<StudentModel> students;

    public StudentAdapter() {
        this.students = Collections.emptyList();
    }

    @Override
    public StudentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerItemStudentBinding itemStudentBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.recycler_item_student, parent, false);
        return new StudentHolder(parent.getRootView(), itemStudentBinding);
    }

    @Override
    public void onBindViewHolder(StudentHolder holder, int position) {
        holder.bindStudent(students.get(position));
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class StudentHolder extends RecyclerView.ViewHolder {
        RecyclerItemStudentBinding itemStudentBinding;

        public StudentHolder(View itemView, RecyclerItemStudentBinding itemStudentBinding) {
            super(itemView);
            this.itemStudentBinding = itemStudentBinding;
        }

        void bindStudent(StudentModel studentModel) {
            if(itemStudentBinding.getStudent() == null) {
                itemStudentBinding.setStudent(
                        new ItemStudentViewModel(itemView.getContext(), studentModel)
                );
            } else {
                itemStudentBinding.setStudent(new ItemStudentViewModel(itemView.getContext(), studentModel));
            }
        }
    }
}
