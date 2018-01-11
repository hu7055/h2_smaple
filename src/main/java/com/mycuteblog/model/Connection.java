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
@Table(name = "connection")
public class Connection {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	
	@Column(name = "connection_type")
	private String connectionType;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="child_id")
	private Set<SecondChild> secondChilds;
	
	public Connection(String connectionType, Set<SecondChild> secondChilds) {
		super();
		this.connectionType = connectionType;
		this.secondChilds = secondChilds;
	}
	public Connection(){
		
	}
	
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public Set<SecondChild> getSecondChilds() {
		return secondChilds;
	}
	public void setSecondChilds(Set<SecondChild> secondChilds) {
		this.secondChilds = secondChilds;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
