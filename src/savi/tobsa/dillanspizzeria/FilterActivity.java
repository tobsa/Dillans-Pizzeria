package savi.tobsa.dillanspizzeria;

import java.util.ArrayList;

import savi.tobsa.dillanspizzeria.domain.Ingredient;
import savi.tobsa.dillanspizzeria.domain.Type;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FilterActivity extends Activity {
	private boolean filterIngredients;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_filter);
		
		filterIngredients = getIntent().getBooleanExtra("filter_ingredients", true);
		
		if(filterIngredients) {
			setTitle("Välj ingredienser");
					
			ListView view = (ListView)findViewById(R.id.filter_ingredients);
			view.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
			view.setAdapter(new ArrayAdapter<Ingredient>(this, android.R.layout.simple_list_item_multiple_choice, Ingredient.values()));
		}
		else {
			setTitle("Välj typ");
			
			ListView view = (ListView)findViewById(R.id.filter_ingredients);
			view.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
			view.setAdapter(new ArrayAdapter<Type>(this, android.R.layout.simple_list_item_multiple_choice, Type.values()));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.filter, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {		
		return super.onOptionsItemSelected(item);
	}
	
	public void onButtonCancelClick(View view) {
		finish();
	}
	
	public void onButtonFilterClick(View view) {
		ListView listView = (ListView)findViewById(R.id.filter_ingredients);
				
		SparseBooleanArray data = listView.getCheckedItemPositions();
		ArrayList<String> values = new ArrayList<String>();
		
		for(int i = 0; i < listView.getCount(); i++) {
			if(data.get(i))
				if(filterIngredients)
					values.add(((Ingredient)listView.getItemAtPosition(i)).toString());
				else
					values.add(((Type)listView.getItemAtPosition(i)).toString());
		}
				
		Intent intent = new Intent(this, MainActivity.class);
		intent.putExtra("filter_ingredients", filterIngredients);
		intent.putStringArrayListExtra("ingredients", values);
		startActivity(intent);
	}
}
