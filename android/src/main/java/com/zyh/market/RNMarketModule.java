
package com.zyh.market;

import android.net.Uri;
import android.content.Intent;
import android.content.pm.PackageManager;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNMarketModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  public RNMarketModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMarket";
  }
  @ReactMethod
  public void openMarket() {
    Uri uri = Uri.parse("market://details?id=" + reactContext.getPackageName());
    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivity(intent);
  }
}