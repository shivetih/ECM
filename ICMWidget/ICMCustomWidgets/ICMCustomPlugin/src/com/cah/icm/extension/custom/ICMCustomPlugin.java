package com.cah.icm.extension.custom;

import java.util.Locale;


import com.ibm.ecm.extension.Plugin;
import com.ibm.ecm.extension.PluginAction;


public class ICMCustomPlugin extends Plugin {

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "ICMCustomPlugin";
	}

	@Override
	public String getName(Locale locale) {
		// TODO Auto-generated method stub
		String name = NLSResources.getMessage(locale, "Plugin for ICM Custom Widgets");
		return name;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public PluginAction[] getActions() {
		return new PluginAction[0] ;
	}

	// @Override
	// public String getDojoModule() {
	// return "customWidget";
	// }

	@Override
	public String getScript() {
		return "ICMCustomPlugin.js";
	}

}
