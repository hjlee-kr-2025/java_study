package chapter12;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter
			= new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter
			= new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		// 제네릭에 extends Matrial을 지정한후 아래코드는
		// error 가 발생합니다.
		/*GenericPrinter<String> stringPrinter
			= new GenericPrinter<String>();
		stringPrinter.setMaterial(new String("abc"));
		System.out.println(stringPrinter);*/
	}// end of main()
}
