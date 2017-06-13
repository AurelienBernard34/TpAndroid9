package com.example.admin.tpandroid9;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by admin on 13/06/2017.
 */

public abstract class Traceur extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toast = Toast.makeText(this, R.string.create,Toast.LENGTH_LONG);
        toast.show();
        notify("create");
    }

    @Override
    protected void onPause() {
        super.onPause();
        toast = Toast.makeText(this, R.string.pause,Toast.LENGTH_LONG);
        toast.show();
        notify("pause");
    }

    protected void onResume(){
        super.onResume();
        toast = Toast.makeText(this, R.string.resume,Toast.LENGTH_LONG);
        toast.show();
        notify("resume");
    }

    protected void onStop(){
        super.onStop();
        toast = Toast.makeText(this, R.string.stop,Toast.LENGTH_LONG);
        toast.show();
        notify("stop");
    }

    protected void onDestroy(){
        super.onDestroy();
        toast = Toast.makeText(this, R.string.destroy,Toast.LENGTH_LONG);
        toast.show();
        notify("destroy");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        toast = Toast.makeText(this, R.string.onRestoreInstanceState,Toast.LENGTH_LONG);
        toast.show();
        notify("restoreInstanceState");
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        toast = Toast.makeText(this, R.string.onSaveInstanceState,Toast.LENGTH_LONG);
        toast.show();
        notify("onSaveInstanceState");
    }

    private void notify(String methodName)
    {
        String name = this.getClass().getName();
        String[] strings = name.split("\\.");
        Notification noti = new Notification.Builder(this)
                .setContentTitle(methodName+" " + strings[strings.length-1]).setAutoCancel(true)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(name).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify((int) System.currentTimeMillis(),noti);
    }
}
