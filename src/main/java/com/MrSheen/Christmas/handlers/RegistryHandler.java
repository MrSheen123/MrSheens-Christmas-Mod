package com.MrSheen.Christmas.handlers;

import com.MrSheen.Christmas.init.ItemInit;

public class RegistryHandler {
	public static void Client()
	{
		ItemInit.register();
	}
	
	public static void Common()
	{
		ItemInit.init();
	}
}
