package aspectj.examples.tx.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CascadeType;

/**
 * Created by amy on 4/26/17.
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private JobTitle jobTitle;
    private int salary;

    public Employee() { }
    public Employee(String fname, String lname, int salary) {
        this.firstName = fname;
        this.lastName = lname;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return id;
    }
    public void setId( int id ) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME",nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName( String first_name ) {
        this.firstName = first_name;
    }

    @Column(name = "LAST_NAME",nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName( String last_name ) {
        this.lastName = last_name;
    }

    @ManyToOne
    @JoinColumn(name="title_id")
    public JobTitle getJobTitle() { return jobTitle; }
    public void setJobTitle(JobTitle jobTitle) { this.jobTitle = jobTitle; }

    @Column(name = "SALARY",nullable = false)
    public int getSalary() {
        return salary;
    }
    public void setSalary( int salary ) {
        this.salary = salary;
    }
}
