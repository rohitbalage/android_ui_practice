package com.rrbofficial.androiduipracticejava;

import android.app.Application;
import android.util.Log;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;

public class MyAmplifyApp  extends Application {

    public  void onCreate(){
        super.onCreate();


        try{
            Amplify.configure(getApplicationContext());
            Log.i("MyAmplifyApp", "Initialized Amplify");
        }catch (AmplifyException exception){
            Log.e("MyAmplifyApp", "Could not initialize Amplify", exception);
        }

    }

}
