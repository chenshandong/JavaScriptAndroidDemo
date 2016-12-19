package com.chensd.javascriptandroiddemo;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by chensd on 2016/12/19.
 */
public class JavaScriptKit {
    private Context context;

    public JavaScriptKit(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void showToast(String text){
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
