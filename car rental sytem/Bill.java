package carrentalsystem;
public class Bill extends Booking_details {
     int renttime;
    private String total;
    Customer c1;

    public Bill(int renttime, String total, Customer c1, int s_no, int nofdays, String phone_n, String date, String cartype, String f_name, String l_name, String cnic, String phone, String address, String email, int id) {
        super(s_no, nofdays, phone_n, date, cartype, f_name, l_name, cnic, phone, address, email, id);
        this.renttime = renttime;
        this.total = total;
        this.c1 = c1;
    }
    /*public Bill(int renttime, String total, Customer c1, int s_no, int id, String phone_n) {
        super(s_no, id, phone_n);
        this.renttime = renttime;
        this.total = total;
        this.c1 = c1;
    }*/

    public int getRenttime() {
        return renttime;
    }

    public String getTotal() {
        return total;
    }
}
