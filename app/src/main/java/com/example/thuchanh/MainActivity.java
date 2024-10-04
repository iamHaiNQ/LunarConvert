package com.example.thuchanh;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText solarDay, solarMonth, solarYear, lunarDay, lunarMonth, lunarYear, lunarLeap;
    Button btnConvertSolarToLunar, btnConvertLunarToSolar;
    TextView lunarResult, solarResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solarDay = findViewById(R.id.solarDay);
        solarMonth = findViewById(R.id.solarMonth);
        solarYear = findViewById(R.id.solarYear);
        lunarDay = findViewById(R.id.lunarDay);
        lunarMonth = findViewById(R.id.lunarMonth);
        lunarYear = findViewById(R.id.lunarYear);
        lunarLeap = findViewById(R.id.lunarLeap);

        btnConvertSolarToLunar = findViewById(R.id.btnConvertSolarToLunar);
        btnConvertLunarToSolar = findViewById(R.id.btnConvertLunarToSolar);

        lunarResult = findViewById(R.id.lunarResult);
        solarResult = findViewById(R.id.solarResult);

        // Convert Solar to Lunar
        btnConvertSolarToLunar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = Integer.parseInt(solarDay.getText().toString());
                int month = Integer.parseInt(solarMonth.getText().toString());
                int year = Integer.parseInt(solarYear.getText().toString());

                int[] lunarDate = LunarCalendar.convertSolar2Lunar(day, month, year, 7.0);
                lunarResult.setText("Lunar Date: " + Arrays.toString(lunarDate));
            }
        });

        // Convert Lunar to Solar
        btnConvertLunarToSolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = Integer.parseInt(lunarDay.getText().toString());
                int month = Integer.parseInt(lunarMonth.getText().toString());
                int year = Integer.parseInt(lunarYear.getText().toString());
                int leap = Integer.parseInt(lunarLeap.getText().toString());

                int[] solarDate = LunarToSolar.convertLunar2Solar(day, month, year, leap, 7.0);
                solarResult.setText("Solar Date: " + Arrays.toString(solarDate));
            }
        });
    }
}
