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

        // print the students names

        System.out.println(dennisRecord.getName());
        System.out.println(dominicRecord.getName());
        System.out.println(ianRecord.getName());

        // print number of students

        System.out.println(" count = " + StudentRecord.getStudentCount());
    }
}
