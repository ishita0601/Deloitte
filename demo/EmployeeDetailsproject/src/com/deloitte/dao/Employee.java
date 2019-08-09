package com.deloitte.dao;

import java.io.Serializable;

public class Employee implements Serializable {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String Fname;
		private String Lname;
		private String Empid;
		private String Dob;
		private String Address;
		
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}


		public Employee(String fname, String lname, String empid, String dob, String address) {
			super();
			Fname = fname;
			Lname = lname;
			Empid = empid;
			Dob = dob;
			Address = address;
		}


		@Override
		public String toString() {
			return "Employee2 [Fname=" + Fname + ", Lname=" + Lname + ", Empid=" + Empid + ", Dob=" + Dob + ", Address="
					+ Address + "]";
		}


		public String getFname() {
			return Fname;
		}


		public void setFname(String fname) {
			Fname = fname;
		}


		public String getLname() {
			return Lname;
		}


		public void setLname(String lname) {
			Lname = lname;
		}


		public String getEmpid() {
			return Empid;
		}


		public void setEmpid(String empid) {
			Empid = empid;
		}


		public String getDob() {
			return Dob;
		}


		public void setDob(String dob) {
			Dob = dob;
		}


		public String getAddress() {
			return Address;
		}


		public void setAddress(String address) {
			Address = address;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Address == null) ? 0 : Address.hashCode());
			result = prime * result + ((Dob == null) ? 0 : Dob.hashCode());
			result = prime * result + ((Empid == null) ? 0 : Empid.hashCode());
			result = prime * result + ((Fname == null) ? 0 : Fname.hashCode());
			result = prime * result + ((Lname == null) ? 0 : Lname.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (Address == null) {
				if (other.Address != null)
					return false;
			} else if (!Address.equals(other.Address))
				return false;
			if (Dob == null) {
				if (other.Dob != null)
					return false;
			} else if (!Dob.equals(other.Dob))
				return false;
			if (Empid == null) {
				if (other.Empid != null)
					return false;
			} else if (!Empid.equals(other.Empid))
				return false;
			if (Fname == null) {
				if (other.Fname != null)
					return false;
			} else if (!Fname.equals(other.Fname))
				return false;
			if (Lname == null) {
				if (other.Lname != null)
					return false;
			} else if (!Lname.equals(other.Lname))
				return false;
			return true;
		}

}
 