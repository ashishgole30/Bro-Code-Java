public class ArraysOne {
    public static void main(String[] args) {

        // 1. Arrays definition
        // 2. Syntax for creating an array
        // 3. Printing an array gives us a memory address
        // 4. Primitive data type vs Reference data type
        // 5. Accessing an element in an array using index number
        // 6. Prining an element that does not exist gives us an error
        // 7. Changing value at a given index number in array

        // 1.
        // Array = a collection of values of the same data type
        // Think of it as a variable that can store more than 1 value

        // 2.
        // Syntax for creating an array
        // dataType[] arrayName = {value1, value2, value3, ...};

        // 3. if we print this we will get a memory address
        // Since Arrays fall into the category of Reference Data Type
        // The memory address is the location in the computer's memory where the array
        // is stored
        String[] fruitOne = { "Apple", "Orange", "Banana", " Coconut" };
        System.out.println(fruitOne);
        System.out.println("-----------------------------");

        // Primitive Data type
        // 1. int
        // 2. double
        // 3. char
        // 4. boolean

        // Reference Data type
        // 1. String
        // 2. Array
        // 3. Object

        // 4.
        // Each Value inside an array is called an Element
        // To access an Element we have to indicate an index number

        String[] fruitTwo = { "Apple", "Orange", "Banana", " Coconut" };
        System.out.println(fruitTwo[0]);
        System.out.println("-----------------------------");

        // NOTE: The index number starts at 0, not 1
        // [0] = Apple gives the first value in the array
        // [1] = Orange gives the second value in the array
        // [2] = Banana gives the third value in the array
        // [3] = Coconut gives the fourth value in the array

        // 5.
        // If we try to access an index that does not exist, we will get an error
        String[] fruitThree = { "Apple", "Orange", "Banana", " Coconut" };
        // System.out.println(fruitThree[5]);
        System.out.println("Error: ArrayIndexOutOfBoundsException");
        System.out.println("-----------------------------");

        // 6.
        // Changing value at a given index number in array
        fruitThree[0] = "Mango";
        System.out.println(fruitThree[0]);
        // This will give us Mango instead of Apple because we changed the value at
        // index 0 to Mango

    }
}