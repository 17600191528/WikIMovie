package movie.wyj.com.mywikimovie.utils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by TP-PC on 2018.12.04.
 */

public class HeaderIntercepter implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request().newBuilder()
                .addHeader("userId", "")
                .addHeader("userId", "")
                .build();
        return chain.proceed(request);
    }
}
