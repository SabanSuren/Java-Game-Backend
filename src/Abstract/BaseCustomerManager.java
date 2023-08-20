package Abstract;

import Entities.Campaigns;
import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Veritabanına Kaydedildi:");
		
	}
	
	@Override
	public void Delete(Customer customer) {
		System.out.println("Veritabanına Kaydedildi:");
		
	}
	@Override
	public void Update(Customer customer) {
		System.out.println("Veritabanına Kaydedildi:");
		
	}

	public void Delete(Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

}
