package com.example.cinfysystems.ui.changepassword;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChangepasswordViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChangepasswordViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}