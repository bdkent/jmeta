package bdk.jmeta.example;

import java.util.Collections;
import java.util.List;

import bdk.jmeta.example.JMetadataPerson.JMetaPersonClass;
import bdk.jmeta.example.JMetadataPerson.JMetaPersonInstance;

public class Person {
	
	public static final JMetaPersonClass jmeta = null;
	
	public final JMetaPersonInstance jmeta() { return null; }
	
	private final String first;

	private final String last;
	
	public Person(Person p) {
		this.first = p.first;
		this.last = p.last;
	}

	public Person(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public void eat() {
		
	}
	
	public String talk(String words) {
		return first + " said " + words;
	}
	
	public List<Person> getChildren() {
		return Collections.emptyList();
	}
}