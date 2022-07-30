package org.example.virtualkey;

public class VirtualkeyMain {

	public static void main(String[] args) {
FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("Virtual Key Repositories ", "Srimathi Elango");
		
		HandleOptions.handleWelcomeScreenInput();

	}

}
