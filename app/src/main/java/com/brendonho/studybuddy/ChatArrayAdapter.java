package com.brendonho.studybuddy;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by bho on 4/22/17.
 */

public class ChatArrayAdapter extends ArrayAdapter<ChatMessage>{

    private TextView textView;
    private List<ChatMessage> chatMessageList = new ArrayList<ChatMessage>();

    public ChatArrayAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
}
