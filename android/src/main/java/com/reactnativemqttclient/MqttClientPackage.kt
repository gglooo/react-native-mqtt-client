package com.reactnativemqttclient

import java.util.Arrays
import java.util.Collections

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.bridge.JavaScriptModule

class MqttClientPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        return Arrays.asList<NativeModule>(MqttClientModule(reactContext))
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return emptyList<ViewManager<*, *>>()
    }
}
