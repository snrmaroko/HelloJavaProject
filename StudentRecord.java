public class StudentRecord {
    // Instance variables

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    // static/ class variable(s)

    private static int studentCount;

    /**
     * changes the name of the student mutator
     *
     * @param temp
     */
    public void setName (String temp){
        name = temp;
    }

    public String getName(){
        return name;
    }

    /**
     * Computes the avergae of english, maths and science grades
     * accessor method
     * @return
     */
    public double getAverage(){
        double result = 0;
        result =(mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    /**
     *
     * returns the number of instances for student records
     * @return
     */
    public static int getStudentCount(){
        return studentCount;
    }
    public void setAddress (String temp){
        address = temp;
    }

    public String getAddress(){
        return address;
    }

    public void setMathGrade ( double MathsGrade) {
        mathGrade = MathsGrade;
    }
    public double getMathGrade(){
        return mathGrade;
    }

    public double getEnglishGrade(){
        return englishGrade;
    }

    public void setEnglishGrade ( int temp) {
        englishGrade = temp;
    }
    public double getScienceGrade(){
        return scienceGrade;
    }

    public void setScienceGrade ( int temp) {
        scienceGrade = temp;
    }

    public void setAge ( int Age) {
        age = Age;
    }
    public int getAge(){
        return age;
    }




    // We'll add more code here


}
