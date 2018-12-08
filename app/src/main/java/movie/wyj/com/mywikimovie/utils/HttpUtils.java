package movie.wyj.com.mywikimovie.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2018/10/14.
 */

public class HttpUtils {
    private static volatile HttpUtils instance;

    public static HttpUtils getInstance() {
        if (instance == null) {
            synchronized (HttpUtils.class) {
                if (instance == null) {
                    instance = new HttpUtils();
                }
            }
        }
        return instance;
    }

    private Retrofit retrofit;

    private String BASE_URL = "http://172.17.8.100/";
//    private String BASE_URL = "http://172.17.8.100/movieApi/movie/v1/";

    private HttpUtils() {
        retrofit = new Retrofit.Builder()
                //设置公共的url部分
                .baseUrl(BASE_URL)
                //配置解析方式为Gson
                .addConverterFactory(GsonConverterFactory.create())
                //retrofit支持RxJava2
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                //配置okhttpClient
                .client(buildOkhttpClient())
                .build();
    }

    private OkHttpClient buildOkhttpClient() {
        return new OkHttpClient.Builder()
                .readTimeout(5000, TimeUnit.MILLISECONDS)
                .writeTimeout(5000, TimeUnit.MILLISECONDS)
                .build();
    }

    public Retrofit getmRetrofit() {
        return retrofit;
    }

    public <T> T create(Class<T> clazz) {
        return retrofit.create(clazz);
    }

}
