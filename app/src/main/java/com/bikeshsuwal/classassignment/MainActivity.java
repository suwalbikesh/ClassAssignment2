package com.bikeshsuwal.classassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bikeshsuwal.classassignment.Percentage.Percentage;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etName, etFirst, etSecond, etThird;
    private Button btnCalculated;
    private TextView txtPercentage;

    int first, second, third, result;
    String name, viewname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        etThird = findViewById(R.id.etThird);
        btnCalculated = findViewById(R.id.btnCalculated);
        txtPercentage = findViewById(R.id.txtPercentage);

        btnCalculated.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etName.getText().toString())){
            etName.setError("Please Enter Name");
            return;
        }

        if (TextUtils.isEmpty(etFirst.getText().toString())){
            etFirst.setError("Please Enter First Marks");
            return;
        }

        if (TextUtils.isEmpty(etSecond.getText().toString())){
            etSecond.setError("Please Enter Second Marks");
            return;
        }
        if (TextUtils.isEmpty(etThird.getText().toString())){
            etThird.setError("Please Enter Third Marks");
            return;
        }

        name = etName.getText().toString();
        first = Integer.parseInt(etFirst.getText().toString());
        second = Integer.parseInt(etSecond.getText().toString());
        third = Integer.parseInt(etThird.getText().toString());

        switch (v.getId()){
            case R.id.btnCalculated:
                Percentage percentage = new Percentage(name,first,second,third);
                result = percentage.TotalPercentage();
                viewname = percentage.Name();
                break;
        }

        txtPercentage.append("Name: "+viewname+"             Percentage: "+result+System.lineSeparator());
        etName.getText().clear();
        etFirst.getText().clear();
        etSecond.getText().clear();
        etThird.getText().clear();

    }
}
