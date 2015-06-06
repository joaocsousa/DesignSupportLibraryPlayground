package com.github.joaocsousa.designsupportlibraryplayground;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	private boolean mNameInputErrorEnabled = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.activity_main_toggle_name_error_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				toggleNameInputError();
			}
		});
	}

	private void toggleNameInputError() {
		mNameInputErrorEnabled = !mNameInputErrorEnabled;
		updateNameInputErrorState();
	}

	private void updateNameInputErrorState() {
		TextInputLayout nameInputErrorContainer = ((TextInputLayout) findViewById(R.id.activity_main_input_name_container));
		nameInputErrorContainer.setError(mNameInputErrorEnabled ? "This is an error message." : "");
	}

}
