package com.example.ahmed150236.quizapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linear_Quize;
    private Button start;
    private TextView counter_text;
    private TextView score_text;
    private TextView final_score;
    private CountDownTimer counter;
    private int score = 0;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button_quest4, button_question6, submit;
    private RadioButton mRadio1, mRadio2, mRadio3, mRadio4, mRadio5;
    private EditText edit_text;
    private CheckBox mCheck1, mCheck2, mCheck3, mCheck4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear_Quize = (LinearLayout) findViewById(R.id.linear_Quiz);
        start = (Button) findViewById(R.id.start_button);
        counter_text = (TextView) findViewById(R.id.counter);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button_quest4 = (Button) findViewById(R.id.button_quest4);
        button_question6 = (Button) findViewById(R.id.button_question6);
        submit = (Button) findViewById(R.id.submit);
        score_text = (TextView) findViewById(R.id.score_id);
        final_score = (TextView) findViewById(R.id.final_score);
        mRadio1 = (RadioButton) findViewById(R.id.answer1_true);
        mRadio2 = (RadioButton) findViewById(R.id.answer2_false);
        mRadio3 = (RadioButton) findViewById(R.id.radioButton);
        mRadio4 = (RadioButton) findViewById(R.id.radioButton2);
        mRadio5 = (RadioButton) findViewById(R.id.radioButton3);
        edit_text = (EditText) findViewById(R.id.edit_text);
        mCheck1 = (CheckBox) findViewById(R.id.checkBox);
        mCheck2 = (CheckBox) findViewById(R.id.checkBox2);
        mCheck3 = (CheckBox) findViewById(R.id.checkBox3);
        mCheck4 = (CheckBox) findViewById(R.id.checkBox4);


        Question2();
        Question3();
        Question4();
        Question5();
        Question6();
        Submition();


    }


    /**
     * This method is called when the Start button is clicked.
     */
    public void Start(View view) {
        linear_Quize.setVisibility(View.VISIBLE);
        start.setVisibility(View.INVISIBLE);
        final_score.setVisibility(View.INVISIBLE);
        Counter_D();
    }


    // Question 1
    public void button4_anser(View view) {
        button4.setBackgroundResource(R.drawable.answer_wrong);
        Toast.makeText(getApplicationContext(), "Right Answer Is: Double" , Toast.LENGTH_LONG).show();
    }

    public void button3_anser(View view) {
        button3.setBackgroundResource(R.drawable.answer_right);
        score++;
        set_score();
    }

    public void button2_anser(View view) {
        button2.setBackgroundResource(R.drawable.answer_wrong);
        Toast.makeText(getApplicationContext(), "Right Answer Is: Double", Toast.LENGTH_LONG).show();
    }

    public void button1_anser(View view) {
        button1.setBackgroundResource(R.drawable.answer_wrong);
        Toast.makeText(getApplicationContext(), "Right Answer Is: Double", Toast.LENGTH_LONG).show();
    }


    //Question 2
    public void Question2() {
        mRadio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRadio1.setBackgroundResource(R.drawable.answer_right);
                score += 1;
                set_score();
            }
        });
        mRadio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRadio2.setBackgroundResource(R.drawable.answer_wrong);
                mRadio1.setBackgroundResource(R.drawable.answer_right);
                Toast.makeText(getApplicationContext(), "Right Answer Is: True" , Toast.LENGTH_LONG).show();

            }
        });
    }

    //Question 3
    public void Question3() {
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5.setBackgroundResource(R.drawable.answer_wrong);
                Toast.makeText(getApplicationContext(), "Right Answer Is: -32768 to 32767" , Toast.LENGTH_LONG).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6.setBackgroundResource(R.drawable.answer_right);
                score += 1;
                set_score();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button7.setBackgroundResource(R.drawable.answer_wrong);
                Toast.makeText(getApplicationContext(), "Right Answer Is: -32768 to 32767" , Toast.LENGTH_LONG).show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button8.setBackgroundResource(R.drawable.answer_wrong);
                Toast.makeText(getApplicationContext(), "Right Answer Is: -32768 to 32767" , Toast.LENGTH_LONG).show();
            }
        });

    }


    // Question4
    public void Question4() {
        button_quest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String tex = edit_text.getText().toString();
                if (tex.equalsIgnoreCase("central processing unit")) {
                    edit_text.setBackgroundResource(R.drawable.answer_right);
                    score += 1;
                } else {
                    edit_text.setBackgroundResource(R.drawable.answer_wrong);
                    Toast.makeText(getApplicationContext(), "Right Answer Is: central processing unit" , Toast.LENGTH_LONG).show();

                }
            }
        });

    }

    //Question 5
    public void Question5() {


        mRadio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRadio3.setBackgroundResource(R.drawable.answer_right);
                score += 1;
                set_score();
            }
        });
        mRadio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRadio4.setBackgroundResource(R.drawable.answer_wrong);
                Toast.makeText(getApplicationContext(), "Right Answer Is: Java.lang" , Toast.LENGTH_LONG).show();
            }
        });
        mRadio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRadio5.setBackgroundResource(R.drawable.answer_wrong);
                Toast.makeText(getApplicationContext(), "Right Answer Is: Java.lang" , Toast.LENGTH_LONG).show();
            }
        });

    }

    //Question 6
    public void Question6() {

        button_question6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheck1.isChecked() && !mCheck2.isChecked() && mCheck3.isChecked() && mCheck4.isChecked()) {
                    mCheck1.setBackgroundResource(R.drawable.answer_right);
                    mCheck2.setBackgroundResource(R.drawable.answer_wrong);
                    mCheck3.setBackgroundResource(R.drawable.answer_right);
                    mCheck4.setBackgroundResource(R.drawable.answer_right);
                    score += 1;
                    set_score();
                } else {
                    mCheck1.setBackgroundResource(R.drawable.answer_right);
                    mCheck2.setBackgroundResource(R.drawable.answer_wrong);
                    mCheck3.setBackgroundResource(R.drawable.answer_right);
                    mCheck4.setBackgroundResource(R.drawable.answer_right);
                    Toast.makeText(getApplicationContext(), "Right Answer Is: C++,Java and Python" , Toast.LENGTH_LONG).show();

                }

            }
        });

    }

    // set score
    public void set_score() {
        score_text.setText("score: " + score);
    }


    //counter Down Timer
    public void Counter_D() {
        counter = new CountDownTimer(15 * 1000, 1000) {
            @Override
            public void onTick(long l) {
                counter_text.setText("" + l / 1000);
            }

            @Override
            public void onFinish() {
                time_finshed();
                reset_all();
                set_score();
            }
        };
        counter.start();
    }

    //Submition
    public void Submition() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.cancel();
                time_finshed();
                reset_all();
                set_score();
            }
        });
    }

    //time finished
    public void time_finshed() {
        final_score.setVisibility(View.VISIBLE);
        final_score.setText("Your Score: " + score);
        Toast.makeText(getApplicationContext(), "Your Score : " + score, Toast.LENGTH_LONG).show();
        counter_text.setText("15");
        linear_Quize.setVisibility(View.INVISIBLE);
        start.setVisibility(View.VISIBLE);
    }

    //Reset all
    public void reset_all() {
        score = 0;
        button1.setBackgroundResource(R.drawable.answer_button);
        button2.setBackgroundResource(R.drawable.answer_button);
        button3.setBackgroundResource(R.drawable.answer_button);
        button4.setBackgroundResource(R.drawable.answer_button);
        button5.setBackgroundResource(R.drawable.answer_button);
        button6.setBackgroundResource(R.drawable.answer_button);
        button7.setBackgroundResource(R.drawable.answer_button);
        button8.setBackgroundResource(R.drawable.answer_button);
        mCheck1.setChecked(false);
        mCheck2.setChecked(false);
        mCheck3.setChecked(false);
        mCheck4.setChecked(false);
        mCheck1.setChecked(false);
        mCheck2.setChecked(false);
        mCheck3.setChecked(false);
        mCheck4.setChecked(false);

    }

}
