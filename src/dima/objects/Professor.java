package dima.objects;

import dima.interfaces.RollCall;

public class Professor extends Human implements RollCall {

	private String department;

	public Professor(String name, String lastname, int age, boolean sex, String department) {
		super(name, lastname, age, sex);
		this.department = department;
	}

	public Professor() {
		super();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Professor [department=" + department + "]" + super.toString();
	}

	public void makeRollCall(Students[] presentStudentArray, Students[] studentArray) {

		try {
			int count = 0;
			for (int i = 1; i <= presentStudentArray.length; i++) {
				if (presentStudentArray[i - 1] == null) {
					System.out.println("Absent student " + studentArray[i - 1]);
					count++;
				}
			}
			if (count == 0) {
				System.out.println("All students are present!");
			}
		} catch (Exception e) {
			System.out.println("Got Roll Call ERROR! " + e.getMessage());
		}
	}
}
