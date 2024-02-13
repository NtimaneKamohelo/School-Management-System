package school.management.system;

/**
 *  Created by Kamohelo Vincent Ntimane on 06/02/2024
 *  This class is responsible for keeping track of students fees, name & fees paid
 * */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create a new student by initializing.
     * Initial fees for every student are = R0.
     * Total fees for every student are equal to R30000.
     *
     * @param id - id number for student: Unique
     * @param name - name of the student
     * @param grade - grade of the student
     */

    public Student (int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    /* Not going to alter the students name, and id. */

    /**
     * used to update the students grade.
     * @param grade - new grade of the student.
     */

    public void setGrade (int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to fees paid field.
     * Add the fees to fees paid.
     * The school receives Monthly fees.
     * @param fees - fees that the student pays monthly.
     */
    public void updateFeesPaid(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id - return the student's id.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name - return the students name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade - return the students grade.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return feesPaid - return the students paid fees monthly.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return feesTotal - return the total fees paid by the student yearly.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }
}
