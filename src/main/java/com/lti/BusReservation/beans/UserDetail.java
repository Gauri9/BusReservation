package com.lti.BusReservation.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class UserDetail {
		
		@Id
		@Column(name="EMAIL")
		private String email;
		
		@Column(name="FIRSTNAME")
		private String firstname;
		
		@Column(name="LASTNAME")
		private String lastname;
		
		@Column(name="DOB")
		private String dob;
		
		@Column(name="MOBILE")
		private String mobile;
		
		@Column(name="GENDER")
		private String gender;
		
		@Column(name="ADDRESS")
		private String address;
		
		@Column(name="PASSWORD")
		private String password;
		
		@Column(name="WALLET_BALANCE")
		private int walletBalance;
		
		@Column(name="USER_ROLE")
		private String userRole;
		
		public UserDetail() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserDetail(String email, String firstname, String lastname, String dob, String mobile, String gender,
				String address, String password, int wallet_balance, String user_role) {
			super();
			this.email = email;
			this.firstname = firstname;
			this.lastname = lastname;
			this.dob = dob;
			this.mobile = mobile;
			this.gender = gender;
			this.address = address;
			this.password = password;
			this.walletBalance = wallet_balance;
			this.userRole = user_role;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getWallet_balance() {
			return walletBalance;
		}
		public void setWallet_balance(int wallet_balance) {
			this.walletBalance = wallet_balance;
		}
		public String getUser_role() {
			return userRole;
		}
		public void setUser_role(String user_role) {
			this.userRole = user_role;
		}
		@Override
		public String toString() {
			return "UserDetail [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob
					+ ", mobile=" + mobile + ", gender=" + gender + ", address=" + address + ", password=" + password
					+ ", wallet_balance=" + walletBalance + ", user_role=" + userRole + "]";
		}
		
		
	}
