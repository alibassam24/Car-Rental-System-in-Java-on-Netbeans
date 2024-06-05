
package carrentalsystem;

public class Renting_Payment  extends Booking_details{
  Bill b1;
  private int rent_timeduration;

    public Renting_Payment(Bill b1, int rent_timeduration, int s_no, int nofdays, String phone_n, String date, 
            String cartype, String f_name, String l_name, String cnic, String phone, String address, String email, int id) {
        super(s_no, nofdays, phone_n, date, cartype, f_name, l_name, cnic, phone, address, email, id);
        this.b1 = b1;
        this.rent_timeduration = rent_timeduration;
    }

    public int getRent_timeduration() {
        return rent_timeduration;
    }

    public void setRent_timeduration(int rent_timeduration) {
        this.rent_timeduration = rent_timeduration;
    }
   
}