package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

import androidx.fragment.app.Fragment;

public class FriendFragment extends Fragment {

    private Friend friend;
    private EditText editTextFirst;
    private EditText editTextLast;
    private Button addDateButton;
    private CheckBox solvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        friend = new Friend();

    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_friend, container, false);

        editTextFirst = view.findViewById(R.id.edit_fname);
        editTextLast = view.findViewById(R.id.edit_lname);
        addDateButton = view.findViewById(R.id.button_add);
        addDateButton.setText(friend.getStartingDate().toString());
        addDateButton.setEnabled(false);
        solvedCheckBox = view.findViewById(R.id.friend_status);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        TextWatcher firstWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                friend.setFname(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                addDateButton.setEnabled(true);
            }
        };
        TextWatcher lastWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                friend.setLname(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                addDateButton.setEnabled(true);
            }
        };
        editTextFirst.addTextChangedListener(firstWatcher);
        editTextLast.addTextChangedListener(lastWatcher);
        solvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                friend.setBestFriend(isChecked);
            }
        });
        addDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext().getApplicationContext();
                Toast interactiveToast = Toast.makeText(context,
                        friend.getFname()+" "+friend.getLname(),
                        Toast.LENGTH_SHORT);
                interactiveToast.show();
//                System.out.println(friend.getFname()+" "+friend.getLname());
            }
        });
    }
}
