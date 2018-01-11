package com.mycuteblog.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "parents")
public class Parents {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "parent_type")
	private String parentType;
	@Column(name = "parent_name")
	private String parentName;
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="parents_id")
	private Set<Child> childList;
	
	public Parents(String parentType, String parentName, Set<Child> childList) {
		super();
		this.parentType = parentType;
		this.parentName = parentName;
		this.childList = childList;
	}

	public Parents(){
		
	}
	
	public String getParentType() {
		return parentType;
	}

	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Set<Child> getChildList() {
		return childList;
	}

	public void setChildList(Set<Child> childList) {
		this.childList = childList;
	}
	
}
