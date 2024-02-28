public class JavaPrimitives {

    /**
     * Java Primitives
     *
     * Java programming languages provides eight primitive data types namely:
     *
     * i. boolean (for logical)
     * ii. char (for textual)
     * iii. byte
     * iv. short
     * v. int
     * vi. long (integral)
     * vii. double
     * viii. float (floating-point numbers)
     *
     */

    public static void main(String[] args) {

        // 1. Boolean (Logical) data type
        // represents two states -> true or false
        // we use the boolean keyword to create a boolean data type in java
        // example:
        boolean isRainning = false;
        boolean isRunning = true;

        System.out.println(isRainning);
        System.out.println(isRunning);

        // 2. char (Textual) data type
        // represents a single unicode character
        // a character is enclosed in single quotes
        // to create a character data type, we use the char keyword
        char d = 'd';
        char D = 'D';
        // insert a tab -> \t
        System.out.println("\t\t\t\t\t\t\t\tSoftware Development");

        // insert a line break -> \n
        System.out.println("This is a very very veeeery long sentence, \nwe have inserted a line break here...");

        // insert a single quote
        char singleQuote = '\'';
        System.out.println(singleQuote);

        // insert a double quote
        char doubleQuote = '"';
        System.out.println(doubleQuote);

        // create a euro pound
        char euroPound = '\u00A3';
        System.out.println(euroPound);

        char thaiBhat = '\u0E3F';
        System.out.println(thaiBhat);

        char infinity = '\u221E';
        System.out.println(infinity);

        // strings -> represents a data type that contains multiple characters.
        // it is not a primitive data type
        // it has its literals enclosed in double quotes
        // created using String keyword
        String greetingsMessage = "Hello Everyone!";
        System.out.println(greetingsMessage);

        // 3. Integral data types (byte, short, int, and long)
        // integral data types uses three forms -> decimal, octal and hexadecimal.
        // examples: 2 (hexadecimal), 077 (octal) and 0x12 (hexadecimal)
        // the default type of integral data types id int
        // For instance,you define a long value of the integer by using capital letter L or l
        // e.g. 10L
        // Byte -> range -128 to 127 -> length 1byte
        // to create a byte data type we use the byte keyword
        byte myByte;
        myByte = 127;

        // short -> range -32,768 to 32,767 -> Size/length 2bytes
        // to create a short data type, we use short keyword
        short myShort;
        myShort = 32767;

        // int -> range -2,147,483,648 to 2,147,483,647 -> size 4bytes
        // to create an int data type, use int keyword
        int myInt;
        myInt = 2_147_483_647;
        System.out.println(myInt);

        // long -> range -9,223,372,036,854,776 to -9,223,372,036,854,775 -> size 8bytes
        // to create a long data type, use long keyword
        long myLong;
        myLong = 9_223_372_036_854_775L;
        System.out.println(myLong);

        // 7. Floating-point primitive data types (float and double)
        // Floating-point type has double as the default data type.
        // Floating-point literal includes either a decimal point or one of the following
        // E or e (exponential values)
        // F or f (float)
        // D or d (double)
        // Examples:
        // 3.14 - simple floating-point value
        // 6.02E23 - large floating-point value
        // 2.718F - simple float value
        // 123.4E+306D - a very large double value

        // float -> range -2,147,483,648 to 2,147,483,647 -> size 4bytes
        // to create a float data type, use float keyword
        float myFloat;
        myFloat = 1245667;
        System.out.println(myFloat);

        // 8 double -> range -9,223,372,036,854,776 to -9,223,372,036,854,775 -> size 8bytes
        // to create a double data type, use the double keyword
        double myDouble;
        myDouble = 54637387839437746D;
        System.out.println(myDouble);
    }
}
