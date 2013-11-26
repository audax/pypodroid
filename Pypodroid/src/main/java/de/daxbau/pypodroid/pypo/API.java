package de.daxbau.pypodroid.pypo;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.RequestParams;

public class API {

    private static String BASE_URL;

    private static AsyncHttpClient client = new AsyncHttpClient();


    public static RequestHandle get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        return client.get(getAbsoluteUrl(url), params, responseHandler);

    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

    public static void login(String username, String password, String baseURL)
    {
        if (baseURL != null) {
            BASE_URL = baseURL;
        }
        client.setBasicAuth(username, password);

    }
}
