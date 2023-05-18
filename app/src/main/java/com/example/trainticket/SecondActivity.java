package com.example.trainticket;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView dataMainActivity;
    private Button button;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        dataMainActivity = findViewById(R.id.dataUser);
        button = findViewById(R.id.button);


        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) {


            user = (User) bundleIntent.getSerializable(User.class.getSimpleName());


            dataMainActivity.setText("Имя пользователя: " + user.getName() + "\n"
                    + "Стоимость билета: "+ user.getPrice_Ticket() + "\n"
                    + "Место отъезда: "+ user.getPlace_of_departure() + "\n"
                    + "Время отъезда: "+ user.getTime_of_departure() + "\n"
                    + "Место приезда: "+ user.getPlace_of_arrival() + "\n"
                    + "Время приезда: "+ user.getTime_of_arrival());
        }


        button.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}