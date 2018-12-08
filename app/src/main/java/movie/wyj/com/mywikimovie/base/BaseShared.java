package movie.wyj.com.mywikimovie.base;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by TP-PC on 2018.11.30.
 */

public class BaseShared {
    private Context context;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private String FILE_NAME = "config";

    protected BaseShared(Context context) {
        this.context = context;
        sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }

    protected void setString(String key, String value) {
        sp.edit().putString(key, value).commit();
    }

    protected String getString(String key) {
        return sp.getString(key, null);
    }

    protected void setBoolean(String key, boolean value) {
        sp.edit().putBoolean(key, value).commit();
    }

    protected boolean getBoolean(String key) {
        return sp.getBoolean(key, false);
    }

    protected void setInt(String key, int value) {
        sp.edit().putInt(key, value).commit();
    }

    protected int getInt(String key) {
        return sp.getInt(key, 0);
    }
}
