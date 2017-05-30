package com.example.a632368.hungry4pizza;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout etLogin ;
    private TextInputLayout etSenha ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState) ;
        setContentView(R.layout. activity_login ) ;
//Recuperar os componentes da tela (xml)
        etLogin = (TextInputLayout) findViewById(R.id. tvLogin ) ;
        etSenha = (TextInputLayout) findViewById(R.id. tvSenha ) ;
    }
    //Clique do botão
    public void logar(View view){
//Recuperar os valores digitados
        String login = etLogin.getEditText().getText().toString() ;
        String senha = etSenha.getEditText().getText().toString() ;
//Valida o usuário e senha
        if (login.equals( "FIAP" ) && senha.equals( "123" )){
//Mudar de tela Tela de Destino
            Intent intent = new Intent( this , PedidoActivity. class ) ;
//Passar uma valor para a outra tela
            intent.putExtra( "usuario" , login) ;
//Iniciar a outra tela
            startActivity(intent) ;
            finish();
        } else {
            etSenha.setError(getString(R.string.txt_error));
//Login ou senha inválid
        }
    }
}