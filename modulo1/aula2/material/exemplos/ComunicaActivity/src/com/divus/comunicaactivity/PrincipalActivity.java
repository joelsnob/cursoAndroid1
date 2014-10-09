package com.divus.comunicaactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends Activity { //implements OnClickListener

	private static final int TELA_MENSAGEM = 1;
	
	private static final int TELA_CONTATO = 2;
	
	private EditText edtValor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		edtValor = (EditText) findViewById(R.id.edtValor);
		
//		btnChamar.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Toast.makeText(PrincipalActivity.this, "teste: " 
//					+ edtValor.getText().toString(),
//						Toast.LENGTH_LONG).show();
//			}
//		});
		
//		btnChamar.setOnClickListener(this);
	}

//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//		if(v.getId() == R.id.btnChamar){
//			Toast.makeText(PrincipalActivity.this, "teste: " 
//					+ edtValor.getText().toString(),
//						Toast.LENGTH_LONG).show();
//		}
//	}
	
	
	public void mostrarOnclick(View view) {
		Intent intent = new Intent(this, DetalheActivity.class);
		
		intent.putExtra("valor", edtValor.getText().toString());
		
		startActivityForResult(intent, TELA_MENSAGEM);
	}
	

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == TELA_MENSAGEM && resultCode == RESULT_OK) {
			Bundle bundle = data.getExtras();
			String str = bundle.getString("mensagem");
			Toast.makeText(this, str, Toast.LENGTH_LONG).show();
		}
	}
	
	public void chamarOnclick(View view) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Clique realizado");
		builder.setNeutralButton("OK", null);
		
		AlertDialog dialog = builder.create();
		dialog.setTitle("Resultado");
		
		dialog.show();
	}

}
