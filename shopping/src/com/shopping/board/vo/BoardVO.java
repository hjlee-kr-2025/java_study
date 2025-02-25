package com.shopping.board.vo;

public class BoardVO {
	// 데이터 변수들을 선언
	private Long no;	// 글번호
	private String title;	//제목
	private String content;	//내용
	private String writer;	//작성자
	private String pw;		//비밀번호
	private String writeDate; //작성일
	private Long hit;		//조회수
	// getter & setter
	// [Shift]+[Alt]+[S] : Source 메뉴 팝업
	// ==> Generate Getters and Setters... 선택
	// ==> field 전체 선택후 generate 버튼클릭
	public Long getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public String getPw() {
		return pw;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public Long getHit() {
		return hit;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public void setHit(Long hit) {
		this.hit = hit;
	}
	// 데이터 확인용으로 사용할 메서드 ?
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", pw=" + pw
				+ ", writeDate=" + writeDate + ", hit=" + hit + "]";
	}
	
	
}




