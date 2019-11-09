package com.derniercri.service.dao.accountmanagement;

import com.derniercri.service.bo.accountmanagement.SystemUserBo;

public interface UserManagementDao {
	
	int saveCustomer(SystemUserBo systemUserBo);
	int getUserRoleIdByRoleCode(String roleCode);
	int countSystemUserByEmailAddress(String emailAddress);

}
