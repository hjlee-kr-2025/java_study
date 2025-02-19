package exp250219;

import java.io.IOException;

class DataType {
	// 기본자료형: 정수형
	private byte bNum;
	private short sNum;
	private int iNum;
	private long lNum;
	// 기본자료형: 문자
	private char ch;
	// 기본자료형: 실수형
	private float fNum;
	private double dNum;
	// 기본자료형: 논리형
	private boolean isTrue;
	// 문자열
	private String str;
	// Wrapper 클래스 : 기본자료형에 대응되는 클래스
	private Byte bNumClass;
	private Short sNumClass;
	private Integer iNumClass;
	private Long lNumClass;
	private Character chClass;
	private Float fNumClass;
	private Double dNumClass;
	private Boolean isTrueClass;
	public byte getbNum() {
		return bNum;
	}
	public short getsNum() {
		return sNum;
	}
	public int getiNum() {
		return iNum;
	}
	public long getlNum() {
		return lNum;
	}
	public char getCh() {
		return ch;
	}
	public float getfNum() {
		return fNum;
	}
	public double getdNum() {
		return dNum;
	}
	public boolean isTrue() {
		return isTrue;
	}
	public String getStr() {
		return str;
	}
	public Byte getbNumClass() {
		return bNumClass;
	}
	public Short getsNumClass() {
		return sNumClass;
	}
	public Integer getiNumClass() {
		return iNumClass;
	}
	public Long getlNumClass() {
		return lNumClass;
	}
	public Character getChClass() {
		return chClass;
	}
	public Float getfNumClass() {
		return fNumClass;
	}
	public Double getdNumClass() {
		return dNumClass;
	}
	public Boolean getIsTrueClass() {
		return isTrueClass;
	}
	public void setbNum(byte bNum) {
		this.bNum = bNum;
	}
	public void setsNum(short sNum) {
		this.sNum = sNum;
	}
	public void setiNum(int iNum) {
		this.iNum = iNum;
	}
	public void setlNum(long lNum) {
		this.lNum = lNum;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public void setfNum(float fNum) {
		this.fNum = fNum;
	}
	public void setdNum(double dNum) {
		this.dNum = dNum;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public void setbNumClass(Byte bNumClass) {
		this.bNumClass = bNumClass;
	}
	public void setsNumClass(Short sNumClass) {
		this.sNumClass = sNumClass;
	}
	public void setiNumClass(Integer iNumClass) {
		this.iNumClass = iNumClass;
	}
	public void setlNumClass(Long lNumClass) {
		this.lNumClass = lNumClass;
	}
	public void setChClass(Character chClass) {
		this.chClass = chClass;
	}
	public void setfNumClass(Float fNumClass) {
		this.fNumClass = fNumClass;
	}
	public void setdNumClass(Double dNumClass) {
		this.dNumClass = dNumClass;
	}
	public void setIsTrueClass(Boolean isTrueClass) {
		this.isTrueClass = isTrueClass;
	}
	
	
}



public class ExpTest2 {
	
	public static void main(String[] args) throws IOException {
		// DataType 클래스에는 생성자를 구현하지 않았습니다.
		// 그래서 자바 컴파일러가 자동으로 기본생성자를 만들었습니다.
		DataType data1 = new DataType();
		DataType data2 = new DataType();
		
		// int 에 값을 넣어서
		data1.setiNum(20);
		data2.setiNum(10);
		// 연산자를 사용해 계산했습니다.
		System.out.println(data1.getiNum() + data2.getiNum());//덧셈
		System.out.println(data1.getiNum() - data2.getiNum());//뺄셈
		System.out.println(data1.getiNum() * data2.getiNum());//곱셈
		System.out.println(data1.getiNum() / data2.getiNum());//나눗셈
		System.out.println(data1.getiNum() % data2.getiNum());//나머지
		
		// 조건문과 비교연산자
		// >, >=, <, <=, ==, != 
		// 논리연산자 (AND, OR, NOT)
		// &&, ||, !
		int num = data1.getiNum() + data2.getiNum();
		if (num > 10) {
			System.out.println("num은 10보다 큽니다.");
		}
		else if (num == 10){
			System.out.println("num은 10입니다.");
		}
		else {
			System.out.println("num은 10보다 작습니다.");
		}
		// 키보드를 입력받습니다.
		// 키보드 문자에 대한 아스키 코드값을 리턴받습니다.
		int menu = System.in.read();
		System.out.println(menu);
		// 조건문 switch
		switch (menu) {
		case 'A'://아스키코드값 65
		case 'a'://아스키코드값 97
			System.out.println("A 메뉴를 선택했습니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("B 메뉴를 선택했습니다.");
			break;
		case 'C':
		case 'c':
			System.out.println("C 메뉴를 선택했습니다.");
			break;
		default:
			System.out.println("메뉴에 없는 항목입니다.");
		}
		

	}
}
