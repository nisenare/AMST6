package com.example.appamst6.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class YoutubeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> mURL;

    public YoutubeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        mURL = new MutableLiveData<>();
        mURL.setValue("https://www.youtube.com/embed/" + "AhTBFz9cREc" + "?autoplay=1&vq=small");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getVideo() {
        return mURL;
    }


}