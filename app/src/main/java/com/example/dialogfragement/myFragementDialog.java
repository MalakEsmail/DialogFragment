package com.example.dialogfragement;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class myFragementDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder ADbuilder  =new AlertDialog.Builder(getActivity());
        ADbuilder.setTitle("Dialog Fragment");
        ADbuilder.setMessage("Are You Sure You want to quit ?");
        ADbuilder.setCancelable(false);
        ADbuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"You clicked ok",Toast.LENGTH_LONG).show();
                if(getActivity()!=null){
                    getActivity().finish();
                }
            }
        });
        ADbuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"You clicked cancel",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alert=ADbuilder.create();
        return alert;
    }
}
