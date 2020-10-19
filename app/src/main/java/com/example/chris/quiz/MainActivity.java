package com.example.chris.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean questionOne;
    boolean questionTwo;
    boolean questionThree;
    boolean questionFour;
    boolean questionFive;
    boolean checkboxThree;
    boolean checkboxOne;
    boolean checkboxTwo;
    boolean checkboxFour;
    boolean isC;
    int totalScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void answerOne(View view) {
        checkboxOne = ((CheckBox) view).isChecked();
    }

    public void answerThree(View view) {
        checkboxThree = ((CheckBox) view).isChecked();
    }

    public void answerTwo(View view) {
        checkboxTwo = ((CheckBox) view).isChecked();
    }

    public void answerFour(View view) {
        checkboxFour = ((CheckBox) view).isChecked();
    }

    public void questionOneRadioButtons(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question_one_answer_one_radio_button:
                if (checked)
                    questionOne = true;
                break;
            case R.id.question_one_answer_two_radio_button:
                if (checked)
                    questionOne = false;
                break;
            case R.id.question_one_answer_three_radio_button:
                if (checked)
                    questionOne = false;
                break;
            case R.id.question_one_answer_four_radio_button:
                if (checked)
                    questionOne = false;
                break;
        }

    }

    public void questionTwoRadioButtons(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question_two_answer_one_radio_button:
                if (checked)
                    questionTwo = false;
                break;
            case R.id.question_two_answer_two_radio_button:
                if (checked)
                    questionTwo = false;
                break;
            case R.id.question_two_answer_three_radio_button:
                if (checked)
                    questionTwo = true;
                break;
            case R.id.question_two_answer_four_radio_button:
                if (checked)
                    questionTwo = false;
                break;
        }

    }

    public void questionThreeRadioButtons(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question_three_answer_one_radio_button:
                if (checked)
                    questionThree = false;
                break;
            case R.id.question_three_answer_two_radio_button:
                if (checked)
                    questionThree = false;
                break;
            case R.id.question_three_answer_three_radio_button:
                if (checked)
                    questionThree = false;
                break;
            case R.id.question_three_answer_four_radio_button:
                if (checked)
                    questionThree = true;
                break;
        }

    }

    public void questionFourRadioButtons(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question_four_answer_one_radio_button:
                if (checked)
                    questionFour = false;
                break;
            case R.id.question_four_answer_two_radio_button:
                if (checked)
                    questionFour = true;
                break;
            case R.id.question_four_answer_three_radio_button:
                if (checked)
                    questionFour = false;
                break;
            case R.id.question_four_answer_four_radio_button:
                if (checked)
                    questionFour = false;
                break;
        }

    }

    public void questionFiveRadioButtons(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question_five_answer_one_radio_button:
                if (checked)
                    questionFive = false;
                break;
            case R.id.question_five_answer_two_radio_button:
                if (checked)
                    questionFive = false;
                break;
            case R.id.question_five_answer_three_radio_button:
                if (checked)
                    questionFive = true;
                break;
            case R.id.question_five_answer_four_radio_button:
                if (checked)
                    questionFive = false;
                break;
        }

    }

    public void submit(View view) {

        if(checkboxFour || checkboxTwo)
            Toast.makeText(this ,"You have incorrect answers on the checkbox try again" , Toast.LENGTH_SHORT).show();

        else {
            TextView questionOneResult = findViewById(R.id.answer_one);
            questionOneResult.setText(("" + questionOne).toUpperCase());

            TextView questionTwoResult = findViewById(R.id.answer_two);
            questionTwoResult.setText(("" + questionTwo).toUpperCase());

            TextView questionThreeResult = findViewById(R.id.answer_three);
            questionThreeResult.setText(("" + questionThree).toUpperCase());

            TextView questionFourResult = findViewById(R.id.answer_four);
            questionFourResult.setText(("" + questionFour).toUpperCase());

            TextView questionFiveResult = findViewById(R.id.answer_five);
            questionFiveResult.setText(("" + questionFive).toUpperCase());

            EditText see = findViewById(R.id.see_description_view);
            isC = see.getText().toString().toLowerCase().equals("c");

            totalScore = 0;
            if (questionOne)
                totalScore++;
            if (questionTwo)
                totalScore++;
            if (questionThree)
                totalScore++;
            if (questionFour)
                totalScore++;
            if (questionFive)
                totalScore++;
            if (isC)
                totalScore++;
            if (checkboxThree)
                totalScore++;
            if (checkboxOne)
                totalScore++;

            double percent = (((double) totalScore * 100) / 8);
            Toast.makeText(this, "You got " + percent + " percent ", Toast.LENGTH_SHORT).show();

        }
    }
}
