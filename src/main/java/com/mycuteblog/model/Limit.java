package com.mycuteblog.model;

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
@Table(name = "limit")
public class Limit {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	
	
	
	
}
