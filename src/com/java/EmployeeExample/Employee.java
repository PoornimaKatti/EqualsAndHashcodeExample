package com.java.EmployeeExample;
import java.util.*;

public class Employee {
    private int id;
    private String name;
    private String gender;
public void setID(int id)
{
    this.id=id;
}
public int getID()
{
    return id;
}

    public void setName(String name)
    {
        this.name=name;

    }
    public String getName()
    {
        return name;
    }

    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getGender()
    {
        return gender;
    }

    public Employee(int ID, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
