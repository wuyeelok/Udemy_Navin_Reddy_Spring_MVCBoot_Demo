package com.kenneth.springmvcboot.model;

public class ReddyAlien implements Alien {

	private int aid;
	private String aname;

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
