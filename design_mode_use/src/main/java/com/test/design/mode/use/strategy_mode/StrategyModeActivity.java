package com.test.design.mode.use.strategy_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 策略模式
 */
public class StrategyModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_mode);

        TravelInterface travelInterface = new TrainTravel();
        WhichTransportation which = new WhichTransportation(travelInterface);
        Log.e(TAG, which.select());
        Log.e(TAG, "----------------------");
        which.setTravelInterface(new BusTravel());
        Log.e(TAG, which.select());
        Log.e(TAG, "----------------------");
        which.setTravelInterface(new AirplaneTravel());
        Log.e(TAG, which.select());
    }
}