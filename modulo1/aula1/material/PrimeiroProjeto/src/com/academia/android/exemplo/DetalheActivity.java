package com.academia.android.exemplo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalhe);
		
		Bundle data = (Bundle) getIntent().getExtras();
		String nome = data.getString("nome");
		
		TextView txResultado = (TextView) findViewById(R.id.txResultado);
		
		if (nome != null && !nome.equalsIgnoreCase("")) {
			txResultado.setText(nome);
		}
	}
}
