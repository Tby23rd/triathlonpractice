package com.example.currencyconverter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupCurrency;
    EditText edittxtCurrency;
    TextView txtViewResult;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setLogo(R.mipmap.ic_launcher_round);

        radioGroupCurrency = findViewById(R.id.radioGroupCurrency);
        edittxtCurrency = findViewById(R.id.edittxtCurrency);
        txtViewResult = findViewById(R.id.txtViewResult);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener((View view)->{
if(radioGroupCurrency.getCheckedRadioButtonId() ==-1){
    Toast.makeText(this,"Please select currency type", Toast.LENGTH_SHORT).show();
}else if(
    edittxtCurrency.getText().toString().isEmpty()
) Toast.makeText(this, "Please enter input currency", Toast.LENGTH_SHORT).show();
         else{
             double inputCurrency;
             double outputCurrency = 0;
             try{
       inputCurrency = Double.parseDouble(edittxtCurrency.getText().toString());
            if(inputCurrency <= 0){
                     Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                     txtViewResult.setText("");
                 } else if (radioGroupCurrency.getCheckedRadioButtonId()==R.id.radioBtnCanadian){

                 }
            if(inputCurrency>=100000){
                Toast.makeText(this, "Input amount should be less than 100k", Toast.LENGTH_SHORT).show();
            txtViewResult.setText("");
            }else if (radioGroupCurrency.getCheckedRadioButtonId()==R.id.radioBtnCanadian){
                     outputCurrency = inputCurrency *0.5;
                     Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                     txtViewResult.setText(String.format("Converted currency:%.2fCAD", outputCurrency));
                 }else if (radioGroupCurrency.getCheckedRadioButtonId()==R.id.radioBtnPesos){
                     outputCurrency = inputCurrency/5;
                     Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                     txtViewResult.setText(String.format("Converted currency:%.2fPesos", outputCurrency));
                 }else {
                outputCurrency = inputCurrency*10;
                     Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                     txtViewResult.setText(String.format("Converted currency:%.2feuros", outputCurrency));
                 }
             }catch(Exception e){
                 Log.d("CURRENCYCALC", "Invalid Currency");
                 Toast.makeText(this, "Please enter a valid entry", Toast.LENGTH_SHORT).show();
                 txtViewResult.setText("Invalid input currency");
             }
}       }
                );
radioGroupCurrency.setOnCheckedChangeListener((RadioGroup radioGroup, int i)->{
    RadioButton checkedRadbtnText = findViewById(i);
    String checkedRadBtnText = checkedRadbtnText.getText().toString();
    Toast.makeText(this, "Clicked on", Toast.LENGTH_SHORT).show();
});
    }
}