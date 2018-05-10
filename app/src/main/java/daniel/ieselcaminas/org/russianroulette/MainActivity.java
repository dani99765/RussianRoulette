package daniel.ieselcaminas.org.russianroulette;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.id.button1;

public class MainActivity extends AppCompatActivity {
    int answer;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button reloadButton;
    private TextView textViewName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRandom();

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        reloadButton = (Button) findViewById(R.id.reloadButton);
        textViewName = (TextView) findViewById(R.id.textView2);



        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int number = 1;

                if (number == answer) {
                    win();
                } else {
                    button1.setEnabled(false);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int number = 2;

                if (number == answer) {
                    win();
                } else {
                    button2.setEnabled(false);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int number = 3;

                if (number == answer) {
                    win();
                } else {
                    button3.setEnabled(false);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int number = 4;

                if (number == answer) {
                    win();
                } else {
                    button4.setEnabled(false);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int number = 5;

                if (number == answer) {
                    win();
                } else {
                    button5.setEnabled(false);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int number = 6;

                if (number == answer) {
                    win();
                } else {
                    button6.setEnabled(false);
                }
            }
        });

        reloadButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textViewName.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                textViewName.setText("");
                getRandom();
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);


            }
        });
    }


    private void getRandom() {
        answer = (int) (Math.random() * (6) + 1);
    }

    public void win() {
        textViewName.setBackgroundColor(Color.RED);
        textViewName.setText("BANG!!!!!");
    }


}




