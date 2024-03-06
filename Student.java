public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public Student(){
        this("Some String");

    }

    public Student( String temp){
        this.name = temp;
    }

    public Student( String name, String address){
        this.name = name;
        this.address = address;
    }

    public Student (double mGrade, double sGrade, double eGrade){
        mathGrade =mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }


}
