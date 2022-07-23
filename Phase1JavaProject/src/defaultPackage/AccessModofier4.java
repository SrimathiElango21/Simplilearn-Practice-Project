package defaultPackage;

import accessPackage.Animal;
public class AccessModofier4 {

	public static void main(String[] args) {
		Animal animal = new Animal();

        // accessing the public variable
        animal.count = 4;
        // accessing the public method
        animal.display();

	}

}
