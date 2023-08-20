package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getBirdDate());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}	
		return true;
	}

}
