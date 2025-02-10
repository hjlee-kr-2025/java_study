package chapter06.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstace();
		Company myCompany2 = Company.getInstace();
		
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		
		System.out.println(myCompany1 == myCompany2);
	}
}
