public class CustomerManager {
    private ICustomerDao iCustomerDao;

    public CustomerManager(ICustomerDao iCustomerDao) {
        this.iCustomerDao = iCustomerDao;
    }

    public void add() {
        iCustomerDao.add();
    }
}
