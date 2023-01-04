package entities;

import java.util.Objects;

public class Candidate implements Comparable<Candidate> {

	private Integer key;
	private String name;
	
	public Candidate(Integer key, String name) {
		this.key = key;
		this.name = name;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(key, other.key) && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Candidate other) {
		
		return name.toUpperCase().compareTo(other.name.toUpperCase());
	}

	
	
	
}
