public class CoursesChoosing
{
    public static void main(String[] args)
    {

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
        System.out.print(name+" "+grade+"年级");
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