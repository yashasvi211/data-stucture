package Factory;

public class FactoryMain {
    public static void main(String[] args) {
        // Employee e1=new AndroidDev(); Remove this responsibility from this.
        Employee e1 = EmployeeFactory.getEmployee("Web Devoloper");
        System.out.println(e1.salary());
    }
}
