package com.plugin.android.simpleplugin;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by nipundavid on 6/19/2017.
 */

public class PluginClass {
    private Context context;
    private static PluginClass instance;

    public PluginClass() {
        this.instance = this;
    }

    public static PluginClass instance() {
        if(instance == null) {
            instance = new PluginClass();
        }
        return instance;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void showMessage(String message) {
        Toast.makeText(this.context, message, Toast.LENGTH_SHORT).show();
    }
}
