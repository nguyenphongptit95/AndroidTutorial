package activity.com.example.nguyenphong.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String msg = "Android: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "onCreate evt");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "onStart evt");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop evt");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy evt");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "onPause evt");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "onResume evt");
    }
}
