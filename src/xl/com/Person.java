package xl.com;

public class Person {
 private int age;
 private String name;
 
 public void setAge(int age) {
	 age=this.age;
	
 }
 
 public void setName(String name) {
	 this.name=name;
 }
 
 public int getAge() {
	 return age;
 }
 
 public String getName() {
	 return name;
 }
 
 public Person() {
	 super();
 }
 public Person(String name,int age) {
	 super();
	 this.name=name;
	 this.age=age;
 }
 

@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
};
 
}
