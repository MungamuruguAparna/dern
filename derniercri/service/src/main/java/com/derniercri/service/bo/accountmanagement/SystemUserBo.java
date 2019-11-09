package com.derniercri.service.bo.accountmanagement;

import java.io.Serializable;
import java.util.Date;

public class SystemUserBo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int systemUserId;
	protected String emailAddress;
	protected String password;
	protected String mobileNumber;
	protected String emailVerificationCode;
	protected String mobileNumberVerificationCode;
	protected int emailAddressVerified;
	protected int mobileNumberVerified;
	protected Date emailAddressVerificationDate;
	protected Date mobileNumberVerificationDate;
	protected Date lastLoggedInDate;
	protected String accountStatus;
	protected int userRoleId;
	protected String createdBy;
	protected Date createdDate;
	protected String lastModifiedBy;
	protected Date lastModifiedDate;
	public int getSystemUserId() {
		return systemUserId;
	}
	public void setSystemUserId(int systemUserId) {
		this.systemUserId = systemUserId;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailVerificationCode() {
		return emailVerificationCode;
	}
	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}
	public String getMobileNumberVerificationCode() {
		return mobileNumberVerificationCode;
	}
	public void setMobileNumberVerificationCode(String mobileNumberVerificationCode) {
		this.mobileNumberVerificationCode = mobileNumberVerificationCode;
	}
	public int getEmailAddressVerified() {
		return emailAddressVerified;
	}
	public void setEmailAddressVerified(int emailAddressVerified) {
		this.emailAddressVerified = emailAddressVerified;
	}
	public int getMobileNumberVerified() {
		return mobileNumberVerified;
	}
	public void setMobileNumberVerified(int mobileNumberVerified) {
		this.mobileNumberVerified = mobileNumberVerified;
	}
	public Date getEmailAddressVerificationDate() {
		return emailAddressVerificationDate;
	}
	public void setEmailAddressVerificationDate(Date emailAddressVerificationDate) {
		this.emailAddressVerificationDate = emailAddressVerificationDate;
	}
	public Date getMobileNumberVerificationDate() {
		return mobileNumberVerificationDate;
	}
	public void setMobileNumberVerificationDate(Date mobileNumberVerificationDate) {
		this.mobileNumberVerificationDate = mobileNumberVerificationDate;
	}
	public Date getLastLoggedInDate() {
		return lastLoggedInDate;
	}
	public void setLastLoggedInDate(Date lastLoggedInDate) {
		this.lastLoggedInDate = lastLoggedInDate;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SystemUserBo [systemUserId=" + systemUserId + ", emailAddress=" + emailAddress + ", password="
				+ password + ", mobileNumber=" + mobileNumber + ", emailVerificationCode=" + emailVerificationCode
				+ ", mobileNumberVerificationCode=" + mobileNumberVerificationCode + ", emailAddressVerified="
				+ emailAddressVerified + ", mobileNumberVerified=" + mobileNumberVerified
				+ ", emailAddressVerificationDate=" + emailAddressVerificationDate + ", mobileNumberVerificationDate="
				+ mobileNumberVerificationDate + ", lastLoggedInDate=" + lastLoggedInDate + ", accountStatus="
				+ accountStatus + ", userRoleId=" + userRoleId + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + "]";
	}



}
