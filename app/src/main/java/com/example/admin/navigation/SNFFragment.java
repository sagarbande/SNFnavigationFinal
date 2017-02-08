package com.example.admin.navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sagar on 5/12/2016.
 */
public class SNFFragment extends Fragment {

    public SNFFragment() {

    }

    EditText edit1, edit2;
    Button btn;
    android.widget.TextView TextView;
    double value1, value2;
    double value3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.snf_layout, container, false);

        edit1 = (EditText) view.findViewById(R.id.edit1);
        edit2 = (EditText) view.findViewById(R.id.edit2);
        btn = (Button) view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().toString().isEmpty()) {
                    edit1.setError("Enter CLR");
                } else if (edit2.getText().toString().isEmpty()) {
                    edit2.setError("Enter FAT");
                } else {
                    calculate();
                }

            }
        });
    }

    public void calculate() {
        try {
            value1 = Double.valueOf(edit1.getText().toString());
            value2 = Double.valueOf(edit2.getText().toString());

            Log.d("value1", String.valueOf(value1));
            Log.d("value2", String.valueOf(value2));

            value3 = (0.25 * value1 + value2 * 0.21 + 0.36);

            //When the button is clicked, call the calculate method.

            TextView.setText(String.format("SNF: %.2f", value3));
        } catch (NumberFormatException e) {
            Log.d("value1", String.valueOf(value1));
            Log.d("value2", String.valueOf(value2));

            Log.d("Exception", String.valueOf(e));
        }

    }

