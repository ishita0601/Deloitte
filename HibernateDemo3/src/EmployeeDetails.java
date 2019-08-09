import java.util.Set;

public class EmployeeDetails 
{
		private int employeeId;
		private String employeeName;
		private int employeeSalary;
		private Set employeeAddress;
		
		public EmployeeDetails() {
			
		}

		public EmployeeDetails(int employeeId, String employeeName, int employeeSalary, Set employeeAddress) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
			this.employeeAddress = employeeAddress;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public int getEmployeeSalary() {
			return employeeSalary;
		}

		public void setEmployeeSalary(int employeeSalary) {
			this.employeeSalary = employeeSalary;
		}

		public Set getEmployeeAddress() {
			return employeeAddress;
		}

		public void setEmployeeAddress(Set employeeAddress) {
			this.employeeAddress = employeeAddress;
		}

		@Override
		public String toString() {
			return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + ", getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()="
					+ getEmployeeName() + ", getEmployeeSalary()=" + getEmployeeSalary() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
}
