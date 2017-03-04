package com.example.cursoandroid.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private String[] data=new String[]{
            "Elemento1","Elemento2","Elemento3"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        ListView lista=(ListView)findViewById(R.id.listaDatos);
        lista.setAdapter(adapter);


        /*username=(EditText)findViewById(R.id.usernameEditText);
        password=(EditText)findViewById(R.id.passwordEditText);

        Button login=(Button)findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                    if (passValidation()){
                        checkCredentianls();

                    }
            }
            });*/

    }

    /*
    private boolean checkCredentianls(){
        boolean rightCredentials=true;
        username.setError(null);
        password.setError(null);
        String usernameText=username.getText().toString();
        String passwordText=password.getText().toString();
        if(usernameText.equalsIgnoreCase("giovas")){
            if(passwordText.equalsIgnoreCase("admin")){
                //las credenciales son correctas
                Toast toast = Toast.makeText(getApplicationContext(), "Credenciales correctas", Toast.LENGTH_LONG);
                toast.show();
            }else{
                password.setError("Password incorrecto");
                rightCredentials=false;
            }
        }else{
            username.setError("Usuario incorrecto");
            rightCredentials=false;
        }

        return rightCredentials;
    }


    private boolean passValidation(){
        boolean passValidation=true;
        username.setError(null);
        String usernameText= username.getText().toString();
        if(usernameText.length()==0){//en caso de estar vacío
          username.setError("Username no puede estar vacío");
            passValidation=true;

        }

        String passwordText= password.getText().toString();
        if(passwordText.length()==0){//en caso de estar vacío
            password.setError("Password no puede estar vacío");
            passValidation=true;

        }

        return passValidation;

    }
   */

}
