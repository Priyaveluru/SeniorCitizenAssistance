package cmpe235.senior_citizen_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by priya on 4/7/2018.
 */

public class LoginActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button b=(Button)findViewById(R.id.btnLogin);
        Button signup=(Button)findViewById(R.id.btnLinkToRegisterScreen);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, Main3Activity.class);
                startActivity(intent);
            }

        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }

        });
    }
}

