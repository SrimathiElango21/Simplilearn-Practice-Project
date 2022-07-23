package assPracticeProject;

public class typeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Typecasting");
		short a=100;
		System.out.println("Short a value : "+a);
		int b=a;
		System.out.println("Integer a value : "+b);
		float c=a;
		System.out.println("Float a value : "+c);
		long d=a;
		System.out.println("Long a value : "+d);
		double e=a;
		System.out.println("Double a value : "+e);
		System.out.println("=====================");
		System.out.println("Explict TypeCasting");
		double f=32.90;
		System.out.println("Double value : "+f);
        float g=(float)f;
        System.out.println("Float value : "+g);
        int h=(int)f;
        System.out.println("Int value : "+h);
	}

}
