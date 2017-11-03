package fr.minint.ppol.dostl.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String VALUE = Log.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String bjr = "Bonjour ! ";
        String msg = "Je suis un message dans le Log. ";
        int a = 5;
        int b = 3;
        int mult = a*b;
        int div = a/b;
        int mod = a%b;
        float f = (float)a/b;
        double d = (double)a/b;

        Log.v(TAG, "Verbose OnCreate Method");
        Log.d(TAG, "Debug OnCreate Method");
        Log.i(TAG, "Info OnCreate Method");
        Log.w(TAG, "Warning OnCreate Method");
        Log.e(TAG, "Error OnCreate Method");

        Log.d(VALUE, "msg : " + bjr + msg);
        Log.i(VALUE, a + " x " + b + " = " + mult);
        Log.i(VALUE, a + " / " + b + " = " + div +"," + mod + " (division Euclidienne)");
        Log.i(VALUE, a + " / " + b + " = " + f + " (en float)");
        Log.i(VALUE, a + " / " + b + " = " + d + " (en double)");

    }
}
