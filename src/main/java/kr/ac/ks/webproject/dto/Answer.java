package kr.ac.ks.webproject.dto;

import java.util.Date;
import java.util.List;

public class Answer {
	private Long id;
	private Long userId;
	private String content;
	private Long questionId;
	private Date createDate;

	private String userName;
	private String userEmail;

	private List<AnswerCode> codeList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<AnswerCode> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<AnswerCode> codeList) {
		this.codeList = codeList;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", userId=" + userId + ", content=" + content + ", questionId=" + questionId
				+ ", createDate=" + createDate + ", userName=" + userName + ", userEmail=" + userEmail + ", codeList="
				+ codeList + "]";
	}

}
