package com.example.test_m3;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.test_m3.databinding.ActivityMainBinding;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.DynamicColorsOptions;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        EdgeToEdge.enable(this);
        DynamicColorsOptions options = new DynamicColorsOptions.Builder()
                .setThemeOverlay(R.style.Theme_MyApp)
                .build();

        DynamicColors.applyToActivitiesIfAvailable(getApplication(), options);

        // Khởi tạo View Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // Sự kiện click cho Floating Action Button
        binding.fab.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "FAB clicked!", Toast.LENGTH_SHORT).show()
        );

        // Sự kiện click cho Button
        binding.materialButton.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show()
        );
    }
}
