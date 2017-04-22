package com.brendonho.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class Bot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        ListView listView = (ListView) findViewById(R.id.listview);
        final EditText stuff = (EditText) findViewById(R.id.editText);
        Button send = (Button) findViewById(R.id.button);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stuffin = stuff.getText().toString();
                if (stuffin.contains("math"))
                {
                    String helper = "What math course do you need help on?";
                    if (stuffin.contains("Precalculus"))
                    {
                        String helper1 = "What topic in precalculus?";
                    }
                        if (stuffin.contains("right triangle")) {

                            String helper2 = "Please take this test to help us help you.";
                            String q1 = "What is the sin of 30 degrees?";
                            if (stuffin.equals("0.5")){
                                int countercorrect =  0;
                                int counterincorrect = 0;
                            String q1return = "That's correct!";
                                countercorrect++;
                        }
                        }
            }
        });



    }
}
