package com.ImportExcel.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ImportExcel.fetchmodel.Fetchid;




@Entity
@Table(name = "Test_excel")
public class Model {

	  @Id
	  @Column(name = "id")
	  @GeneratedValue()
	  private long id;

	  @Column(name = "title")
	  private String title;

	  @Column(name = "description")
	  private String description;

	  @Column(name = "published")
	  private boolean published;
	
	  @Column(name = "Mobile")
	  private long Mobile;
	
	  @Column(name = "UserId")
	  private long UserId;  
	  
	
	  
	
	

	public Model() {
		
	}
  
	  public Model(long id, String title, String description, boolean published, long mobile) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
		Mobile = mobile;
	}

	  


	public long getMobile() {
			return Mobile;
		}

		public void setMobile(long mobile) {
			Mobile = mobile;
		}

	public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public boolean isPublished() {
			return published;
		}

		public void setPublished(boolean published) {
			this.published = published;
		}

		public long getUserId() {
			return UserId;
		}

		public void setUserId(long userId) {
			UserId = userId;
		}

		        
}
