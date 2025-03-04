package com.shopdb.board.vo;

public class BoardVO {

	// board table 에 있는 칼럼이름
	private Integer no;
	private String title;
	private String content;
	private String writer;
	private String writeDate;
	private Integer hit;
	private String pw;
	public Integer getNo() {
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
	public String getWriteDate() {
		return writeDate;
	}
	public Integer getHit() {
		return hit;
	}
	public String getPw() {
		return pw;
	}
	public void setNo(Integer no) {
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
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public void setHit(Integer hit) {
		this.hit = hit;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", writeDate="
				+ writeDate + ", hit=" + hit + ", pw=" + pw + "]";
	}
	
	
}
