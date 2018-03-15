package org.vilchezruben.climatix.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import org.vilchezruben.climatix.util.Utils;

/**
 * Created by Vilchez Ruben on 13/03/2018.
 */

public class AlertDialogFragmen extends DialogFragment {
    /**
     * @param savedInstanceState
     * @return
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        Bundle param = getArguments();
        String message = param.getString("message");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Error!");
        builder.setMessage("There was an error, Please try again. " + Utils.getSeparator() + "Error: " + message);

        builder.setPositiveButton("Ok", null);

        AlertDialog dialog = builder.create();

        return dialog;

    }


}
