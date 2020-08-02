package com.arzds.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Alien implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private Name name;
	private String color;
	@OneToMany(mappedBy = "alien",fetch = FetchType.EAGER)
	private Collection<Laptop> laptops = new ArrayList<Laptop>();

	
	
	public Collection<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(Collection<Laptop> laptops) {
		this.laptops = laptops;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + ", laptops=" + laptops + "]";
	}


}
