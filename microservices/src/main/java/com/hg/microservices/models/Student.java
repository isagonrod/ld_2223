package com.hg.microservices.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Student")
@Table(name = "\"Students\"", schema = "public")
public class Student extends Person implements Serializable {
}
