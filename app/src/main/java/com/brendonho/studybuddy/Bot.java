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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        final EditText stuff = (EditText) findViewById(R.id.editText);
        Button send = (Button) findViewById(R.id.button);
        TextView you = (TextView) findViewById(R.id.you);
        final TextView bot = (TextView) findViewById(R.id.bot);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stuffin = stuff.getText().toString();
                String helper1234 = " ";
                switch (stuffin){
                    case "math": helper1234 = "What math course?";
                        bot.setText(helper1234);
                        break;
                    case "science": helper1234 = "What science course?";
                        bot.setText(helper1234);
                        break;
                    case "english": helper1234 = "What topic in english?";
                        bot.setText(helper1234);
                        break;
                    default:helper1234 = "Not understood";
                        break;
                }

                if (helper1234.equals("What math course?"))
                {
                    String helper123 = " ";
                    switch (stuffin){
                        case "precalculus": helper123 = "What precalculus course?";
                            bot.setText(helper123);
                            break;
                        case "al2": helper123 = "What al2 course?";
                            bot.setText(helper123);
                            break;
                        case "geo": helper123 = "What topic in geo?";
                            bot.setText(helper123);
                            break;
                        default:helper123 = "Not understood";
                            break;
                    }
                }







            }



            ;


        });
    }
}
