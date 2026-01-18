package eserciziteoria;
import java.util.ArrayList;
public class StudentGrades 
{
    private String studentName;
    private ArrayList<Integer> grades;
    public StudentGrades(String studentName) 
    {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade) 
    {
        if (grade < 18 || grade > 30) 
        {
            System.out.println("Grade must be between 18 and 30");
            grades.add(grade);
        }
    }
    public double getAvarage()
    {
        if(this.grades.isEmpty())
            return 0;
        int somma = 0;
        for(Integer g : this.grades)
        {
            somma = somma + g;
        }
        return (double)somma / grades.size();
    }
    public double getExpctedGraduationGrade()
    {
        double avarage = getAvarage();
        return (avarage*30.0)/110.0;
    }
}

