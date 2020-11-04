package com.xworkz.collection;

public class Fish {
	
	private String Species;
	private boolean isAlive;
	private String weight;
	
	public Fish(String species, boolean isAlive, String weight) {
		super();
		Species = species;
		this.isAlive = isAlive;
		weight = weight;
	}
	
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
	weight = weight;
	}

	@Override
	public String toString() {
		return "Fish [Species=" + Species + ", isAlive=" + isAlive + ", weight=" + weight + "]";
	}
	
	

}
