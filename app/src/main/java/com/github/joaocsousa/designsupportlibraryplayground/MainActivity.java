package com.github.joaocsousa.designsupportlibraryplayground;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private boolean mNameInputErrorEnabled = false;

	private FloatingActionButton mAddButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mAddButton = (FloatingActionButton) findViewById(R.id.activity_main_add_button);
		findViewById(R.id.activity_main_toggle_name_error_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				toggleNameInputError();
			}
		});
		mAddButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Action Add", Toast.LENGTH_SHORT).show();
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
