package rw.easyhealth.easyhealthv1.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import rw.easyhealth.easyhealthv1.R;

/**
 * Created by gniyongere on 11/14/2017.
 */
public class Register extends AppCompatActivity {
    Button btn_log; ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_log=(Button)findViewById(R.id.btnregister);
        ib=(ImageButton)findViewById(R.id.imageButton3);


        btn_log.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(),"Registration in Processs......",Toast.LENGTH_LONG).show();
                DirectScreenmenu();

            }
        });






        ib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(),"Checking Finger Print...",Toast.LENGTH_LONG).show();
                gotToRegisterFingerPrint();

            }
        });
    }

    public void DirectScreenmenu(){
        Intent launchGame=new Intent(this,StartScreen.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }

    public void gotToRegisterFingerPrint(){
        Intent launchGame=new Intent(this,RegisterFingerPrint.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }

}