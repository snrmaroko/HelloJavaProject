public class OOP {
    /**
     * CREATING OWN CLASSES
     *
     * At the end of this lecture , you should be able to declare
     *
     * -> create your open classes
     * -> declare properties (fields) and methods (actions) for your classes
     *-> use the "this" keyword to access instance data
     * -> create and call "overloaded" methods
     * -> use access modifiers to control access to class members
     *
     * Defining your own class
     *
     * In Java a class is a blueprint or template for creating objects.
     * It defines the structure and behaviour of objects
     * They encapsulate data(attributes) and methods (functions) that operates on that data.
     *
     * Encapsulation involves bundling the data (attributes) and methods (function) together within a class
     *
     * Encapsulation helps in hiding internal implementation details of a class and exposing only necessary functionalities through well- defined
     * it also ensures data integrity and improves code maintainability by restricting direct access to class members from outsides the class
     * Methods ( also called member functions ) define the behaviour of an object. They perform operations on the objects data or provide functionality .
     * Both attributes and methods are declared within the class definition.

     */

    // Things to take note of the syntax defined in this section
    //*-> means that there may be 0 or more occurrences of the line whre it was applied
    //<descrption> indicates that you may have to substitute an actual value for this part instead of typing
    //[]-> indicates that this part is optional

    // To define a class, we write

    //<modifier> class <name>{
    //<attributeDeclaration>*
    //<constructionDeclaration>*
    // <methodDeclaration>*
   // }

    // where:
    //-> <modifier> is an access modifier, which may be combined with other types of modifier.

    //public class StudentRecord {
        // we will add more code later
    //}

    // Where :
    // public-> means class is accessible to other classes outside the package
    //class-> is the keyword used to create a class in java
    // StudentRecord is unique identifier that describes our class


    // coding guidelines

    // i. Think of an appropriate name for your class.
    // ii. Class names start with a CAPITAL letter - not requirement however
    // The file name of your class must have same name as of your class name

    // Instance Variables vs Static variables.

    //Instance variables (properties) vs class (Static) variables
    //Instance Variables
    //Belong to an object instance
    //value of variable of an object instance is different from the ones of other objects instances.

    // Class variables
    // variables that belong to the whole class
    //This means that they have same value for all the objects instances in the same class.

    //Instance variables
    // Declaring properties (attributes)
    // To declare a certain attributes for our class , we write

    //<modifier><type><name> [=<default_value>];

    //coding guidelines
    // i. Declare all instance variables right after "public" class
    // ii.Declare one variable for each line
    // iii. Use an appropriate data type for each variable you declare
    // iv. declare instance variables as private so that only class method can access them directly (encapsulation)

    // Static Variables(class variables)
    // We use the keyword "static" to indicate that a variable is a static variable.

    //where:
    //private here means that variables are only accessible within the class. Other objects can not access these variables directly

    // Methods
    // To declare methods we write

    //<modifier> <returnType> <name>(<parameter>*){
    //   <statements>*
    //}

    // Where:
    // <modifier> -> can carry a number of different modifiers
    // <returnType> -> can be any data type(including void)
    // <name> can be any valid identifier
    // <parameter> -<parameter_type > <parameter_name>

    // Accessor (getter) methods
    // used to read values from our class variables (instances/static
    // usually written as:
    // get<NameOfInstanceVariable>
    // it also returns a value
    // public String getName(){
    //   return name;
    // }

    // where
    //public means that the method can be called from objects outside the class.
    // String - is the return type of the method. this means that the method should return a value of type string.
    //getName - the name of the method
    //() - this means that out method does not have any parameters

    //Mutator (Setter) method

    // Used to write or change values of our class variables (instance /static)
    //Usually written as:
    // set <NameOfInstanceVariable>

    //public void setName (String temp){
     //   name = temp;
    //}

    // where:
    //public - means that method can be called from outside the class.
    //void - means that the method does not return an value
    // setName - the name of the method
    // (String temp) - parameter that will be used inside our method.


    // Multiple return statements
    // You can have multiple return statements for a method as long as they are on the same block.

    // You can also use constants to return values instead of variables.

    // Example:
    public String getNumberInWords (int num){
        String defaultNum = "zero";
        if(num==1){
            return "One";  // return a constant
        }else if(num == 2){
            return "Two"; // returns a constant
        }
        //return variable
        return defaultNum;
    }

// Static methods
    //public static int getStudentCount(){
    //    return studentCount;
    //}

    //where:
    //static- means that method is static and should be called by typing ,[ClassName.MethodName]. for example : in this case we call the method StudentRecord.getStudentCount()
    // int - is the return type of the method. this means that the method should return a value of type int.
    // getStudentCount - the name of the method
    // () - this means that out method does not have any parameters

    // Coding guidelines
    // i. method names should start with small letter
    // ii. method names should be verbs
    // iii. always provide documentation before the declaration of the method. you can use javadocs style for this .

}
