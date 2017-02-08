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
import android.widget.Toast;

/**
 * Created by sagar on 5/12/2016.
 */
public class TSFragment extends Fragment{

    EditText Edit1;
    EditText Edit2;
    EditText Edit3;
    android.widget.TextView TextView;
    Button btn;
    private Float Value4;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.ts_layout, container, false);
        Edit1 = (EditText)view.findViewById(R.id.edit1);
        Edit2 = (EditText)view.findViewById(R.id.edit2);
        Edit3 = (EditText)view.findViewById(R.id.edit3);
        TextView = (android.widget.TextView)view.findViewById(R.id.textView);
        btn = (Button)view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Edit1.getText().toString().isEmpty()) {
                    Edit1.setError("Enter Value1");
                } else if (Edit2.getText().toString().isEmpty()) {
                    Edit2.setError("Enter Value2");
                } else if (Edit3.getText().toString().isEmpty()) {
                    Edit3.setError("Enter Value3");
                } else {
                    Toast.makeText(TSFragment.this.getActivity(), "It wont Calculate", Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }
}