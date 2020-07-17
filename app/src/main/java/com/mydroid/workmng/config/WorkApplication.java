package com.mydroid.workmng.config;

import android.app.Application;
import android.util.Log;

//import com.getkeepsafe.relinker.BuildConfig;


import com.mydroid.workmng.BuildConfig;

import io.realm.Realm;
import io.realm.log.LogLevel;
import io.realm.log.RealmLog;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;

public class WorkApplication extends Application {

    String mongodb_realm_appId = BuildConfig.MONGODB_REALM_APP_ID;
    App app;

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        app = new App(new AppConfiguration.Builder(mongodb_realm_appId)
                .build());

        // Enable more logging in debug mode
        if (BuildConfig.DEBUG) {
            RealmLog.setLevel(LogLevel.ALL);
        }

        Log.v("myapplication", "Initialized the Realm App configuration for "+mongodb_realm_appId+" "+app.toString() );
    }
}
