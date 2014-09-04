package com.example.drinkbuilder;

import java.util.ArrayList;
import java.util.List;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class TheFridge extends ListActivity implements OnClickListener {
	
	// UI variables
	private Button btnBoozeChosen = null;
	
	/** Called when the activity is first created. */

	  public void onCreate(Bundle noms) {
	    super.onCreate(noms);
	    setContentView(R.layout.activity_the_fridge);
	    // create an array of Strings, that will be put to our ListActivity
	    ArrayAdapter<Booze> adapter = new InteractiveArrayAdapter(this,
	        getBooze());
	    setListAdapter(adapter);
	    
	    btnBoozeChosen = (Button) findViewById(R.id.btnBoozeChosen);
	    btnBoozeChosen.setOnClickListener(this);
	  }

	  private List<Booze> getBooze() {
	    List<Booze> list = new ArrayList<Booze>();
	    list.add(get("Vodka"));
	    list.add(get("Spiced Rum"));
	    list.add(get("Vermouth"));
	    list.add(get("Beer"));
	    list.add(get("Whiskey"));
	    list.add(get("Scotch"));
	    list.add(get("Wine"));
	    list.add(get("Brandy"));
	    
	    // Initially select one of the items
	   // list.get(1).setSelected(true);
	    return list;
	  }

	  private Booze get(String s) {
	    return new Booze(s);
	  }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		// save the choices and generate list of recipes...to do..here
	}

}
