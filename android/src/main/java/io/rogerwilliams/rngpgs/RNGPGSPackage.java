
package io.rogerwilliams.rngpgs;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * React Native Google Play Games Services for Android
 *
 * @author Roger Williams
 * @version 1.0.1
 */
public class RNGPGSPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      return Arrays.<NativeModule>asList(
              new RNGPGSAuth(reactContext),
              new RNGPGSPlayer(reactContext),
              new RNGPGSLeaderboard(reactContext),
              new RNGPGSAchievement(reactContext)
      );
    }

    // does it work?
    // Deprecated from RN 0.47
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }
}