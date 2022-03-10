package com.example.l7t4_5;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TextWatcher{

    TextView textView;
    EditText editText;
    EditText Edit_Text_OUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        editText = (EditText) findViewById(R.id.editText);

        Edit_Text_OUT = (EditText) findViewById(R.id.editText);
        Edit_Text_OUT.addTextChangedListener((TextWatcher) this);
    }
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }
    public void afterTextChanged(Editable s) {
        //Reflect the value entered in TextView in real time
        textView.setText(s);
    }
}