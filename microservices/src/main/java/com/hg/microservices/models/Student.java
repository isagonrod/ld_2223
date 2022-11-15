package com.hg.microservices.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Student")
@Table(name = "\"Students\"", schema = "public")
public class Student extends Person implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "schoolarship", columnDefinition = "boolean DEFAULT 'false'")
	private Boolean schoolarship;
}
