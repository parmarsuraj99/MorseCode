package com.landofai.morsecode;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FeedbackFragment extends Fragment {



    EditText fbName, fbSubject, fbMessage;
    FloatingActionButton fabSend;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feedback, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Feedback");


        FloatingActionButton fabSend = (FloatingActionButton) getView().findViewById(R.id.floatingActionButtonSend);
        fbName = getView().findViewById(R.id.feedBackName);
        fbSubject = getView().findViewById(R.id.feedBackSubject);
        fbMessage = getView().findViewById(R.id.feedBackText);


        fabSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = fbName.getText().toString();
                String subject = fbSubject.getText().toString();
                String message = fbMessage.getText().toString();

                String unameMessage = "Username: "+userName+"\nMessage:"+message;


                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + "parmarsuraj2001@gmail.com"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
                emailIntent.putExtra(Intent.EXTRA_TEXT, unameMessage);

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send email using..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getActivity(), "No email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
