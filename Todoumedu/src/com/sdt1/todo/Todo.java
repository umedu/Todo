package com.sdt1.todo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Todo extends Activity {

	@Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ((Button)findViewById(R.id.Button01)).setOnClickListener(
        	new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				final String item_list[] = new String[] {
						//call SQL
						"data []",
						"data 2",
						"data 3",
						"data 4",
						"data 5" };

				//
				//処理：メッセージダイアログの表示
				//
	            new AlertDialog.Builder(Todo.this)
                .setTitle("リストのサンプル")
                .setItems(item_list, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    	//input SQL
                        //選択したアイテムをトースト表示
                    	Toast.makeText(
                    			Todo.this,
                        	"選択したアイテム: " + which + " , " + item_list[which],
                        	Toast.LENGTH_LONG).show();
                    }
                })
                .show();
			}
   		});
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
