package com.derniercri.service.service.accountmanagement;

import com.derniercri.service.dto.accountmanagement.CustomerRegistrationDto;

public interface UserManagementService {
	int registerCustomer(CustomerRegistrationDto customerRegistration);

	boolean isEmailAddressAvailable(String emailAddress);

}
