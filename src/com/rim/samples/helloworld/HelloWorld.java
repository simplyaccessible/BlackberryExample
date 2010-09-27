package com.rim.samples.helloworld;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.*;
import net.rim.device.api.ui.container.MainScreen;

public class HelloWorld extends UiApplication {
	public static void main(String[] args) {
		HelloWorld theApp = new HelloWorld();
		theApp.enterEventDispatcher();
	}
	
	public HelloWorld() {
		pushScreen(new HelloWorldScreen());
	}
}

final class HelloWorldScreen extends MainScreen {
	public HelloWorldScreen() {
		super();
		LabelField title = new LabelField("HelloWorld Sample", LabelField.ELLIPSIS | LabelField.USE_ALL_WIDTH);
		setTitle(title);
		add(new RichTextField("Hello World! When this app is closed, a dialog box will be displayed."));
	}
	
	public boolean onClose() {
		Dialog.alert("Goodbye!");
		System.exit(0);
		return true;
	}
}