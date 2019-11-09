package com.derniercri.service.daoimpl.accountmanagement;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.derniercri.service.bo.accountmanagement.SystemUserBo;
import com.derniercri.service.dao.accountmanagement.UserManagementDao;
import com.derniercri.service.serviceimpl.accountmanagement.UserMangementServiceImpl;

@Repository
public class UserMnagementDaoImpl implements UserManagementDao{
	
	private final String SQL_INSERT_SYSTEM_USER = "INSERT INTO system_user (email_address, password, mobile_nbr, email_verification_code, mobile_nbr_verification_code, is_email_address_verified, is_mobile_nbr_verified, account_status, created_by, created_dt, last_modified_by, last_modified_dt, user_role_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
	private final String SQL_GET_USER_ROLE_ID_BY_ROLE_CODE = "select user_role_id from user_role where role_cd = ?";
	private final String SQL_COUNT_SYSTEM_USER_BY_EMAIL_ADDRESS = "select count(1) from system_user where email_address = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveCustomer(SystemUserBo systemUserBo) {
		int systemUserId;
		KeyHolder keyHolder = null;


		keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(SQL_INSERT_SYSTEM_USER, new String[] { "system_user_id" });
			pstmt.setString(1, systemUserBo.getEmailAddress());
			pstmt.setString(2, systemUserBo.getPassword());
			pstmt.setString(3, systemUserBo.getMobileNumber());
			pstmt.setString(4, systemUserBo.getEmailVerificationCode());
			pstmt.setString(5, systemUserBo.getMobileNumberVerificationCode());
			pstmt.setInt(6, systemUserBo.getEmailAddressVerified());
			pstmt.setInt(7, systemUserBo.getMobileNumberVerified());
			pstmt.setString(8, systemUserBo.getAccountStatus());
			pstmt.setString(9, systemUserBo.getCreatedBy());
			pstmt.setDate(10, new java.sql.Date(systemUserBo.getCreatedDate().getTime()));
			pstmt.setString(11, systemUserBo.getLastModifiedBy());
			pstmt.setDate(12, new java.sql.Date(systemUserBo.getLastModifiedDate().getTime()));
			pstmt.setInt(13, systemUserBo.getUserRoleId());

			return pstmt;
		}, keyHolder);
		systemUserId = keyHolder.getKey().intValue();

		return systemUserId;
	}

	@Override
	public int getUserRoleIdByRoleCode(String roleCode) {
		return jdbcTemplate.queryForObject(SQL_GET_USER_ROLE_ID_BY_ROLE_CODE, Integer.class, roleCode);
	}

	@Override
	public int countSystemUserByEmailAddress(String emailAddress) {
		return jdbcTemplate.queryForObject(SQL_COUNT_SYSTEM_USER_BY_EMAIL_ADDRESS, Integer.class, emailAddress);
	}
	
	/*
	 * public static void main(String[] args) { ApplicationContext context=new
	 * AnnotationConfigApplicationContext("com.derniercri.service");
	 * UserMnagementDaoImpl
	 * userMangementServiceImpl=context.getBean("userMnagementDaoImpl",
	 * UserMnagementDaoImpl.class); System.out.println(userMangementServiceImpl); }
	 */
}
