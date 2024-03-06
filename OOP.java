public class OOP {
    /**
     * CREATING OWN CLASSES
     * <p>
     * At the end of this lecture , you should be able to declare
     * <p>
     * -> create your open classes
     * -> declare properties (fields) and methods (actions) for your classes
     * -> use the "this" keyword to access instance data
     * -> create and call "overloaded" methods
     * -> use access modifiers to control access to class members
     * <p>
     * Defining your own class
     * <p>
     * In Java a class is a blueprint or template for creating objects.
     * It defines the structure and behaviour of objects
     * They encapsulate data(attributes) and methods (functions) that operates on that data.
     * <p>
     * Encapsulation involves bundling the data (attributes) and methods (function) together within a class
     * <p>
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
    public String getNumberInWords(int num) {
        String defaultNum = "zero";
        if (num == 1) {
            return "One";  // return a constant
        } else if (num == 2) {
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

    // challenge -> create a class called car, think of attributes of a car and then create all the setters and getters. create 5 objects (cars).


    public class myCar {

        private String carColor;

        private String carName;
        private String carReg;

        private int carSpeed;

        private String carMake;


        // car color
        public void setCarColor(String temp) {
            carColor = temp;
        }

        public String getCarColor(String temp) {
            return carColor;
        }
        // car Name


        public void setCarName(String temp) {
            carColor = temp;
        }

        public String getCarName(String temp) {
            return carColor;
        }

        // car registration

        public void setCarReg(String temp) {
            carReg = temp;
        }

        public String getCarReg(String temp) {
            return carReg;
        }

        // car speed

        public void setCarSpeed(int Speed) {
            carSpeed = Speed;
        }

        public int getCarSpeed() {

            return carSpeed;
        }

        public void setCarMake(String temp) {
            carMake = temp;
        }

        public String getCarMake(String temp) {
            return carMake;
        }


        // overloading methods.

        // allows method with the sam name but different parameters , to have different implementation and return values of different types.
        // can be used when the same operations has different implementations.

        //Always remember that overloaded methods have the following properties.
        //-> the same method name
        //-> different parameters or number of parameters
        //-> return types can be different or same.

        // add two methods in studentRecord class

        // Constructor methods

        // constructor are important in instantiating an object
        // its a method where all the initialization are placed
        // the folling are properties of constructor:
        //-> have the same name as the class
        // A constructor is just like an ordinary method, however only the following information can be place inside the header of constructor .
        // scope or accessiblity identifier like (public.. ), constructors name and parameter if it has any.
        // -> Constructor does not have any return valeu
        // you cannot call a constructor directly, it can only be called by using the "new" operator during class instantiation.

        // to declare a constructor, we write
        //<Modifier> <className> (<parameter(s)>){
        //      <statement>*
        //}

        // Default constructor (method)
        // The default constructor (no- arg constructor)
        //-> is a constructor without any parameters
        // if the class does not specify any constructors, then an implicit constructor is created.

        // Example of default constructor
        // public studentRecord(){
        // some code
        //}

        // overloading constructor methods
        //public studentRecord(){
            // some code
            //}

        // public student( String temp){
            // this.name = temp;
            //}

        // public student(String name, String address){
            // this.name= name;
        // this.address = address;
            //}

        // public student(double mGrade, double sGrade, double eGrade){
        // mathGrade= mGrade;
        // englishGGrade= eGrade;
        // scienceGrade = sGrade;
        //}

        // This()  constructor call
        // constructor calls can be changed meaning, you can call another constructor from inside another constructor
        // we can use this() call for this
        // There are a few things to remember when using this constructor call
        //-> when using this constructor call , It must occur as the first statement in a constructor.
        //-> It can only be used in a constructor definition. This () call can be followed by any another relevant statements.


        // "this" refference
        // The "this" reference refers to current objects instance itself.
        // used to access the instance variables shadowed by the parameters.
        //To use the "this" reference , we type:
        // this.<nameofInstanceVariables>

        // you can only use the "this" reference for instance variables and not static or class variables.


        // Access Modifiers
        //There are four different types of member access modifiers in java.

        // i. public (least restrictive)
        // ii. protected
        // iii. default
        // iv. private (most restrictive)

        // The first three access modifiers are explicitly written in the code to indicate the access type, for the 3rd one "default" no key word is used.

        //i. Public accessibility
        // specifies that class members (variables or members ) are accessible to anyone, both inside and outside class the clas and outside package
        // Any object that interacts with the class can have to acccess to the public members of the class
        // Keyword: public
        // example: public int userAge;. public String username;

        // ii. protected accessibility.
        // Specifies that the class members are accessible only to methods in that class and the subclasses of the class
        // The subclass can be in different packages
        // Keyword: protected
        //example: protected String name;


        // iii. default accessibility
        // specifies that only classes in the same package can have access to the class variable and methods.
        // No actual keyword for the default modifier - it is applied in the absence of an access modifier.
        //Example: String name;


        //iv. private accessibility
        // specifies that the class member are only accessible by the class they are defined in.
        // keyword: private
        // example: private in accountNumber;


        //N/B:
        //The instance variables of a class should normally be declared "private", and the class will just provide accessor and mutator methods to these variables.





    }
}
