package com.example.employeecrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "emp_seq_gen"
    )
    @SequenceGenerator(
        name = "emp_seq_gen",
        sequenceName = "EMPLOYEE_SEQ",
        allocationSize = 1
    )
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "DEPARTMENT")
    private String department;

    public Employee() {}

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
