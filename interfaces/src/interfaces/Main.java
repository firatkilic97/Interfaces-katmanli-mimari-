
package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new EmailLogger());
        Customer fırat=new Customer(1212, "fırat", "kılıç");
        customerManager.add(fırat);
       
    }
    
}
