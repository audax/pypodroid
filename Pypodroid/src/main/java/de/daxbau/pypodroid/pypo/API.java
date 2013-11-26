package de.daxbau.pypodroid.pypo;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class API {

    private static String BASE_URL = "http://192.168.178.27:8000";

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

    public static void setCookieStore(PersistentCookieStore cookieStore) {
        client.setCookieStore(cookieStore);
    }


    /**
     *
     *
     * @param username
     * @param password
     * @param handler
     * @throws java.lang.IllegalArgumentException
     */
    public static void login(String username, String password, String baseURL,
                             AsyncHttpResponseHandler handler)
    {
        if (baseURL != null) {
            BASE_URL = baseURL;
        }
        client.setBasicAuth(username, password);
        get("/api/items/", null, handler);

    }
}
