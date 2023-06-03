package com.example.appamst6.ui.youtube;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class YoutubeViewModel extends ViewModel {

    private final MutableLiveData<String> mURL;

    public YoutubeViewModel() {
        mURL = new MutableLiveData<>();
        mURL.setValue("https://www.youtube.com/embed/" + "AhTBFz9cREc" + "?autoplay=1&vq=small");
    }

    public LiveData<String> getVideo() {
        return mURL;
    }
}