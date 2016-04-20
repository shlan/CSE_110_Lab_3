package com.example.vguan.lab3.tests;

import com.example.vguan.lab3.MainActivity;
import com.example.vguan.lab3.R;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by vguan on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test() {

        super(MainActivity.class);
    }

    @UiThreadTest
    public void test_sum() {
        mainActivity = getActivity();

        Button button = (Button) mainActivity.findViewById(R.id.button1);

        EditText one = (EditText) mainActivity.findViewById(R.id.num1);
        one.setText("5");

        EditText two = (EditText) mainActivity.findViewById(R.id.num2);
        two.setText("10");

        button.performClick();

        TextView textView = (TextView) mainActivity.findViewById(R.id.sum);
        int tester = Integer.parseInt(textView.getText().toString()); //taking xml id sum's integer value

        int num1 = Integer.parseInt(one.getText().toString());
        int num2 = Integer.parseInt(two.getText().toString());

        assertEquals(num1-num2, tester);
    }
}
