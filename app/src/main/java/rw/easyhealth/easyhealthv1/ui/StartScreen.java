package rw.easyhealth.easyhealthv1.ui;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import rw.easyhealth.easyhealthv1.R;

public class  StartScreen extends AppCompatActivity {
    Button logg, reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        logg=(Button)findViewById(R.id.login);
        reg=(Button)findViewById(R.id.register);
        logg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stu
                login();


            }
        });

        reg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stu
                register();
            }
        });
    }


    public void login(){
        Intent launchGame=new Intent(this,Login.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }
    public void register(){
        Intent launchGame=new Intent(this,Register.class);
        //  launchGame.putExtra("username",username);
        startActivity(launchGame);
    }
}
