package lesson5;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        System.out.println("ФИО: " + fullName + "; Должность: " + position + "; " +
                "email: " + email + "; Телефон: " + phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age + ".");
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Brad Pitt", "Sales manager",
                "b.pitt@mailbox.com", "424465", 350000, 45);
        persArray[1] = new Employee("Will Smith", "Consultant",
                "w.smith@mailbox.com", "425689", 300000, 30);
        persArray[2] = new Employee("Tom Cruise", "Manager",
                "t.cruise@mailbox.com", "422235", 280000, 35);
        persArray[3] = new Employee("Tom Hanks", "Chief Manager",
                "t.hanks@mailbox.com", "423712", 400000, 45);
        persArray[4] = new Employee("Bruce Lee", "Financier",
                "b.lee@mailbox.com", "429805", 380000, 50);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40)
                System.out.println(persArray[i].fullName + ": " + persArray[i].age);
        }
    }
}
