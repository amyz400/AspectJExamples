drop table if exists JOB_TITLE;
create table JOB_TITLE (
	id INT NOT NULL auto_increment,
   title VARCHAR(20) default NULL,
   low_salary  INT  default NULL,
   high_salary INT default NULL,
   PRIMARY KEY (id)
);

drop table if exists EMPLOYEE;
create table EMPLOYEE (
   id INT NOT NULL auto_increment,
   first_name VARCHAR(20) default NULL,
   last_name  VARCHAR(20) default NULL,
   title_id INT NOT NULL, 
   salary     INT  default NULL,
   PRIMARY KEY (id),
   FOREIGN KEY (title_id) REFERENCES JOB_TITLE(id)
);

drop table if exists AUDIT_ACTION;
create table AUDIT_ACTION (
	id INT NOT NULL auto_increment,
    audit_action VARCHAR(4000) default NULL,
    entity VARCHAR(4000) default NULL,
    PRIMARY KEY(id)
    );
    
INSERT INTO JOB_TITLE (title, low_salary, high_salary) VALUES ('Manager', 70000, 100000);
INSERT INTO JOB_TITLE (title, low_salary, high_salary) VALUES ('Product Owner', 60000, 85000);
INSERT INTO JOB_TITLE (title, low_salary, high_salary) VALUES ('Developer', 70000, 110000);

