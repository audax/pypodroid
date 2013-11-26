package de.daxbau.pypodroid;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by dax on 26.11.13.
 */
public class SettingsFragment extends PreferenceFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
