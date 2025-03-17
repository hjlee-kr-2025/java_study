package com.report.vo;

import lombok.Data;

/*
 * JAVA 프로그램에서 라이브러리는 프로젝트마다 사용하는 라이브러리를
 * 포함해야 합니다.
 * lombok 라이브러리는 getter, setter, toString()
 * 생성자를 만들어주는 내용들이 포함되어있습니다.
 * @ 로 시작되는 명령어를 어노테이션
 * @Data ==> getter, setter,
 *  toString() => 멤버변수의 데이터를 콘솔에 출력하도록 오버라이드,
 *  equals() => 데이터 값이 같은지 오버라이드
 *  기본생성자를 자동으로 만들어 줍니다.
 * @Getter ==> getter
 * @Setter ==> setter
 * @NoArgsConstructor => 기본생성자를 만들어줍니다.
 *  */
@Data
public class SubjectVO {
	private Integer subjectId;
	private String subjectName;
}

/*
 * VO (Value Object)
 * - DB 테이블의 값을 저장할 때 사용
 * - DB의 열이름과 같은 이름으로 변수명을 사용합니다.(많은 곳에서)
 * - 클래스이름은 table이름에 VO를 붙여서 주로 사용합니다.
 * - getter, setter,
 * - toString() - vo의 모든데이터를 보여주도록 오버라이팅구현된.
 * 
 * 
 * 
 */


