package com.divus.comunicaactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DetalheActivity extends Activity {

	private EditText edtMensagem;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalhe);
		
		TextView txValor = (TextView) findViewById(R.id.txDescricao);
		
		Bundle bundle = getIntent().getExtras();
		String str = bundle.getString("valor");
		txValor.setText(str);
		
		edtMensagem = (EditText) findViewById(R.id.edtMensagem);
		
	}
	
	public void voltarOnclick(View view) {
		Intent intent = new Intent();
		intent.putExtra("mensagem", edtMensagem.getText().toString());
		
		setResult(RESULT_OK, intent);
		finish();
	}
	
}
