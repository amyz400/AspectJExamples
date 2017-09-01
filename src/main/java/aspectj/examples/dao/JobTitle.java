package aspectj.examples.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by amy on 4/26/17.
 */
@Entity
@Table(name = "JOB_TITLE")
public class JobTitle {

    private int id;
    private String title;
    private int low_salary;
    private int high_salary;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false)

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Column(name="TITLE")
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    @Column(name="LOW_SALARY")
    public int getLow_salary() { return low_salary; }
    public void setLow_salary(int low_salary) { this.low_salary = low_salary; }

    @Column(name="HIGH_SALARY")
    public int getHigh_salary() { return high_salary; }
    public void setHigh_salary(int high_salary) { this.high_salary = high_salary; }
}
