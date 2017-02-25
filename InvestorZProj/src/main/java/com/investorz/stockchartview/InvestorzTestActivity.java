package com.investorz.stockchartview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.LaunchActivity;

public class InvestorzTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investorz_test);

        TextView startMessagingButton = (TextView) findViewById(R.id.start_messaging_button);
        startMessagingButton.setText(LocaleController.getString("StartMessaging", R.string.StartMessaging).toUpperCase());
        startMessagingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(InvestorzTestActivity.this, LaunchActivity.class);
                intent2.putExtra("fromInvz", true);
                startActivity(intent2);
                finish();
            }
        });

    }
}
