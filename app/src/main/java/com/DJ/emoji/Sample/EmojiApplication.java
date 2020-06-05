package com.DJ.emoji.Sample;

import android.app.Application;
import android.os.StrictMode;
import androidx.appcompat.app.AppCompatDelegate;

import com.DJ.emoji.EmojiManager;
import com.DJ.emoji.ios.IosEmojiProvider;
import com.DJ.emoji.sample.BuildConfig;

import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY;

public class EmojiApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();

    AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_AUTO_BATTERY);

    EmojiManager.install(new IosEmojiProvider());
    if (BuildConfig.DEBUG) {
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().build());
      StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().build());
    }
  }
}
