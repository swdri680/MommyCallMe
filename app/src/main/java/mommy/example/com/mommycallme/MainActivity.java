package mommy.example.com.mommycallme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker tp;
    TextView text;
    int hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tp = (TimePicker) findViewById(R.id.timePicker);
        text = (TextView) findViewById(R.id.text);

        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, "check", Toast.LENGTH_SHORT).show();
                text.setText(hourOfDay +"시"+minute+"분");
            }
        });

    }

}
