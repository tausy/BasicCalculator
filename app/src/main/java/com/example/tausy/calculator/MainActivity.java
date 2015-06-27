package com.example.tausy.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {


    EditText operand1;
    EditText operand2;
    Button btnPlus;
    Button btnSubtract;
    Button btnMultiply;
    Button btnDivide;
    //Button btnClear;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.edit_operand1);
        operand2 = (EditText) findViewById(R.id.edit_operand2);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        //btnClear = (Button) findViewById(R.id.btnClear);
        result = (TextView) findViewById(R.id.text_result);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //process addition of numbers
    public void processAddition(View view){

        Float tempRes = Float.parseFloat(operand1.getText().toString()) + Float.parseFloat(operand2.getText().toString());
        result.setText(tempRes.toString());
    }

    //process subtraction of numbers
    public void processSubtraction(View view){

        Float tempRes = Float.parseFloat(operand1.getText().toString()) - Float.parseFloat(operand2.getText().toString());
        result.setText(tempRes.toString());

    }

    //process multiplication of numbers
    public void processMultiplication(View view){

        Float tempRes = Float.parseFloat(operand1.getText().toString()) * Float.parseFloat(operand2.getText().toString());
        result.setText(tempRes.toString());

    }

    //process division of numbers
    public void processDivision(View view){

        Float tempRes = Float.parseFloat(operand1.getText().toString()) / Float.parseFloat(operand2.getText().toString());
        result.setText(tempRes.toString());

    }

    //clear all fields
    public void clearFields(View view){

        operand1.setText("");
        operand2.setText("");
        result.setText("00.00");
    }

}
