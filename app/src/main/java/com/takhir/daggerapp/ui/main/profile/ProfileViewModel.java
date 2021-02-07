package com.takhir.daggerapp.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.takhir.daggerapp.SessionManager;
import com.takhir.daggerapp.models.User;
import com.takhir.daggerapp.ui.auth.AuthResource;

import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "ProfileViewModel";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: is ready");
    }

    public LiveData<AuthResource<User>> getAuthenticateUser() {
        return sessionManager.getAuthUser();
    }
}
