package rw.easyhealth.easyhealthv1.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import rw.easyhealth.easyhealthv1.R;

import static rw.easyhealth.easyhealthv1.R.id.btn_log;

/**
 * Created by gniyongere on 11/14/2017.
 */
public class Fingerprint_check extends AppCompatActivity {
    ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fingerprint);
        ib=(ImageButton)findViewById(R.id.imageButton);




        ib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(),"Checking Finger Print...",Toast.LENGTH_LONG).show();
                goToPatinetMenu();


            }
        });
    }

    public void goToDoctorMenu(){
        Intent launchGame=new Intent(this,DoctorMenu.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }
    public void goToPatinetMenu(){
        Intent launchGame=new Intent(this,PatientMenu.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }
}