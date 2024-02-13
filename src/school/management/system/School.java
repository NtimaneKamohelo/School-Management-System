package school.management.system;

import java.util.List;

/**
 * Many teachers, Many Students.
 * Implements teachers and student using ArrayList
 * Created by Kamohelo Vincent Ntimane 08/02/2024
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New school object is created
     * @param teachers - list of teachers in the school.
     * @param students - List of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    /**
     *
     * @return a list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds new teacher to the school.
     * @param teacher - the teacher to be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return a list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds new student to the school
     * @param student - the student to be added.
     *
     *  single student: addStudents(Student student)
     *  Multiple students: addStudents(List<Student> students)
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school(teachers allowance)
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *  adds the total money spent by the school(Teachers Allowance).
     * @param MoneySpent - the total money spent by the school to pay teachers allowances
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent -= MoneySpent;
    }
}
