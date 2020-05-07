package com.solutionsmax.testlibrary;

import android.app.Activity;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class AlertDialogs {
  public static void infoDialog(Activity activity, String sMessage) {
    AlertDialog.Builder builder1 = new AlertDialog.Builder(activity);
    builder1.setMessage(sMessage);
    builder1.setCancelable(true);

    builder1.setPositiveButton(
        "Close",
        new DialogInterface.OnClickListener() {
          public void onClick(DialogInterface dialog, int id) {
            dialog.cancel();
          }
        });

    AlertDialog alert11 = builder1.create();
    alert11.show();
  }
}
