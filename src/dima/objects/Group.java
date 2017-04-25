package dima.objects;


import dima.interfaces.SeniorStudentChoice;

public class Group implements SeniorStudentChoice {

	private Students[] studentArray = new Students[10];
	private Students[] presentStudentArray = new Students[10];

	public Group() {
		super();
	}

	public Students[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(Students[] studentArray) {
		this.studentArray = studentArray;
	}

	public Students[] getPresentStudentArray() {
		return presentStudentArray;
	}

	public void setPresentStudentArray(Students[] presentStudentArray) {
		this.presentStudentArray = presentStudentArray;
	}

	public void seniorStudent(String parameter, String value) {
		try {
			int count = 0;
			for (Students students : studentArray) {
				if (parameter.equalsIgnoreCase("name") && students.getName().equalsIgnoreCase(value)) {
					System.out.println("Senior student is " + students.toString());
					count++;
					break;
				}
				if (parameter.equalsIgnoreCase("age") && students.getAge() == Integer.parseInt(value)) {
					System.out.println("Senior student is " + students.toString());
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("There are no students that match your parameters. Try other parameter.");
			}
		} catch (Exception e) {
			System.out.println("Got Senior student ERROR! "+e.getMessage());
		}
	}

}
