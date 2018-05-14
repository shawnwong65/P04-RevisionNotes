package com.myapplicationdev.android.p04_revisionnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

	ListView lv;
	ArrayAdapter adapter;
	ArrayList<Note> objects;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//TODO implement the Custom ListView
		DBHelper db = new DBHelper(SecondActivity.this);

		lv = (ListView) findViewById(R.id.lv);

		objects = db.getAllNotes();

		db.close();

		adapter = new RevisionNotesArrayAdapter(SecondActivity.this, R.layout.row, objects);
		lv.setAdapter(adapter);
		adapter.notifyDataSetChanged();

	}


}
