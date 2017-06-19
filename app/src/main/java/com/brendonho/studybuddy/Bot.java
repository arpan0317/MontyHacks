package com.brendonho.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.AbsListView;
import android.widget.ListView;
import android.database.DataSetObserver;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Bot extends AppCompatActivity {

    private View mContentView;
    private View mLoadingView;
    private int mShortAnimationDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        final EditText stuff = (EditText) findViewById(R.id.editText);
        Button send = (Button) findViewById(R.id.button);
        final TextView you = (TextView) findViewById(R.id.you);
        final TextView bot = (TextView) findViewById(R.id.bot);
        final String link = "Here";
        Button over = (Button) findViewById(R.id.button2);
        Button ran = (Button) findViewById(R.id.button3);
        final Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_animator);
        bot.startAnimation(animation);

        over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String helper1234 = " ";
                helper1234 = "What can I help you with? Please pick from math, science, or english.";
                bot.setText(helper1234);
                stuff.setText("");
            }
                                });

        ran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String helper1234 = " ";
                int ran = 1 + (int)(Math.random() * (2));
                if (ran == 1){
                    helper1234 = "Please that this test to help us help you. " +
                            "What is the sin of 30 degrees? Please write in decimals. (Hint: it is a decimal.)";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (ran == 2){
                    helper1234 = "Please that this test to help us help you. " +
                            "What is pi radians in degrees? Please write degreee after the answer.";
                    bot.setText(helper1234);
                    stuff.setText("");
                }
            }
                               });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bot.startAnimation(animation);
                String stuffin = stuff.getText().toString();
                String youin = stuff.getText().toString();
                you.setText(youin);
                String helper1234 = " ";
                String corr = "Correct";
                String incorr = "Incorrect";
                Boolean bol = false;
                int counter = 0;
                int counter1 = 0;



                if (stuffin.equalsIgnoreCase("Math")) {
                    helper1234 = "What math course?";
                    bot.setText(helper1234);
                    stuff.setText("");
                }
                if (stuffin.equalsIgnoreCase("precalculus")) {
                    helper1234 = "What precalculus topic? Please pick from right triangle or degrees and radians.";
                    bot.setText(helper1234);
                    stuff.setText("");
                }
                if (stuffin.equalsIgnoreCase("right " + "triangle")) {
                    helper1234 = "Please that this test to help us help you. " +
                            "What is the sin of 30 degrees? Please write in decimals. (Hint: it is a decimal.)";
                    bot.setText(helper1234);
                    stuff.setText("");
                }


                if (stuffin.contains(".")) {
                    if (stuffin.equalsIgnoreCase("0.5")) {
                        helper1234 = "That is correct. The next question is: What is the arcsin of 1? " +
                                "Please enter your answer in degrees and put degrees after the number. " +
                                "(Hint: it is a certain number of degrees.)";
                        bot.setText(helper1234);
                        stuff.setText("");
                        counter++;
                    } else {
                        helper1234 = "That is incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. " +
                                "On the special right triangle, the sides are 1 as the shortest side, " +
                                "square root 3 as the middle side, and 2 for the hypotenuse. " +
                                "Since 30 degrees comes in between the middle side and the hypotenuse, " +
                                "opposite over hypotenuse would give you 1/2 or 0.5. The next question is: What is the arcsin of 1? " +
                                "Please answer in degrees and put degrees after the number. (Hint: it is a certain number of degrees.)";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }
                }


                if (stuffin.contains("degrees")) {
                    if (stuffin.equals("90 " + "degrees")) {
                        helper1234 = "That is correct. The next question is: What is the tan of 45 degrees? If it is a whole number, " +
                                "please write int after the answer. (Hint: it is a whole number.)";
                        bot.setText(helper1234);
                        stuff.setText("");
                        counter++;
                    } else {
                        helper1234 = "That is incorrect. The correct answer is 90. This is because the sin of 90 creates 1. " +
                                "If you graph it on the plane, you know that the y coordinate is sin and the sin of 90 comes out " +
                                "to be 1. The next question is: What is the tan of 45 degrees? If it is a whole number, " +
                                "please write int after the answer. (Hint: it is a whole number.)";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }
                }

                if (stuffin.contains("int")) {
                    if (stuffin.equals("1 " + "int")) {
                        helper1234 = "That is correct." + "Please type enter to see your report.";
                        bot.setText(helper1234);
                        stuff.setText("");
                        counter++;
                    } else {
                        helper1234 = "That is incorrect. The correct answer is 1. This is because tan is opposite over adjacent. " +
                                "The opposite of the 45 degree angle is 1 and the adjacent is also 1 which means " +
                                "that the tan of 45 would be 1/1 or 1. Please type enter to see your report.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }
                }

                if (stuffin.contains("enter")) {
                    if (counter == 0){
                        helper1234 = "You got " + counter + " " + "correct. That is not good. You should work on learning " +
                                "your special triangle and knowing the angles on them and the side measurements.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    } else if (counter == 1){
                        helper1234 = "You got " + counter + " " + "correct. That is not good. You should work on learning " +
                                "your special triangle and knowing the angles on them and the side measurements.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    } else if (counter ==2){
                        helper1234 = "You got " + counter + " " + "correct. That is good. You should work on reviewing " +
                                "the type of question you got wrong.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    } else if (counter == 3){
                        helper1234 = "You got " + counter + " " + "correct. That is excellent. You got a 100%. You should " +
                                "be ready for your next quiz or test. If you want, you can review some more.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }

                }

                if (stuffin.equalsIgnoreCase("degrees " + "and "+"radians")){
                    helper1234 = "Please that this test to help us help you. " +
                            "What is pi radians in degrees? Please write degreee after the answer.";
                    bot.setText(helper1234);
                    stuff.setText("");
                }

                if (stuffin.contains("degreee")) {
                    if (stuffin.equalsIgnoreCase("180 degreee")) {
                        helper1234 = "That is correct. The next question is: What is 90 degrees in radians? " +
                                "Please write over for the division sign and pi for pi.";
                        bot.setText(helper1234);
                        stuff.setText("");
                        counter1++;
                    } else {
                        helper1234 = "That is incorrect. The correct answer is 180 degree. This is because 360 degree " +
                                "equals 2 pi and so if you divide everything by 2, you get 180 degrees equals pi. " +
                                "The next question is: What is 90 degrees in radians? " +
                                "Please write over for the division sign and pi for pi.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }
                }


                if (stuffin.contains("over")) {
                    if (stuffin.equals("pi " + "over " + "2")) {
                        helper1234 = "That is correct. The next question is: what is 9 pi over 2 radians in degrees? " +
                                "Please write degreees after your answer.";
                        bot.setText(helper1234);
                        stuff.setText("");
                        counter1++;
                    } else {
                        helper1234 = "That is incorrect. The correct answer is pi over 2. This is because 360 degrees equals 2 pi " +
                                "and so if you divide everything by 4, you get 90 degrees equals pi over 2. " +
                                "The next question is: what is 9 pi over 2 radians in degrees? " +
                                "Please write degreees after your answer.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }
                }

                if (stuffin.contains("degreees")) {
                    if (stuffin.equals("810 " + "degreees")) {
                        helper1234 = "That is correct." + "Please type enter to see your report.";
                        bot.setText(helper1234);
                        stuff.setText("");
                        counter1++;
                    } else {
                        helper1234 = "That is incorrect. The correct answer is 810 degrees. This is because 9 pi over 2 times " +
                                "360 over 2 pi is 810. Please type enter1 to see your report.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }
                }
                if (stuffin.contains("enter1")) {
                    if (counter1==0){
                        helper1234 = "You got " + counter1 + " " + "correct. You should work more on this unit to do better" +
                                "on your test. Going over the ways to convert from degrees to radians and vice versa " +
                                "will be helful.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }
                    else if (counter1 == 1){
                        helper1234 = "You got " + counter1 + " " + "correct. You should work more on this unit to do better" +
                                "on your test. Going over the ways to convert from degrees to radians and vice versa " +
                                "will be helful.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    } else if (counter1 == 2){
                        helper1234 = "You got " + counter1 + " " + "correct. That is good. You should try to go over the " +
                                "type of problems you got wrong to get a 100 on your test or quiz.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    } else if (counter1 == 3){
                        helper1234 = "You got " + counter1 + " " + "correct. You did excellent. You got a 100%. You are" +
                                " most likely ready for this next quiz or test.";
                        bot.setText(helper1234);
                        stuff.setText("");
                    }

                }

        }


    });
}
}




