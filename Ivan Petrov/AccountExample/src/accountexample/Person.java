
package accountexample;


public class Person {
    private int age;
    private String Name;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return "Name = " + Name + ", age=" + age +  ", email=" + email + ", phone=" + phone + '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String Name) {
        this.Name = Name;
    }
}
