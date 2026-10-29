package ro.so.android.galatandiana;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Lab03";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, getClass().getSimpleName() + " onCreate");

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (view, windowInsets) -> {
                    Insets insets = windowInsets.getInsets(
                            WindowInsetsCompat.Type.systemBars()
                                    | WindowInsetsCompat.Type.displayCutout()
                    );
                    view.setPadding(
                            insets.left, insets.top,
                            insets.right, insets.bottom
                    );
                    return windowInsets;
                }
        );
        Log.d(TAG, getClass().getSimpleName() + " PID=" + android.os.Process.myPid());

        Button buttonStart = findViewById(R.id.buttonStart);

        buttonStart.setOnClickListener(v -> {
            Log.d(TAG, "Deschidem GameActivity");
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);
        });

        Button buttonInstructions = findViewById(R.id.buttonInstructions);

        buttonInstructions.setOnClickListener(v -> {
            Log.d(TAG, "Deschidem InstructionsActivity");
            Intent intent = new Intent(MainActivity.this, InstructionsActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, getClass().getSimpleName() + " onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, getClass().getSimpleName() + " onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, getClass().getSimpleName() + " onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, getClass().getSimpleName() + " onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, getClass().getSimpleName() + " onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, getClass().getSimpleName() + " onDestroy");
    }
}
