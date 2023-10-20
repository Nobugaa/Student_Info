/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respitory;

import java.util.ArrayList;
import Model.Student;
import Data_Access.StudentDao;

/**
 *
 * @author fpt
 */
public class StudentRepository implements IStudentRepository{
    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(ArrayList<Student> students) {
        StudentDao.Instance().addStudent(students);
    }

    @Override
    public void print(ArrayList<Student> students) {
        StudentDao.Instance().print(students);
    }

    @Override
    public void display() {
        StudentDao.Instance().display();
    }
    

    
    
}
