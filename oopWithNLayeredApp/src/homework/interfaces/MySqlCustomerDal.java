package homework.interfaces;

public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("MySql eklendi");
	}

}
