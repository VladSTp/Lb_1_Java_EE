/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lb_1;

/**
 *
 * @author Admin
 */
public class Employee 
{
    private int id;
    private static int nextId = 0;

    private String name;
    private String surname;
    private double salary;

    public Employee() 
    {
        this.id = nextId++;
    }
    
    public void PrintEmployee(){
        System.out.println("ID:"+id+" Name: "+name+" Surname: "+surname+" Salary: "+salary);
    }
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException 
    {
        if (name.length() > 30) 
        {
            throw new FieldLengthLimitException("Максимальна довжина поля name - 50 символів");
        }

        this.name = name;
    }

    public String getSurname() 
    {
        return surname;
    }

    public void setSurname(String surname) throws FieldLengthLimitException 
    {
        if (surname.length() > 50) 
        {
            throw new FieldLengthLimitException("Максимальна довжина поля surname - 50 символів");
        }

        this.surname = surname;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) throws IncorrectSalaryException 
    {
        if (salary < 0) 
        {
            throw new IncorrectSalaryException("Заробітна плата не може бути від'ємною");
        }

        this.salary = salary;
    }
}
