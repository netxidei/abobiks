package com.example.lerkanew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Display6 extends AppCompatActivity {
    private TextView mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display6);
        mTimer = (TextView) findViewById(R.id.bb);
        new CountDownTimer(60000, 1000) {

            //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
            public void onTick(long millisUntilFinished) {
                mTimer.setText("Отправить код повторно можно /n будет через  "
                        + millisUntilFinished / 1000 + "секунд");
            }

            @Override
            public void onFinish() {
                mTimer.setText("Отправить код повторно");
            }
        }
                .start();
    }
}
    }
}