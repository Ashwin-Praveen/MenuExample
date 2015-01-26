package com.example.ashwinpraveen1.menuexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class dialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        theDialog.setTitle("Dialog Title");
        theDialog.setMessage("Hello I am a dialog");
        theDialog.show();
        theDialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Clicked okay",Toast.LENGTH_SHORT).show();
            }
        });

        theDialog.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"You clicked cancel",Toast.LENGTH_SHORT).show();
            }
        });

        return super.onCreateDialog(savedInstanceState);
    }
}
