package com.example.okno2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void i1(View view) {
        Toast muToast = Toast.makeText(getApplicationContext(),
                "Вы нажали на кошечку!",
                Toast.LENGTH_LONG);
        muToast.setGravity(Gravity.BOTTOM,0,0);
        muToast.show();
    }

    public void i2(View view) {
        Toast muToast = Toast.makeText(getApplicationContext(),
                "Вы нажали на собачку!",
                Toast.LENGTH_LONG);
        muToast.setGravity(Gravity.BOTTOM,0,0);
        muToast.show();
    }

    public void i3(View view) {
        Toast muToast = Toast.makeText(getApplicationContext(),
                "Вы нажали на пуму!",
                Toast.LENGTH_LONG);
        muToast.setGravity(Gravity.BOTTOM,0,0);
        muToast.show();
    }
}
