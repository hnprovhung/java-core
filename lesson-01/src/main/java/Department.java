public class Department {
    // 1. Thuoc tinh - Property
    int id;
    String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 2. Phuong thuc - Method
    void showInfo() {
        System.out.println("Department[" + id + ", " + name + "]");
    }
}