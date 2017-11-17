package rw.easyhealth.easyhealthv1.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import rw.easyhealth.easyhealthv1.R;

/**
 * Created by gniyongere on 11/17/2017.
 */

public class RegisterFingerPrint extends AppCompatActivity {
    ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takefingerprint);
        ib=(ImageButton)findViewById(R.id.imageButton2);


        ib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(),"Checking Finger Print...",Toast.LENGTH_LONG).show();
                saveFingerPrint();
            }
        });

    }

    public void saveFingerPrint(){
        Intent launchGame=new Intent(this,Register.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }

}
