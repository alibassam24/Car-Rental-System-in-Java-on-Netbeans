
package carrentalsystem;
public class Employee extends Customer {
    private String name;
    private String Phone_no;
    private String registration;
    private int joinyear;

    public Employee(String name, String Phone_no, String registration, int joinyear, 
            String f_name, String l_name, String cnic, String phone, String address, String email, int id) {
        super(f_name, l_name, cnic, phone, address, email, id);
        this.name = name;
        this.Phone_no = Phone_no;
        this.registration = registration;
        this.joinyear = joinyear;
    }
    public Employee()
    {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String Phone_no) {
        this.Phone_no = Phone_no;
    }
}
