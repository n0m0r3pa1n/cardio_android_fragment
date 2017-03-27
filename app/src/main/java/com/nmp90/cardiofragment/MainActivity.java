package com.nmp90.cardiofragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.card.payment.CardIOFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardIOFragment fragment = new CardIOFragment();
        Bundle args = new Bundle();
        args.putBoolean(CardIOFragment.EXTRA_SUPPRESS_MANUAL_ENTRY, true);
        args.putBoolean(CardIOFragment.EXTRA_HIDE_CARDIO_LOGO, true);
        args.putBoolean(CardIOFragment.EXTRA_SUPPRESS_CONFIRMATION, true);
        fragment.setArguments(args);
        getFragmentManager().beginTransaction().add(R.id.container, fragment, "CARDIO").commit();
    }
}
