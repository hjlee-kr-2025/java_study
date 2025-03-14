package com.shopping.util;

import java.util.Scanner;

// Scanner 클래스를 이용해서 키보드 입력을 위한 클래스
public class In {
	// Scanner 클래스는 입력을 다양한 자료형으로 변경시켜줄수 있는
	// 클래스
	private static Scanner scanner = new Scanner(System.in);
	
	// 키보드 입력받는 메서드
	public static String getStr() {
		// Scanner Class 안의 nextLine() 메서드
		// [Enter] 키 입력전까지 만들어진 내용을 문자열로 리턴합니다.
		return scanner.nextLine();
	}
	
	// 입력내용에 대한 정보표시 + 키보드 입력받는 메서드
	public static String getStr(String msg) {
		System.out.print(msg + " --> ");
		return getStr();
	}
	
	// 입력내용에 대한 정보표시 + 키보드 입력받고 + 숫자확인(Long)
	public static Long getLong(String msg) {
		// 숫자가 제대로 입력될때 까지 반복
		while (true) {
			try {
				return Long.parseLong(getStr(msg));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			// 예외가 발생되면 catch문 실행후 이곳으로 옵니다
			// 그리고 while(true) 반복실행이 됩니다.
		}
	}
}
