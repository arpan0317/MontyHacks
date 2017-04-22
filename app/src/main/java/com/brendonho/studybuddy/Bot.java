package com.brendonho.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.AbsListView;
import android.widget.ListView;
import android.database.DataSetObserver;

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

                }
            }
        });



    }
}
