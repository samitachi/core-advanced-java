package ai.kiya.Scope.domain;

public class Person {
private String name;
private int age;
public Person() {
	
}
public Person(final String name, final int age) {
	this.name = name;
	this.age=age;
}
@Override
public String toString() {
	return "Person[name=" + name +"]";
	
}
}
