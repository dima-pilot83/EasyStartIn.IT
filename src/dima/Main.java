package dima;

import dima.interfaces.RollCall;
import dima.interfaces.SeniorStudentChoice;
import dima.objects.Group;
import dima.objects.Professor;
import dima.objects.Students;

public class Main {

	public static void main(String[] args) {

		
		Professor professor = (new Professor("Nikolai", "Vasilev", 60, true, "Math"));
		Students st1 = (new Students("Andrei1", "Petrov1", 17, true, "A"));
		Students st2 = (new Students("Andrei2", "Petrov2", 16, true, "A"));
		Students st3 = (new Students("Andrei3", "Petrov3", 18, true, "A"));
		Students st4 = (new Students("Andrei4", "Petrov4", 19, true, "A"));
		Students st5 = (new Students("Andrei5", "Petrov5", 18, true, "A"));
		Students st6 = (new Students("Andrei6", "Petrov6", 22, true, "A"));
		Students st7 = (new Students("Andrei7", "Petrov7", 18, true, "A"));
		Students st8 = (new Students("Andrei8", "Petrov8", 18, true, "A"));
		Students st9 = (new Students("Andrei9", "Petrov9", 16, true, "A"));
		Students st10 = (new Students("Andrei10", "Petrov10", 18, true, "A"));

		
		Students[] studentArray = { st1, st2, st3, st4, st5, st6, st7, st8, st9, st10 };
		Students[] presentStudentArray = { st1, null, st3, st4, st5, null, st7, st8, st9, st10 };
		
		Group groupA = new Group();
		groupA.setStudentArray(studentArray);
		groupA.setPresentStudentArray(presentStudentArray);

		SeniorStudentChoice seniorStudentChoice = groupA;
		RollCall rollCall = professor;

		seniorStudentChoice.seniorStudent("age", "16");
		rollCall.makeRollCall(groupA.getPresentStudentArray(), groupA.getStudentArray());

	}

}
