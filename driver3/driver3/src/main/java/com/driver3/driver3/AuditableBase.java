package com.driver3.driver3;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public class AuditableBase {
	
	@Temporal(TemporalType.DATE)
	@CreatedDate
	@Column(name = "DATE_ADDED")
	private Date createdDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
