package ro.so.android.galatandiana;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InstructionsActivity extends AppCompatActivity {
    private static final String TAG = "Lab02";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, getClass().getSimpleName() + " onCreate");

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_instructions);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.instructionsRoot),
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

        Button buttonInstructionsBack = findViewById(R.id.buttonInstructionsBack);

        buttonInstructionsBack.setOnClickListener(v -> {
            Log.d(TAG, "Inchidem InstructionsActivity");
            finish();
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