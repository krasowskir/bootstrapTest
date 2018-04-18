package com.example.model;

public class Player {

    private String name;
    private int alter;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAlter() {
	return alter;
    }

    public void setAlter(int alter) {
	this.alter = alter;
    }

    public Player() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @param name
     * @param alter
     */
    public Player(String name, int alter) {
	this.name = name;
	this.alter = alter;
    }

}
