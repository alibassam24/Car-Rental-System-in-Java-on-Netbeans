
package carrentalsystem;

public class Customer {
    private String f_name,l_name, cnic, phone,address,email;
    private int id;

    public Customer(String f_name, String l_name, String cnic, String phone, String address, String email, int id) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.cnic = cnic;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.id = id;
    }
   public Customer(){
    
}
    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getCnic() {
        return cnic;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }
}
