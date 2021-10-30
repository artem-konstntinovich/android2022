
package accountexample;


public class AccountExample {

    public static void main(String[] args) {
        System.out.println("Hello from AccountExample");
        
        User acc1 = new User("Max Sidorov","KitUnity","123");// создали объект и отправили под
                               //наблюдение Java машины
        
        System.out.println("Информация бо аккаунте:");
        System.out.println(acc1);
        acc1.setPassword("Password123");
        System.out.println(acc1);
        acc1.setAge(20);
        acc1.setEmail("max.sidorov@gmail.com");
        acc1.setPhone("+30667012345");
        acc1.changePassword("123", "Password123");
        System.out.println(acc1);
        MyWindow window = new MyWindow();
        window.setVisible(true);
        
        Person p1 = new Person("Ivan Petrov");
        p1.setAge(18);
        p1.setEmail("petrov@gmail.com");
        p1.setPhone("+380937012345");
        System.out.println("Person info: "+p1);
        
    }
    
}
