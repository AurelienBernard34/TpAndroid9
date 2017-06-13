package com.example.admin.tpandroid9;

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
        Log.d("create",this.getComponentName().toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        toast = Toast.makeText(this, R.string.pause,Toast.LENGTH_LONG);
        toast.show();
        Log.d("pause",this.getComponentName().toString());
    }

    protected void onResume(){
        super.onResume();
        toast = Toast.makeText(this, R.string.resume,Toast.LENGTH_LONG);
        toast.show();
        Log.d("resume",this.getComponentName().toString());
    }

    protected void onStop(){
        super.onStop();
        toast = Toast.makeText(this, R.string.stop,Toast.LENGTH_LONG);
        toast.show();
        Log.d("stop",this.getComponentName().toString());
    }

    protected void onDestroy(){
        super.onDestroy();
        toast = Toast.makeText(this, R.string.destroy,Toast.LENGTH_LONG);
        toast.show();
        Log.d("destroy",this.getComponentName().toString());
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        toast = Toast.makeText(this, R.string.onRestoreInstanceState,Toast.LENGTH_LONG);
        toast.show();
        Log.d("restoreInstanceState",this.getComponentName().toString());
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        toast = Toast.makeText(this, R.string.onSaveInstanceState,Toast.LENGTH_LONG);
        toast.show();
        Log.d("onSaveInstanceState",this.getComponentName().toString());
    }
}
