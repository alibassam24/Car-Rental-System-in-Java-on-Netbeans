
package carrentalsystem;
public class Order_Place extends Booking_details {
   private int  order_no;

    public Order_Place(int order_no, int s_no, int nofdays, String phone_n, String date, String cartype, String f_name, String l_name, String cnic, String phone, String address, String email, int id) {
        super(s_no, nofdays, phone_n, date, cartype, f_name, l_name, cnic, phone, address, email, id);
        this.order_no = order_no;
    }

    public int getOrder_no() {
        return order_no;
    }

    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }


  
}