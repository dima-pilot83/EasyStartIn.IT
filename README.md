# EasyStartIn.IT
User manual

1) To use this program you should go to Main class;
2) First you should create Professor and Students as shown in example:

Professor professor = (new Professor("Nikolai", "Vasilev", 60, true, "Math"));
Where input parameters and their types are:
Nikolai - name (string);
Vasilev - last name (string);
60 – age (integer);
true – sex (boolean: true-male, false- female);
Math – department name (string).

Students st1 = (new Students("Andrei1", "Petrov1", 17, true, "A"));
Where input parameters and their types are:
Andrei1 – name (string);
Petrov1 – last name (string);
17 – age (inetger);
true – sex (boolean: true-male, false- female);
A – group name (string).

3) You have to add all students which belong to one group to array (Students[] studentArray) as shown in example:
Students[] studentArray = { st1, st2, st3, st4, st5, st6, st7, st8, st9, st10 };

4) You have to add all students which are present at classes to array (Students[] presentStudentArray) as shown in example:
Students[] presentStudentArray = { st1, null, st3, st4, st5, null, st7, st8, st9, st10 };
where “null” means the student is not present at classes.

5) Elections of Senior student is performed by seniorStudent method as shown in example:
seniorStudentChoice.seniorStudent("age", "16");
Method has two parameters:
-	age (string). Possible options: 1) age, 2) name.
-	16 (string). Any possible number from -2147483648 to 2147483647.
In example given above the students will elect the first student from the list which has age 16 y.o. as a Senior student of group. 
The program will show in console the elected student and all of his parameters.

6) Making a roll call is performed by makeRollCall method. You should not change the input parameters of this method. 
The program will show in console all absent students and their parameters or otherwise the program will show that all students are present.
