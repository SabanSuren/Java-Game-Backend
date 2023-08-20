package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService checkService;

	@Override
	public void Delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Save(Customer customer) {
		if (checkService.CheckIfRealPerson(customer)) {
			
		}else {
			System.out.println("Gecerli Bir kullanici degil");
		}
		
	}

}
	
	


