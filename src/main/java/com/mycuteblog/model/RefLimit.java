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
@Table(name = "ref_limit")
public class RefLimit {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "limit_type")
	private String limitType;
	
	@Column(name = "limit")
	private String limit;

	public RefLimit(String limitType, String limit) {
		super();
		this.limitType = limitType;
		this.limit = limit;
	}
	public RefLimit(){
		
	}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	public String getLimitType() {
		return limitType;
	}

	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
	
	
	
}
