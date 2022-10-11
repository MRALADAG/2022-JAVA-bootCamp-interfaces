public class Main {
    public static void main(String[] args) {
        ICustomerDao iCustomerDao = new MySqlCustomerDao();
        CustomerManager customerManager = new CustomerManager(iCustomerDao);
        customerManager.add();
    }
}
