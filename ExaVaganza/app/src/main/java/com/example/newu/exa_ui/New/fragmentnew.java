package com.example.newu.exa_ui.New;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.newu.exa_ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 08/03/2018.
 */

public class fragmentnew extends Fragment {
    View v;

    String cname;
    String dd;
    String dedi;
    String key;


    public TextInputLayout textInputLayoutConsignment;
    private TextInputLayout textInputLayoutduedate;
    private TextInputLayout textInputLayoutDedicated;
    private TextInputLayout textInputLayoutKeywords;

    //EditText variables
    private EditText editTextConsignment;
    private EditText editTextDuedate;
    private EditText editTextDedicated;
    private EditText editTextKeywords;

    //Button
    public Button buttonSignUp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.new_space_new,container,false);
        // inflator sets the UI of fragment to new_space
        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


    }

    @Override
    public void onStart() {
        super.onStart();

        // Edit text wrappers need not be intialized.

        /*textInputLayoutConsignment = getActivity().findViewById(R.id.text_input_layout_consignment);
        textInputLayoutduedate = getActivity().findViewById(R.id.text_input_layout_duedate);
        textInputLayoutDedicated = getActivity().findViewById(R.id.text_input_layout_dedicated);
        textInputLayoutKeywords = getActivity().findViewById(R.id.text_input_layout_keywords);*/

        editTextConsignment = getActivity().findViewById(R.id.edit_text_name);
        editTextDuedate = getActivity().findViewById(R.id.edit_text_email);
        editTextDedicated = getActivity().findViewById(R.id.edit_text_age);
        editTextKeywords = getActivity().findViewById(R.id.edit_text_password);

        buttonSignUp = getActivity().findViewById(R.id.button_sign_up);

        //validation = new ValidationHelper(this);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //hideKeyboard();
                checkValidation();
            }
        });
    }
    public void checkValidation() {

        try {
            cname = textInputLayoutConsignment.getEditText().getText().toString();
            dd = textInputLayoutduedate.getEditText().getText().toString();
            dedi = textInputLayoutDedicated.getEditText().getText().toString();
            key = textInputLayoutKeywords.getEditText().getText().toString();
        }

        catch(Exception e){
            String exc = e.toString();
            Toast.makeText(getContext(), exc, Toast.LENGTH_SHORT).show();
        }

            /*if(validateCname(cname))
                textInputLayoutConsignment.setError("Enter name");


            else if(validateDd(dd))
                textInputLayoutduedate.setError("Enter due date");


            else if(validateDedicated(dedi))
                textInputLayoutDedicated.setError("Enter to whom are you dedicating to ");


            else if(validateKey(key))
                textInputLayoutKeywords.setError("Enter some keys");


            else
                Toast.makeText(getContext(), "Submission Successful", Toast.LENGTH_SHORT).show();

        /*if (!validation.isEditTextFilled(editTextConsignment, textInputLayoutConsignment, getString(R.string.error_consignmnet_name))) {
            return;
        }

        if (!validation.isEditTextEmail(editTextDuedate, textInputLayoutduedate, getString(R.string.error_due_date))) {
            return;
        }

        if (!validation.isEditTextFilled(editTextDedicated, textInputLayoutDedicated, getString(R.string.error_dedicated))) {
            return;
        }
        if (!validation.isEditTextFilled(editTextKeywords, textInputLayoutKeywords, getString(R.string.error_keywords))) {
            return;
        }*/
    }

    /*public boolean validateCname(String cname){
        if(cname.isEmpty())
            return true;
        else
            return false;
    }

    public boolean validateDd(String dedi){
        if(dedi.isEmpty())
            return true;
        else
            return false;
    }

    public boolean validateDedicated(String dedi){
        if(dedi.isEmpty())
            return true;
        else
            return false;
    }

    public boolean validateKey(String key){
        if(key.isEmpty())
            return true;
        else
            return false;
    }*/


}



