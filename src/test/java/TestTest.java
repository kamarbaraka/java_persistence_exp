import bussiness_objects.payments.BankPayment;
import bussiness_objects.payments.CashPayment;
import bussiness_objects.payments.MobilePayment;
import bussiness_objects.payments.Payment;

public class TestTest {

    public static void main(String[] args) {

        MobilePayment mobilePayment = new MobilePayment("1256655", 154.00);
        CashPayment cash = new CashPayment(25.00);
        BankPayment bankPayment = new BankPayment("jhdg", "gsuyg", 245.00);

        pay(mobilePayment);
        pay(cash);
        pay(bankPayment);
    }

    public static void pay(Payment payment){


    }
}
