package com.jundat95.studentmanager.repository.local.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jundat95.studentmanager.BR;

/**
 * Created by tinhngo on 20/09/2017.
 */

public class StudentModel extends BaseObservable {

    public String id;
    public String name;
    public String address;
    public String birthday;

    public StudentModel(String id, String name, String address, String birthday) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }

    @Bindable
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
        notifyPropertyChanged(BR.birthday);
    }

}
