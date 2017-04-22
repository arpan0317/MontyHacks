package com.brendonho.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stuffin = stuff.getText().toString();
                String youin = stuff.getText().toString();
                String helper1234 = " ";
                String corr = "Correct";
                String incorr = "Incorrect";
                switch (stuffin) {
                    case "math":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        you.setText("math");
                        stuff.setText("");
                        break;
                    case "Math":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        you.setText("math");
                        stuff.setText("");
                        break;
                    case "math ":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        you.setText("math");
                        stuff.setText("");
                        break;
                    case "Math ":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        you.setText("math");
                        stuff.setText("");
                        break;
                    case "science":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        you.setText("science");
                        stuff.setText("");
                        break;
                    case "Science":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        you.setText("science");
                        stuff.setText("");
                        break;
                    case "science ":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        you.setText("science");
                        stuff.setText("");
                        break;
                    case "Science ":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        you.setText("science");
                        stuff.setText("");
                        break;
                    case "english":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        you.setText("english");
                        stuff.setText("");
                        break;
                    case "English":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        you.setText("english");
                        stuff.setText("");
                        break;
                    case "english ":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        you.setText("english");
                        stuff.setText("");
                        break;
                    case "English ":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        you.setText("english");
                        stuff.setText("");
                        break;
                    case "precalculus":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        you.setText("precalculus");
                        stuff.setText("");
                        break;
                    case "Precalculus":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        you.setText("precalculus");
                        stuff.setText("");
                        break;
                    case "precalc":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        you.setText("precalculus");
                        stuff.setText("");
                        break;
                    case "Precalc":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        you.setText("precalculus");
                        stuff.setText("");
                        break;
                    case "al2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        you.setText("al2");
                        stuff.setText("");
                        break;
                    case "algebra 2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        you.setText("al2");
                        stuff.setText("");
                        break;
                    case "Al2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        you.setText("al2");
                        stuff.setText("");
                        break;
                    case "Algebra 2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        you.setText("al2");
                        stuff.setText("");
                        break;
                    case "geo":
                        helper1234 = "What topic in geometry?";
                        bot.setText(helper1234);
                        you.setText("geo");
                        stuff.setText("");
                        break;
                    case "geometry":
                        helper1234 = "What topic in geometry?";
                        bot.setText(helper1234);
                        you.setText("geo");
                        stuff.setText("");
                        break;
                    case "Geometry":
                        helper1234 = "What topic in geometry?";
                        bot.setText(helper1234);
                        you.setText("geo");
                        stuff.setText("");
                        break;
                    case "right triangle":
                        helper1234 = "Please take this test to help us help you. " +
                                "What is the sin of 30 degrees?";
                        bot.setText(helper1234);
                        you.setText("right triangle");
                        stuff.setText("");
                        break;
                    case "Right Triangle":
                        helper1234 = "Please take this test to help us help you. " +
                                "What is the sin of 30 degrees?";
                        bot.setText(helper1234);
                        you.setText("right triangle");
                        stuff.setText("");
                        break;
                    case ".5":
                        bot.setText("Correct. Type \"enter\" for next question.");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "1/2":
                        bot.setText("Correct. Type \"enter\" for next question.");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "0.1":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "0.2":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "0.4":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "0.0":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "0.5":
                        bot.setText("Correct. Type \"enter\" for next question.");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "enter":
                        bot.setText("What is the arcsin of 1?");
                        you.setText("0.5");
                        stuff.setText("");
                        break;
                    case "enter1":
                        bot.setText("What is the tan of 60 degrees? Type \"sqrt\" for square root.");
                        you.setText("enter1");
                        stuff.setText("");
                        break;
                    case "90":
                        bot.setText("Correct. Type \"enter1\" for the next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "80":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "70":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "60":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "50":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "40":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "30":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "sqrt3":
                        bot.setText("Correct. Type \"enter2\" for the next question.");
                        you.setText("sqrt3");
                        stuff.setText("");
                        break;
                    case "sqrt1":
                        bot.setText("Incorrect. Tangent is opposite over adjacent. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 60 degrees comes in between the short side and the hypotenuse, tangent over adjacent would give you square root 3 over 1.Type \"enter2\" for the next question.");
                        you.setText("sqrt3");
                        stuff.setText("");
                        break;
                    case "sqrt2":
                        bot.setText("Incorrect. Tangent is opposite over adjacent. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 60 degrees comes in between the short side and the hypotenuse, tangent over adjacent would give you square root 3 over 1.Type \"enter2\" for the next question.");
                        you.setText("sqrt3");
                        stuff.setText("");
                        break;
                    case "sqrt4":
                        bot.setText("Incorrect. Tangent is opposite over adjacent. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 60 degrees comes in between the short side and the hypotenuse, tangent over adjacent would give you square root 3 over 1.Type \"enter2\" for the next question.");
                        you.setText("sqrt3");
                        stuff.setText("");
                        break;
                    default:
                        String one = "Sorry, I can't help you";
                        String two = "I'm not sure I understand";
                        String three = "State a valid command";
                        double rand = Math.random();
                        if(rand <= 0.33){
                            bot.setText(one);
                        }else if(rand <= 0.66){
                            bot.setText(two);
                        }else{
                            bot.setText(three);
                        }
                        stuff.setText("");
                        break;

                }





        }
    });
}
}




