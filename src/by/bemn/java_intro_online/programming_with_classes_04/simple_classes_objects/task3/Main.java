package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task3;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student();
        students[0].setFio("Smirnov S.M.");
        students[0].setGroupNumber(6);
        students[0].setNotes(new int[]{9, 9, 9, 9, 10});

        students[1] = new Student("Sidorov S.S.", 2, new int[]{8, 7, 8, 9, 10});
        students[2] = new Student("Durov T.S.", 2, new int[]{9, 9, 9, 9, 10});
        students[3] = new Student("Pupikov S.H.", 3, new int[]{10, 9, 10, 9, 10});
        students[4] = new Student("Persikov A.A.", 3, new int[]{8, 8, 8, 9, 10});
        students[5] = new Student("Kotik S.R.", 2, new int[]{9, 9, 5, 9, 10});
        students[6] = new Student("Bublikova D.S.", 1, new int[]{7, 7, 7, 9, 10});
        students[7] = new Student("Ivanov I.I.", 1, new int[]{8, 7, 8, 9, 8});
        students[8] = new Student("Ivanova K.I.", 3, new int[]{9, 9, 9, 9, 9});

        students[9] = new Student();

        for(Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nStudents who have only notes 9 or 10\n");

        for(Student student : students) {

            if(student.isGoodStudent()) {
                System.out.println(student);
            }

        }
        
    }
}
