package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500 );
        Teacher Kamo = new Teacher(2, "Kamohelo Ntimane", 700);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(Kamo);


        Student Lesedi = new Student(1, "Lesedi Makunye", 11);
        Student Emza = new Student(2, "Emmanuel", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Lesedi);
        studentList.add(Emza);

        School ghs = new School(teacherList, studentList);

        Lesedi.updateFeesPaid(5000);
        Emza.updateFeesPaid(6000);
        System.out.println("GHS has earned R"+ ghs.getTotalMoneyEarned());

        System.out.println("\n----------MAKING SCHOOL PAY TEACHERS SALARY----------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS paid salary to " + lizzy.getName() + " now it is left with " + ghs.getTotalMoneyEarned());

    }
}
