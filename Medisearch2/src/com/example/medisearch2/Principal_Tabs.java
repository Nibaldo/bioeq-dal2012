package com.example.medisearch2;



import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;

public class Principal_Tabs extends TabActivity { 
	/**
	 * 
	 */
		public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_principal__tabs);
		    
		    		    

		    Resources res = getResources(); // Resource object to get Drawables
		    TabHost tabHost = getTabHost();  // The activity TabHost
		    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
		    Intent intent;  // Reusable Intent for each tab

			
			// Initialize a TabSpec for each tab and add it to the TabHost
		 // Create an Intent to launch an Activity for the tab (to be reused)
		    
			intent = new Intent().setClass(this, BuscadorBioequivalente.class);
			spec = tabHost.newTabSpec("Generico").setIndicator("Buscar Generico", // R.string.
					res.getDrawable(R.drawable.ic_tab_contact)).setContent(intent);
			tabHost.addTab(spec);

			intent = new Intent().setClass(this,BuscadorMedicamento_Uso.class);
			spec = tabHost
					.newTabSpec("Buscar Medicamento")
					.setIndicator("Medicamento Uso",
							res.getDrawable(R.drawable.ic_tab_prestaciones))
					.setContent(intent);
			tabHost.addTab(spec);
			
			
			/*
			 * intent = new Intent().setClass(this, SongsActivity.class); spec =
			 * tabHost.newTabSpec("songs").setIndicator("Songs",
			 * res.getDrawable(R.drawable.ic_tab_songs)) .setContent(intent);
			 * tabHost.addTab(spec);
			 * 
			 * tabHost.setCurrentTab(2);
			 */
		}

}
