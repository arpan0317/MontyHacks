/*package com.brendonho.studybuddy;

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


public class ChatArrayAdapter extends ArrayAdapter<ChatMessage>{

    private TextView textView;
    private Context context;
    private List<ChatMessage> chatMessageList = new ArrayList<ChatMessage>();

    @Override
    public void add(ChatMessage object){
        chatMessageList.add(object);
        super.add(object);
    }
    public int getCount() {
        return this.chatMessageList.size();
    }
    public ChatMessage getItem(int index) {
        return this.chatMessageList.get(index);
    }
    public ChatArrayAdapter(Context context, int textViewResourceID) {
        int textViewResourceId;
        super(context, textViewResourceId);
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatMessage chatMessageObj = getItem(position);
        View row = convertView;
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (chatMessageObj.left) {
            row = inflater.inflate(R.layout.right, parent, false);
        }else{
            row = inflater.inflate(R.layout.left, parent, false);
        }
        textView = (TextView) row.findViewById(R.id.msgr);
        textView.setText(chatMessageObj.message);
        return row;
    }
}
*/