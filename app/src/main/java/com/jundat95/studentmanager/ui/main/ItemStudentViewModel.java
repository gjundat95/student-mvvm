package com.jundat95.studentmanager.ui.main;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jundat95.studentmanager.repository.local.model.StudentModel;

/**
 * Created by tinhngo on 20/09/2017.
 */

public class ItemStudentViewModel extends BaseObservable {

    private Context context;
    private StudentModel studentModel;

    public ItemStudentViewModel(Context context, StudentModel studentModel) {
        this.context = context;
        this.studentModel = studentModel;
    }

    @Bindable
    public String getName() {
        return this.studentModel.getName();
    }

    @Bindable
    public String getAddress() {
        return this.studentModel.getAddress();
    }

    @Bindable
    public String getBirthday() {
        return this.studentModel.getBirthday();
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    public void setStudentModel(StudentModel studentModel) {
        this.studentModel = studentModel;
        notifyChange();
    }

    public void onClick(View view) {
        Toast.makeText(context, "Toast", Toast.LENGTH_LONG).show();
    }
}
