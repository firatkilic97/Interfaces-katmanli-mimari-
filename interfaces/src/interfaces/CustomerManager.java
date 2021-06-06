
package interfaces;


public class CustomerManager {
    private Logger logger;

    public CustomerManager(Logger logger) {
        this.logger = logger;
    }
    public void add(Customer customer){
        System.out.println("müsteri eklendi "+customer.getFirstname());
        this.logger.log(customer.getFirstname());
    }
    public void delete(Customer customer){
        System.out.println("müşteri silindi"+ customer.getFirstname());
        
    }
}
