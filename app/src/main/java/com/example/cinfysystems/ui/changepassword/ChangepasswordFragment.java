package com.example.cinfysystems.ui.changepassword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.cinfysystems.R;

public class ChangepasswordFragment extends Fragment {

    private ChangepasswordViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(ChangepasswordViewModel.class);
        View root = inflater.inflate(R.layout.fragment_changepassword, container, false);

        final Button b1= root.findViewById(R.id.button1);
        final EditText e1= root.findViewById(R.id.editText1);
        final EditText e2= root.findViewById(R.id.editText2);

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String p1=e1.getText().toString().trim();
                 String p2=e2.getText().toString().trim();


                 if(p1.contentEquals(p2) && !p1.matches("") && !p2.matches("")){

                     Toast.makeText(getActivity(), "great! your password is valid", Toast.LENGTH_SHORT).show();

                 }
                  else
                 {

                     e2.setError(" password does not match");
                 }



             }
         });
        return root;
    }
}