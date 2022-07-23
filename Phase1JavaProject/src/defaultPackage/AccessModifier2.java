package defaultPackage;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class AccessModifier2 {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.setName("Programiz");
        System.out.println(d.getName());
	}

}
