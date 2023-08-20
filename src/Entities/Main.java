package Entities;

import Abstract.BaseCustomerManager;
import Concrete.CustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new CustomerManager();
		
			baseCustomerManager.Save(new Customer(1,"Şaban","Süren",null ,null, null,"15199957264",1996));
			
		

	}

}
