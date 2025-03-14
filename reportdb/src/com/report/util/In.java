package com.report.util;

import java.util.Scanner;

public class In {

	private static Scanner scanner = new Scanner(System.in);
	
	// 키보드로 입력받는 부분(엔터가 들어올때 입력받은 내용을 처리해서 문자열로 리턴)
	public static String getStr() {
		return scanner.nextLine();
		// => scanner.nextLine() 메서드가 enter받을때 입력데이터를 리턴
	}

	// 키보드 입력전 안내문구 표시
	public static String getStr(String msg) {
		System.out.print(msg + " -> ");
		return getStr();
	}
	
	// 숫자로 입력받는 메서드
	public static Integer getInt(String msg) {
		while(true) {
			try {
				return Integer.parseInt(getStr(msg));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자만 입력하셔야 합니다.");
			}
		}
	}
	
}
