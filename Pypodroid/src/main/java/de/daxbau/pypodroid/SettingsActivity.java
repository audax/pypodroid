package de.daxbau.pypodroid;

import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity {

    public static final String KEY_PREF_USERNAME = "pref_key_username";
    public static final String KEY_PREF_PASSWORD = "pref_key_password";
    public static final String KEY_PREF_URL = "pref_key_pypo_url";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }


}
