package com.kenneth.springmvcboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reddyalien")
public class ReddyAlien implements Alien {

	@Id
	private int aid;
	private String aname;

	public ReddyAlien() {

	}

	public ReddyAlien(int aid, String aname) {
		this.aid = aid;
		this.aname = aname;
	}

	@Override
	public int getAid() {
		return aid;
	}

	@Override
	public void setAid(int aid) {
		this.aid = aid;
	}

	@Override
	public String getAname() {
		return aname;
	}

	@Override
	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "ReddyAlien [aid=" + aid + ", aname=" + aname + "]";
	}

}
