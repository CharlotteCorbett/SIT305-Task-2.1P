package com.example.week1play;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button clearAllButton;
    Button calculateResultButton;

    Spinner unitSelector;
    Spinner sourceUnitSpinner;
    Spinner destinationUnitSpinner;
    EditText valueToConvert;
    TextView printResultValue;
    Conversion conversion;
    String sourceUnit;
    String destinationUnit;

    Double inputValue;
    String selectedUnits;





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

        conversion = new Conversion();

        addSpinner();



        valueToConvert = findViewById(R.id.valueToConvert);
        printResultValue = findViewById(R.id.printResultValue);
        calculateResultButton = findViewById(R.id.calculateResultButton);
        clearAllButton = findViewById(R.id.clearAllButton);



        calculateResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    destinationUnit = destinationUnitSpinner.getItemAtPosition(destinationUnitSpinner.getSelectedItemPosition()).toString();
                    sourceUnit = sourceUnitSpinner.getItemAtPosition(sourceUnitSpinner.getSelectedItemPosition()).toString();
                    // function that takes converted valueToConvert, then calculates and returns result
                    inputValue = conversion.inputValue = Double.parseDouble(valueToConvert.getText().toString());
                    selectedUnits = conversion.getSelectedUnits(sourceUnit, destinationUnit);

                } catch (NumberFormatException e) {
                    //
                    printResultValue.setText(R.string.invalid_input_please_enter_a_valid_number);
                }
                conversion.compute(selectedUnits);
//                printResultValue.setText(conversion.outputValue.toString());
                printResultValue.setText(conversion.outputValue.toString());
            }
        });


        clearAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueToConvert.setText("");
                printResultValue.setText("");
            }
        });


    }

    private void addSpinner() {
        // Create and initialise Spinners
        unitSelector = findViewById(R.id.unitTypeSpinner);
        // Create adapter for unit selection spinner
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                this,
                R.array.unitTypeArray,
                android.R.layout.simple_spinner_dropdown_item
        );
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSelector.setAdapter(adapter1);
        unitSelector.setOnItemSelectedListener(this);

        sourceUnitSpinner = findViewById(R.id.sourceUnitSpinner);
        destinationUnitSpinner = findViewById(R.id.destinationUnitSpinner);
    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        parent.getItemAtPosition(position);
        Array temp_adapter;
        if (position == 0) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this,
                    R.array.lengthOptions,
                    android.R.layout.simple_spinner_dropdown_item);
            sourceUnitSpinner.setAdapter(adapter);
            destinationUnitSpinner.setAdapter(adapter);
        }
        else if (position == 1) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this,
                    R.array.temperatureOptions,
                    android.R.layout.simple_spinner_dropdown_item);
            sourceUnitSpinner.setAdapter(adapter);
            destinationUnitSpinner.setAdapter(adapter);
        }
        else if (position == 2) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this,
                    R.array.weightOptions,
                    android.R.layout.simple_spinner_dropdown_item);
            sourceUnitSpinner.setAdapter(adapter);
            destinationUnitSpinner.setAdapter(adapter);
        }



    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



}










    


