import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CoursesChoosing
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++)
        {
            String name;
            int grade;

            name = scanner.next();
            grade = scanner.nextInt();

            int courseNum;

            courseNum = scanner.nextInt();

            Course[] courses = new Course[courseNum];
            String courseName;
            int courseHours;
            for (int j = 0; j < courseNum; j++)
            {
                courseName = scanner.next();
                courseHours = scanner.nextInt();

                courses[j] = new Course(courseName, courseHours);
            }
            students[i] = new Student(name, grade, courses);
        }
        Printer printer = new Printer();
        for (int i = 0; i < n; i++)
        {
            try
            {
                printer.print("第" + (i + 1) + "学生信息如下:\n");
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            students[i].showMessage();
        }
    }
}

class Printer
{
    public static BufferedWriter stdout;

    static
    {
        stdout = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
    }

    public static void print(String str) throws IOException
    {
        stdout.write(str);
        stdout.flush();
    }
}

class Student
{
    private String name;
    private int grade;
    private Course[] courses;

    public Student(String name, int grade, Course[] courses)
    {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public Course[] getCourses()
    {
        return courses;
    }

    public void setCourses(Course[] courses)
    {
        this.courses = courses;
    }

    public int getHours()
    {
        int totalHours = 0;
        for (Course course : courses)
        {
            totalHours += course.getCourseHour();
        }
        return totalHours;
    }

    public void showMessage()
    {
        Printer printer = new Printer();
        try
        {
            printer.print(name + " " + grade + "年级\n");
            printer.print("选修的课程包括:\n");
            for (int i = 0; i < courses.length; i++)
            {
                printer.print("(" + (i + 1) + ")" + courses[i].getCourseName() + "\t" + courses[i].getCourseHour() + "分\n");
            }
            printer.print("总学分:" + this.getHours() + "\n");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

class Course
{
    private String courseName;
    private int courseHour;

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public int getCourseHour()
    {
        return courseHour;
    }

    public void setCourseHour(int courseHour)
    {
        this.courseHour = courseHour;
    }

    public Course(String courseName, int courseHour)
    {
        this.courseName = courseName;
        this.courseHour = courseHour;
    }
}