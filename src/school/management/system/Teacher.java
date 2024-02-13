package school.management.system;

/**
 * Created by Kamohelo Vincent Ntimane 06/02/2024
 * This class is responsible for keeping track of the
 * Teachers id, name and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * Creates a new teacher object.
     * @param id - id number for the teacher: unique.
     * @param name - name of the teacher.
     * @param salary - monthly salary of the teacher.
     */

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }


    /**
     * @return id - return the teachers id numbers.
     */
    public int getId (){
        return id;
    }


    /**
     * @return name - return the teachers name.
     */
    public String getName(){
        return name;
    }


    /**
     * @return salary - return the teachers monthly salary
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to Salary.
     * Removes from the total money earned from the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned -= salary;
        School.updateTotalMoneySpent(salary);

    }

}
