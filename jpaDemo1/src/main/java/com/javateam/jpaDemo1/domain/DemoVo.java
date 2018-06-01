/**
 * 
 */
package com.javateam.jpaDemo1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author javateam
 *
 */
@Entity
public class DemoVo {

	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String name;
	
	public DemoVo() {}
	
	/**
	 * @param id
	 * @param name
	 */
	public DemoVo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
} //