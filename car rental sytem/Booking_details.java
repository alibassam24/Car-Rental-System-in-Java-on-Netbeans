
package carrentalsystem;
public class Booking_details extends Customer {
    public int s_no,nofdays;
    public String phone_n,date,cartype;

    public Booking_details(int s_no, int nofdays, String phone_n, String date, String cartype,
            String f_name, String l_name, String cnic, String phone, String address, String email, int id) {
        super(f_name, l_name, cnic, phone, address, email, id);
        this.s_no = s_no;
        this.nofdays = nofdays;
        this.phone_n = phone_n;
        this.date = date;
        this.cartype = cartype;
    }

    public int getS_no() {
        return s_no;
    }

    public int getNofdays() {
        return nofdays;
    }

    public String getPhone_n() {
        return phone_n;
    }

    public String getDate() {
        return date;
    }

    public String getCartype() {
        return cartype;
    }

    public void setNofdays(int nofdays) {
        this.nofdays = nofdays;
    }


}
