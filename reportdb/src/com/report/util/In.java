package com.report.util;

import java.util.Scanner;

/* 백엔드만 구현해서 테스트할때 사용하는 클래스
 * 키보드 입력 처리를 전담합니다.
 * 키보드 입력을 -> String (기본)
 * 키보드 입력을 -> 정수형 (Integer, Long)
 *  */
public class In {

	// Scanner 클래스 - 입력받은 데이터의 처리
	// new Scanner(System.in) 의 System.in 은 키보드 입력을 의미합니다.
	private static Scanner scanner = new Scanner(System.in);
	
	// 키보드로 입력받는 부분(엔터가 들어올때 입력받은 내용을 처리해서 문자열로 리턴)
	public static String getStr() {
		return scanner.nextLine();
		// => scanner.nextLine() 메서드가 enter받을때 입력데이터를 리턴
		// 리턴값은 문자열(String) 자료형으로 넘어옵니다.
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
