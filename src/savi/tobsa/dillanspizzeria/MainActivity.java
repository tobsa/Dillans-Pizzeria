package savi.tobsa.dillanspizzeria;

import java.util.ArrayList;

import savi.tobsa.dillanspizzeria.domain.PizzaManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
		final ExpandableListView expandableListView = (ExpandableListView)findViewById(R.id.expandable_list_view_pizzas);
		
		final ArrayList<String> ingredients = getIntent().getStringArrayListExtra("ingredients");
		if(ingredients == null)
			expandableListView.setAdapter(new MenuAdapter(this, PizzaManager.getDefaultList()));
		else {
			boolean filterIngredients = getIntent().getBooleanExtra("filter_ingredients", true);
			
			if(filterIngredients)
				expandableListView.setAdapter(new MenuAdapter(this, PizzaManager.getIngredientFilteredList(ingredients)));
			else
				expandableListView.setAdapter(new MenuAdapter(this, PizzaManager.getTypeFilteredList(ingredients)));
		}
		
		for(int i = 0; i < expandableListView.getExpandableListAdapter().getGroupCount(); i++)
			expandableListView.expandGroup(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.main_action_filter)
			return onActionFilterClick();
		else if(id == R.id.main_action_type)
			return onActionTypeClick();
		
		return super.onOptionsItemSelected(item);
	}
	
	private boolean onActionTypeClick() {
		Intent intent = new Intent(this, FilterActivity.class);
		intent.setFlags(intent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
		intent.putExtra("filter_ingredients", false);
		startActivity(intent);
		
		return true;
	}
	
	private boolean onActionFilterClick() {
		Intent intent = new Intent(this, FilterActivity.class);
		intent.setFlags(intent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
		intent.putExtra("filter_ingredients", true);
		startActivity(intent);
		
		return true;
	}
}
