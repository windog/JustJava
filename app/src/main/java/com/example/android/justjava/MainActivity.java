package com.example.android.justjava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/* this app displays an order form to order coffee.
* */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* this method is called when the order button is clicked.
    * */
    public void submitOrder(View view) {
        display(2);
        disPlayPice(2 * 6);
    }

    /*  this method displays the given quantity value on the screen.
    * */
    private void  display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.tvQuantity);
        quantityTextView.setText("" + number);
    }

    /*  this method displays the given quantity value on the screen.
    * */
    private void disPlayPice(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.tvPrice);
        quantityTextView.setText(NumberFormat.getCurrencyInstance().format(number));  //getCurrencyInstance得到的是当前系统的货币单位
    }
}
