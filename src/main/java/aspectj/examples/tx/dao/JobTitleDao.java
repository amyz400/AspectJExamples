package aspectj.examples.tx.dao;

/**
 * Created by amy on 4/26/17.
 */
public class JobTitleDao {

    private int id;
    private String title;
    private int low_salary;
    private int high_salary;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getLow_salary() { return low_salary; }

    public void setLow_salary(int low_salary) { this.low_salary = low_salary; }

    public int getHigh_salary() { return high_salary; }

    public void setHigh_salary(int high_salary) { this.high_salary = high_salary; }
}
