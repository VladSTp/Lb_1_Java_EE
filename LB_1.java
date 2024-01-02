/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lb_1;

/**
 *
 * @author Admin
 */
public class LB_1 {

    public static void main(String[] args) 
    {
        try {
            Employee employee = new Employee();
            employee.setName("Іван");
            employee.setId(1);
            employee.setSurname("Петренко");
            employee.setSalary(1000);
            employee.PrintEmployee();

            employee.setName("Іван1111111111111111111111111111111111111111");
            employee.PrintEmployee();

            employee.setSalary(-100.0);
            employee.PrintEmployee();
        } catch (FieldLengthLimitException | IncorrectSalaryException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
