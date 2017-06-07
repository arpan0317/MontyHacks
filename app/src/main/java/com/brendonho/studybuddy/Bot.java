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
        final Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_animator);
        bot.startAnimation(animation);



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

                if (stuffin.equalsIgnoreCase("Math")) {
                    helper1234 = "What math course? Please pick from precalculus or geometry.";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (stuffin.equalsIgnoreCase("Science")){
                    helper1234 = "What science course? Please pick from chemistry or physics.";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (stuffin.equalsIgnoreCase("English")){
                    helper1234 = "What english topic? Please pick from grammer or book";
                    bot.setText(helper1234);
                    stuff.setText("");
                }

                if (stuffin.equalsIgnoreCase("precalculus")) {
                    helper1234 = "What precalculus topic?";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (stuffin.equalsIgnoreCase("geometry")){
                    helper1234 = "What geometry topic?";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (stuffin.equalsIgnoreCase("chemistry")){
                    helper1234 = "What chemistry topic?";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (stuffin.equalsIgnoreCase("physics")){
                    helper1234 = "What physics topic?";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (stuffin.equalsIgnoreCase("grammer")){
                    helper1234 = "What grammer topic?";
                    bot.setText(helper1234);
                    stuff.setText("");
                } else if (stuffin.equalsIgnoreCase("book")){
                    helper1234 = "What book?";
                    bot.setText(helper1234);
                    stuff.setText("");
                }







                /**switch (stuffin) {

                    case "math":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Math":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "math ":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Math ":
                        helper1234 = "What math course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "science":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Science":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "science ":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Science ":
                        helper1234 = "What science course?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "english":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "English":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "english ":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "English ":
                        helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "precalculus":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Precalculus":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "precalc":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Precalc":
                        helper1234 = "What precalculus topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "al2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "algebra 2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Al2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Algebra 2":
                        helper1234 = "What al2 topic?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "geo":
                        helper1234 = "What topic in geometry?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "geometry":
                        helper1234 = "What topic in geometry?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Geometry":
                        helper1234 = "What topic in geometry?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "right triangle":
                        helper1234 = "Please take this test to help us help you. " +
                                "What is the sin of 30 degrees?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case "Right Triangle":
                        helper1234 = "Please take this test to help us help you. " +
                                "What is the sin of 30 degrees?";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;
                    case ".5":
                        bot.setText("Correct. Type \"enter\" for next question.");
                        stuff.setText("");
                        break;
                    case "1/2":
                        bot.setText("Correct. Type \"enter\" for next question.");
                        stuff.setText("");
                        break;
                    case "0.1":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        stuff.setText("");
                        break;
                    case "0.2":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        stuff.setText("");
                        break;
                    case "0.4":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        stuff.setText("");
                        break;
                    case "0.0":
                        bot.setText("Incorrect. The correct answer is 0.5. This is because sin is opposite over hypotenuse. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 30 degrees comes in between the middle side and the hypotenuse, opposite over hypotenuse would give you 1/2 or 0.5.Type \"enter\" for next question.");
                        stuff.setText("");
                        break;
                    case "0.5":
                        bot.setText("Correct. Type \"enter\" for next question.");
                        stuff.setText("");
                        break;
                    case "enter":
                        bot.setText("What is the arcsin of 1?");
                        stuff.setText("");
                        break;
                    case "enter1":
                        bot.setText("What is the tan of 60 degrees? Type \"sqrt\" for square root.");
                        stuff.setText("");
                        break;
                    case "90":
                        bot.setText("Correct. Type \"enter1\" for the next question.");
                        stuff.setText("");
                        break;
                    case "80":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        stuff.setText("");
                        break;
                    case "70":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        stuff.setText("");
                        break;
                    case "60":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        stuff.setText("");
                        break;
                    case "50":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        stuff.setText("");
                        break;
                    case "40":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        stuff.setText("");
                        break;
                    case "30":
                        bot.setText("Incorrect. The correct answer is 90. Arcsin is asking for what angle creates the given measurement. In this case, the given measurenment is 1. This means that it is on the y axis at a height of 1. We know that the special right triangle that contains the value of 1 is the 45 45 90 triangle. The angle that creates a 1 by using oppoosite over adjacent is 90 degrees. Type \"enter1\" for the next question.");
                        stuff.setText("");
                        break;
                    case "sqrt3":
                        bot.setText("Correct. Type \"feedback\" for the next question.");
                        stuff.setText("");
                        break;
                    case "sqrt1":
                        bot.setText("Incorrect. Tangent is opposite over adjacent. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 60 degrees comes in between the short side and the hypotenuse, tangent over adjacent would give you square root 3 over 1.Type \"enter2\" for the next question.");
                        stuff.setText("");
                        break;
                    case "sqrt2":
                        bot.setText("Incorrect. Tangent is opposite over adjacent. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 60 degrees comes in between the short side and the hypotenuse, tangent over adjacent would give you square root 3 over 1.Type \"enter2\" for the next question.");
                        stuff.setText("");
                        break;
                    case "sqrt4":
                        bot.setText("Incorrect. Tangent is opposite over adjacent. On the special right triangle, the sides are 1 as the shortest side, square root 3 as the middle side, and 2 for the hypotenuse. Since 60 degrees comes in between the short side and the hypotenuse, tangent over adjacent would give you square root 3 over 1.Type \"enter2\" for the next question.");
                        stuff.setText("");
                        break;
                    case "feedback":
                        bot.setText("You showed strength in identifing special right triangles in the unit circle. However you can work on questions involving acrsin, arccos, and arctan.");
                        break;
                    default:
                        String one = "Sorry, I can't help you. Please enter a valid command";
                        String two = "I'm not sure I understand";
                        String three = "Please state a valid command";
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

                }*/





        }
    });
}
}




