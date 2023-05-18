package com.example.trainticket;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText nameIn;
    private EditText price;
    private EditText place_of_departure;
    private EditText time_of_departure;
    private EditText place_of_arrival;
    private EditText time_of_arrival;
    private Button button;

    private String name;
    private String price_Ticket;
    private String Place_of_departure;
    private String Time_of_departure;
    private String Place_of_arrival;
    private String Time_of_arrival;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameIn = findViewById(R.id.nameIn);
        price = findViewById(R.id.price);
        place_of_departure = findViewById(R.id.place_of_departure);
        time_of_departure = findViewById(R.id.time_of_departure);
        place_of_arrival = findViewById(R.id.place_of_arrival);
        time_of_arrival = findViewById(R.id.time_of_arrival);
        button = findViewById(R.id.button);




        button.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            name = nameIn.getText().toString();
            price_Ticket = price.getText().toString();
            Place_of_departure = place_of_departure.getText().toString();
            Time_of_departure = time_of_departure.getText().toString();
            Place_of_arrival = place_of_arrival.getText().toString();
            Time_of_arrival = time_of_arrival.getText().toString();





            User user = new User(name, price_Ticket, Place_of_departure, Time_of_departure, Place_of_arrival, Time_of_arrival);
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(User.class.getSimpleName(), user);
            startActivity(intent);
        }
    };
}