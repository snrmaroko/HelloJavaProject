public class Main {
    //use this class to run studentsRecords class

    public static void main(String[] args){
        // create three objects for students records classs
        StudentRecord dennisRecord = new StudentRecord();
        StudentRecord dominicRecord = new StudentRecord();
        StudentRecord ianRecord = new StudentRecord();

        // set the names of the students
        dennisRecord.setName("dennis");
        dominicRecord.setName("dominic");
        ianRecord.setName("ian");

        // set the students record
        dominicRecord.setName("dominic");
        dominicRecord.setEnglishGrade(10);
        dominicRecord.setMathGrade(20);
        dominicRecord.setScienceGrade(30);

        // print the students info

        System.out.println("Students name: " + dominicRecord.getName());
        System.out.println("Maths Grade: " + dominicRecord.getMathGrade());
        System.out.println("Science Grade: " + dominicRecord.getScienceGrade());
        System.out.println("English Grade: " + dominicRecord.getEnglishGrade());


        // print number of students

        System.out.println("count = " + StudentRecord.getStudentCount());

// set students info
        dominicRecord.setAddress("Nairobi");
        dominicRecord.setName("Dominic");
        dominicRecord.setAge(34);
        dominicRecord.setEnglishGrade(80);
        dominicRecord.setMathGrade(90);
        dominicRecord.setScienceGrade(70);

// overloaded methods
        dominicRecord.print(dominicRecord.getName());
        dominicRecord.print(dominicRecord.getScienceGrade(),dominicRecord.getEnglishGrade(),dominicRecord.getMathGrade());

    }
}
