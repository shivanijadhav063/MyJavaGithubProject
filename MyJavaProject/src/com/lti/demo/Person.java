package com.lti.demo;

public class Person {
private String personName;
private int personAge;
private String personScore;
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public int getPersonAge() {
	return personAge;
}
public void setPersonAge(int personAge) {
	this.personAge = personAge;
}
public String getPersonScore() {
	return personScore;
}
public void setPersonScore(String personScore) {
	this.personScore = personScore;
}
@Override
public String toString() {
	return "Person [personName=" + personName + ", personAge=" + personAge + ", personScore=" + personScore + "]";
}
public Person(String personName, int personAge, String personScore) {
	super();
	this.personName = personName;
	this.personAge = personAge;
	this.personScore = personScore;
}


}
