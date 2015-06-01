package com.paulrichter.heatherblog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wp_vvmhbx_posts")
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="post_title")
	public String title;
	
	@Column(name="post_content")
	public String content;
	
	protected Post(){}
	
	public Post(String title, String content){
		this.title = title;
		this.content = content;
	}
}