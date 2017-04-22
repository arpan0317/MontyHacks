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
                    case "science":
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
                    case "precalculus":
                        helper1234 = "What precalculus course?";
                        bot.setText(helper1234);
                        you.setText("precalculus");
                        stuff.setText("");
                        break;
                    case "al2":
                        helper1234 = "What al2 course?";
                        bot.setText(helper1234);
                        you.setText("al2");
                        stuff.setText("");
                        break;
                    case "geo":
                        helper1234 = "What topic in geo?";
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
                    case "90":
                        bot.setText("Correct. Type \"enter1\" for next question.");
                        you.setText("90");
                        stuff.setText("");
                        break;
                    case "enter1":
                        bot.setText("What is the tan of 60 degrees? Type \"sqrt\" for square root.");
                        you.setText("enter1");
                        stuff.setText("");
                        break;
                    case "sqrt":
                        bot.setText("Correct. Type \"enter2\" for the next question.");
                        you.setText("sqrt3");
                        stuff.setText("");
                        break;
                    default:
                        helper1234 = "Not understood";
                        bot.setText(helper1234);
                        stuff.setText("");
                        break;

                }





        }
    });
}
}




