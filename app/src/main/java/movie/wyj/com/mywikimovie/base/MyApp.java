package movie.wyj.com.mywikimovie.base;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by lenovo on 2018/11/7.
 */

public class MyApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        context=getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
