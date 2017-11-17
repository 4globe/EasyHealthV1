package rw.easyhealth.easyhealthv1.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import rw.easyhealth.easyhealthv1.R;
import rw.easyhealth.easyhealthv1.controller.Protocol;
import rw.easyhealth.easyhealthv1.model.User;

/**
 * Created by gniyongere on 11/14/2017.
 */
public class Login extends AppCompatActivity {
    Button btn_log;
    EditText edit_username,edt_password;
    private Protocol client=new Protocol();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //=================Layout component=================
        btn_log=(Button)findViewById(R.id.btn_log);
        edt_password=(EditText) findViewById(R.id.editPassword);
        edit_username=(EditText) findViewById(R.id.editUsernma);



        btn_log.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String[] result= client.processLogin(edit_username.getText().toString(),edt_password.getText().toString());

                if(result[1].equals("1")){
                    Toast.makeText(getBaseContext(),result[0],Toast.LENGTH_LONG).show();
                    checkFingerprint();
                }else{

                    Toast.makeText(getBaseContext(),result[0],Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    public void checkFingerprint(){
        Intent launchGame=new Intent(this,Fingerprint_check.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }
}