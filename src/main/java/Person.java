package java_assignments2.src.main.java;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int ss;
    public static int count = 0;


    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 999;
        this.ss = 0;
        count++;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 999;
        count++;
    }

    public Person(String firstName, String lastName, int age, int ss){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ss = ss;
        count++;
    }

    public String speak(){
        if (firstName.isEmpty()){
            return "I don't have a name.";
        }
        else{
            return "My name is " + this.firstName + " " + this.lastName + (this.age == 999 ? "." : " and I am " + this.age + " years old.");
        }
    }

    public static int getPersonCount(){
        return count;
    }


    public String toString(){
        return (!this.firstName.isEmpty() ? (this.firstName + " " + this.lastName) : "N/A") + " " 
        + (this.ss == 0 ? "" : Integer.toString(this.ss).substring(5));
    }
}
