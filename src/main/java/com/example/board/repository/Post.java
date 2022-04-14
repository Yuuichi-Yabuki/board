package com.example.board.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 投稿.
 */
@Entity
@Table(name = "post")
@Data
public class Post {

	/** ID */
	@Id
	@Column
	private String id = null;

	/** 投稿者 */
	@Column(length = 20, nullable = false)
	private String author = null;

	/** タイトル */
	@Column(length = 20, nullable = false)
	private String title = null;

	/** 内容 */
	@Column(length = 1000, nullable = false)
	private String body = null;

	public void setUpdatedDate(Date current) {
		// TODO Auto-generated method stub

	}

	public void setDeleted(boolean b) {
		// TODO Auto-generated method stub

	}

	public void setId(String id2) {
		// TODO Auto-generated method stub

	}

	public void setCreatedDate(Date current) {
		// TODO Auto-generated method stub

	}

	public Object getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAuthor(Object author2) {
		// TODO Auto-generated method stub

	}

	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTitle(Object title2) {
		// TODO Auto-generated method stub

	}

	public Object getBody() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBody(Object body2) {
		// TODO Auto-generated method stub

	}

}