package com.example.a1_mipt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button changeTextButton;
    private Button changeColorButton;
    private boolean isTextColorChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        textView = findViewById(R.id.textView);
        changeTextButton = findViewById(R.id.changeTextButton);
        changeColorButton = findViewById(R.id.changeColorButton);

        // Set click listener for the change text button
        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text when the button is clicked
                textView.setText("Text Changed!");
                // Reset text color to the default color
                textView.setTextColor(getResources().getColor(android.R.color.black));
                isTextColorChanged = false;
            }
        });

        // Set click listener for the change color button
        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change text color when the button is clicked
                if (!isTextColorChanged) {
                    textView.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                    isTextColorChanged = true;
                } else {
                    // Reset text color to the default color
                    textView.setTextColor(getResources().getColor(android.R.color.black));
                    isTextColorChanged = false;
                }
            }
        });
    }
}
