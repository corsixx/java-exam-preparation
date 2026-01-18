package eserciziteoria;

import java.util.ArrayList;

public class StudentGradesv2 
{
    private String studentName;
    private ArrayList<Integer> grades;
    private double avarage;
    private double GraduationGrade;
    public StudentGradesv2(String studentName) 
    {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
        this.avarage = 0;
        this.GraduationGrade = 0;
    }
    public void addGrade(int grade) 
    {
        if (grade < 18 || grade > 30) 
        {
            System.out.println("Grade must be between 18 and 30");
            
        }
        grades.add(grade);
        recalculate();
    }
    public void recalculate()
    {
        if(this.grades.isEmpty())
        {
            this.avarage = 0;
            this.GraduationGrade = 0;
            return;
        }
        int somma = 0;
        for(Integer g : this.grades)
        {
            somma = somma + g;
        }
        this.avarage = (double)somma / grades.size();
        GraduationGrade = (this.avarage*30.0)/110.0;
    }
    public double getAvarage()
    {
        return this.avarage;
    }
    public double getExpctedGraduationGrade()
    {
        double avarage = getAvarage();
        return (avarage*30.0)/110.0;
    }
}
