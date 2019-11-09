package com.derniercri.service.serviceimpl.accountmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.derniercri.service.bo.accountmanagement.SystemUserBo;
import com.derniercri.service.daoimpl.accountmanagement.UserMnagementDaoImpl;
import com.derniercri.service.dto.accountmanagement.CustomerRegistrationDto;
import com.derniercri.service.service.accountmanagement.UserManagementService;
import com.derniercri.service.util.accountmanagement.RandomCodeGenerator;
import static com.derniercri.service.constants.DerniercriConstants.*;

import java.util.Date;
@Service
public class UserMangementServiceImpl implements UserManagementService{
	@Autowired
	private UserMnagementDaoImpl userMnagementDaoImpl;

	@Override
	public int registerCustomer(CustomerRegistrationDto customerRegistration) {
		int systemUserId = 0;
		int customerUserRoleId = 0;
		SystemUserBo systemUser = null;
		String emailVerificationCode = null;
		String mobileNumberVerificationCode = null;

		customerUserRoleId = userMnagementDaoImpl.getUserRoleIdByRoleCode(ROLE_CUSTOMER);

		systemUser = new SystemUserBo();
		systemUser.setEmailAddress(customerRegistration.getEmailAddress());
		systemUser.setMobileNumber(customerRegistration.getMobileNumber());
		systemUser.setPassword(customerRegistration.getPassword());
		systemUser.setUserRoleId(customerUserRoleId);

		emailVerificationCode = RandomCodeGenerator.generateRandomAlhpaNumericWithSpecialCharsToken(12);
		mobileNumberVerificationCode = RandomCodeGenerator.generateRandomNumericToken(6);

		systemUser.setEmailVerificationCode(emailVerificationCode);
		systemUser.setMobileNumberVerificationCode(mobileNumberVerificationCode);
		systemUser.setEmailAddressVerified(0);
		systemUser.setMobileNumberVerified(0);
		systemUser.setAccountStatus(STATUS_SYSTEM_USER_REGISTERED);

		systemUser.setCreatedBy(GLOBAL_SYSTEM_USER);
		systemUser.setCreatedDate(new Date());
		systemUser.setLastModifiedBy(GLOBAL_SYSTEM_USER);
		systemUser.setLastModifiedDate(new Date());

		systemUserId = userMnagementDaoImpl.saveCustomer(systemUser);

		return systemUserId;
	}

	@Override
	public boolean isEmailAddressAvailable(String emailAddress) {
		int count = 0;
		count = userMnagementDaoImpl.countSystemUserByEmailAddress(emailAddress);
		return count > 0 ? false : true;
	}
	/*
	 * public static void main(String[] args) { ApplicationContext context=new
	 * AnnotationConfigApplicationContext("com.derniercri.service");
	 * UserMangementServiceImpl
	 * userMangementServiceImpl=context.getBean("userMangementServiceImpl",
	 * UserMangementServiceImpl.class);
	 * System.out.println(userMangementServiceImpl); }
	 */

}
