package com.example;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: Varvara.Zaikina
 * Date: Aug 5, 2010
 * Time: 11:28:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
