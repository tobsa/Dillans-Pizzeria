package savi.tobsa.dillanspizzeria;

import java.util.List;

import savi.tobsa.dillanspizzeria.domain.Pizza;
import savi.tobsa.dillanspizzeria.domain.PizzaGroup;
import savi.tobsa.dillanspizzeria.domain.Type;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MenuAdapter extends BaseExpandableListAdapter {
	private Context context;
	private List<PizzaGroup> menuGroups;
	
	public MenuAdapter(Context context, List<PizzaGroup> menuGroups) {
		this.context = context;
		this.menuGroups = menuGroups;
	}
	
	@Override
	public Object getChild(int groupIndex, int childIndex) {
		return menuGroups.get(groupIndex).getPizzas().get(childIndex);
	}

	@Override
	public long getChildId(int groupIndex, int childIndex) {
		return childIndex;
	}

	@Override
	public View getChildView(int groupIndex, int childIndex, boolean isLastChild, View view, ViewGroup viewGroup) {
		if(view == null)
			view = ((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.list_item, null);
		
		Pizza pizza = (Pizza)getChild(groupIndex, childIndex);
		
		TextView menuItemNumber      = (TextView)view.findViewById(R.id.menu_item_number);
		TextView menuItemName        = (TextView)view.findViewById(R.id.menu_item_name);
		TextView menuItemIngredients = (TextView)view.findViewById(R.id.menu_item_ingredients);
		
		if(pizza.getNumber() == Pizza.InvalidNumber)
			menuItemNumber.setText("");
		else
			menuItemNumber.setText(pizza.getNumber() + (pizza.getNumber() < 10 ? ".  " : "."));
		
		String typenames = "";
		for(Type type : pizza.getTypes())
			if(type != Type.Standard)
				typenames += type.toString() + ", ";
		try {
			typenames = typenames.substring(0, typenames.length() - 2);
		} catch(StringIndexOutOfBoundsException ex) {}
		
		if(typenames.length() == 0)
			menuItemName.setText(pizza.getName());
		else
			menuItemName.setText(pizza.getName() + " (" + typenames + ")");
		
		menuItemIngredients.setText(pizza.toString());
		
		return view;
	}

	@Override
	public int getChildrenCount(int groupIndex) {
		return menuGroups.get(groupIndex).getPizzas().size();
	}

	@Override
	public Object getGroup(int groupIndex) {
		return menuGroups.get(groupIndex);
	}

	@Override
	public int getGroupCount() {
		return menuGroups.size();
	}

	@Override
	public long getGroupId(int groupIndex) {
		return groupIndex;
	}

	@Override
	public View getGroupView(int groupIndex, boolean isExpanded, View view, ViewGroup viewGroup) {
		if(view == null)
			view = ((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.list_group, null);
		
		PizzaGroup pizzaGroup = (PizzaGroup)getGroup(groupIndex);
		
		TextView menuGroupName  = (TextView)view.findViewById(R.id.menu_group_name);
		TextView menuGroupCost  = (TextView)view.findViewById(R.id.menu_group_cost);
		TextView menuGroupOther = (TextView)view.findViewById(R.id.menu_group_other);
		
		menuGroupName.setText(pizzaGroup.getName());
		menuGroupName.setTypeface(null, Typeface.BOLD);
		
		menuGroupCost.setText(pizzaGroup.getCost() + ":-");
		
		menuGroupOther.setText(""
				+ "Barn "   + pizzaGroup.getCostChildren() + ":-  "
				+ "Sambo "  + pizzaGroup.getCostPartner()  + ":-  "
				+ "Familj " + pizzaGroup.getCostFamily()   + ":-");
		menuGroupOther.setText(setTextStyleItalic(menuGroupOther.getText()));
		
		return view;
	}
	
	private static CharSequence setTextStyleItalic(CharSequence text) {
	    final StyleSpan style = new StyleSpan(Typeface.ITALIC);
	    final SpannableString str = new SpannableString(text);
	    str.setSpan(style, 0, text.length(), 0);
	    return str;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupIndex, int childIndex) {
		return false;
	}

}
