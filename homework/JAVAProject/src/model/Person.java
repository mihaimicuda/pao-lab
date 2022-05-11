package model;

public class Person implements Comparable<Person>{
    private String lastName;
    private String firstName;
    private String phoneNo;


    public Person(){
    }

    public Person(String lastName, String firstName, String phoneNo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNo = phoneNo;
    }

    public Person(Person Person) {
        this.lastName = Person.lastName;
        this.firstName = Person.firstName;
        this.phoneNo = Person.phoneNo;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getphoneNo() {
        return phoneNo;
    }

    public void setphoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "lastName " + lastName + '\n' +
                "firstName " + firstName + '\n' +
                "Numar telefon " + phoneNo + '\n';
    }

    @Override
    public int compareTo(Person p){
        String fullname = this.lastName + this.firstName;
        String p_fullname = p.lastName + p.firstName;
        return fullname.compareTo(p_fullname);
    }
}

