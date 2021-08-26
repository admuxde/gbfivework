package ru.dolgov;

class Staff {
    public String fio;
    public String post;
    public String email;
    public String phone;
    public double salary;
    public int age;

   public Staff( String fio, String post, String email,String phone, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    void show() {
        System.out.println("ФИО:" + fio + "\nДолжность:" + post + "\nПочта:"
                + email + "\nЗарплата:" + salary + "\nВозраст:" + age);
    }
}
