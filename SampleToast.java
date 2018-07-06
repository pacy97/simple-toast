
package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class about extends AppCompatActivity {

private Button button;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        button=(TextView)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Here You can Add your desired Message for the Toast.....
                //For example....
                Toast.makeText(this, "Hai I am a simple Toast", Toast.LENGTH_SHORT).show();
               
               //You can make the toast stay for long time throug->. Toast.LENGTH_LONG parameter
                //if you are using a toast inside the OnCreate Method use the name of activity before 'this'.
            }
        });
    }
}
