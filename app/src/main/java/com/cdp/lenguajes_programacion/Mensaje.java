package com.cdp.lenguajes_programacion;

import android.content.Context;
import android.widget.Toast;

public class Mensaje {
    public static void mensaje(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
