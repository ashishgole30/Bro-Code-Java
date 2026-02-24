/*
 variables = a resuable container for a value
            a variables behaves as if it was the value
            it contains

Primitive = simple value stored directly in memory (stack)
 
Reference = memory address (stack) that points to the (heap)

Primitive


int = (whole numbers)  example = 400  
double = (numbers with decimal points) example = 3.14
char 
boolean 

float
long
short
byte
 

Reference

Class
Interface
Array
String = a series of characters

 */

//  2 Steps to creating a variable
//--------------------------------
// 1. Declaration
// 2. Assignment

public class Variables {
    public static void main(String[] args) {

        String name = "Ashish";
        int age = 21;
        double money = 1.23;
        char currency = '$';
        boolean isLion = true;

        System.out.println("Hey my name is " + name + " My age is " + age + " My gpay balance is " + currency + money
                + " Do you think i am lion? true or false? " + isLion);

    }
}