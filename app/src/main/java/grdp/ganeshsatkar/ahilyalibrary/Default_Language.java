package grdp.ganeshsatkar.ahilyalibrary;

import android.app.Application;
import android.content.Context;

/**
 * Created by abdalla on 10/1/17.
 */

public class Default_Language extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
    }
}
