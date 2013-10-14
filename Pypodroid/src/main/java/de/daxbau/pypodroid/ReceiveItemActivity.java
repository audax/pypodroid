package de.daxbau.pypodroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ReceiveItemActivity extends Activity {

    TextView mUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_item);

        mUrl = (TextView) findViewById(R.id.receivedUrlView);

        Intent intent = getIntent();
        String action = intent.getAction();

        if (Intent.ACTION_VIEW.equals(action)) {
            Uri data = intent.getData();
            try {
                mUrl.setText(data.getHost());
            } catch (NullPointerException e) {
                finish();
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.receive_item, menu);
        return true;
    }

    public void saveUrl(View view) {
        mUrl.setText("Sending!");

    }
    
}
