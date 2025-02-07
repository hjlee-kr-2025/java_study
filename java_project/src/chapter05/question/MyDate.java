package chapter05.question;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// 생성자
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// getter & setter
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isValid() {
		boolean result = false;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day <= 31) {
				result = true;
			}
			break;
		case 2:
			if (day <= 28) {
				result = true;
			}
			break;
		case 4: case 6: case 9: case 11:
			if (day <= 30) {
				result = true;
			}
			break;
		}
		if (result) {
			System.out.println("유효한 날짜입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		return result;
	}
	
}
