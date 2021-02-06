/*
Objective
In this challenge, we review some basic concepts that will get you started with this series. You will need to use the same (or similar) syntax to read input and write output in challenges throughout HackerRank. Check out the Tutorial tab for learning materials and an instructional video!

Task
To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.

You've got this!

Note: The instructions are Java-based, but we support submissions in many popular languages. You can switch languages using the drop-down menu above your editor, and inputString the  variable may be written differently depending on the best-practice conventions of your submission language.

Input Format

A single line of text denoting inputString (the variable whose contents must be printed).

Output Format

Print Hello, World. on the first line, and the contents of inputString on the second line.

Sample Input

Welcome to 30 Days of Code!
Sample Output

Hello, World. 
Welcome to 30 Days of Code!
Explanation

On the first line, we print the string literal Hello, World.. On the second line, we print the contents of the  variable which, for this sample case, happens to be Welcome to 30 Days of Code!. If you do not print the variable's contents to stdout, you will not pass the hidden test case.
*/

/* Tutorial
Class

At its most basic level, a class is a collection of variables 
(fields) and functions called methods. A program is a
 collection of classes. The basic code for declaring a Java 
 lass is as follows:

class MyClass{
    // This is a single-line comment.
    
    //  This is also a comment.
        This type of comment can span several lines
    /
}
When declaring a class, the name should always start with 
a capital letter; this signifies to certain compilers 
(and human readers of your code) that it is a class
 (or other similarly-behaved structure that you'll learn 
 about later). If you wish to use a compound phrase 
 (e.g.: "my class") as your class name, you should write 
 it in CamelCase; this means you should capitalize each 
 word and remove spaces between words (e.g.: "MyClass").


Note: Class names cannot begin with numbers or contain any
 spaces.

Variable
Think of this as a name (identifier) that points to 
(references) a location in memory where information 
associated with that name can be stored. In Java
(and many other languages), it is a best practice to 
always start variable names with a lowercase letter and 
use CamelCase for variable names composed from compound 
phrases. Variable names cannot contain spaces or special 
characters (except underscores), though they can contain 
(but not begin with) numbers. A variable that is a member
 of a class is called a field.


Each variable has a data type associated with it, which 
essentially restricts what that variable is allowed to 
reference. This means your code will not work if you 
attempt to perform operations on your variables that aren't
 allowed for that data type. To declare a variable named  
myVariable having the data type DataType, we write the following:

DataType myVariable;


If we want to declare a variable of type DataType named myVar1 and
 initialize it to be value(here, we are using the word value as a 
 stand-in for a valid value of type DataType), we write:

DataType myVar1 = value;

In English, the above code is basically saying: "I'm creating
 a variable named mVar1; it refers to something of type DataType, 
 and is assigned an initial value of value."


Note: The = operator is called the assignment operator, so 
you should interpret = as the English phrase "[left operand]
 is assigned the value of [right operand]".


A String is a data type that holds a sequence of characters.
To create a String variable named  myString that stores the value 
"Hi!", write the following line of code:

String myString = "Hi!";


The compiler will interpret the characters between the two 
uotation marks as a String. Saving a reference to our it as 
variable myString allows us to refer to it again and again by 
referencing our variable name,myString.


Note: Some coders use lowercase letters in conjunction with 
nderscores to simulate spaces when declaring variables 
(e.g.: "my_variable"). This is a style called "lower 
snake case" and is not the naming convention used in Java, 
though there are many other languages where you might see 
this used frequently (e.g.: C, C++, Python, etc.); however, 
you may see some Java coders begin certain special variable 
names (e.g.: private class variables or constants) with an 
underscore to distinguish them from other variables used 
throughout their program.


Function
A sequence of packaged instructions that perform a task.


Method
In Object-Oriented programming, a method is a type of 
function that operates on the fields of a class.

int myMethod(){
	// ...does cool stuff.
}
void myMethod(int myInt){
	// ...does cool stuff.
}
Check out Oracle's Method documentation to learn more.


Object
An Object is an instance (or variable) of a class.


Stream
Think of this as the flow of data from one place to another.
Most of our challenges require you to read input from System.in
 (also known as stdin, the standard input stream), and write 
 output to System.out (also known as stdout, the standard 
 output stream). In Java, the Scanner class is widely used
  to read input, but each language has its own mechanism
   for handling IO (input and output).


The syntax for reading from stdin using the Scanner class 
is as follows:

Scanner scan = new Scanner(System.in);

This creates a new Scanner object that reads from the 
System.in stream and can be accessed using the variable 
name scan. To read in information from stdin, you just need 
to apply Scanner's methods to your scanner object. Here 
are two basic examples:

scan.next(); // returns the next token of input
scan.hasNext(); // returns true if there is another token of input (false otherwise)
scan.nextLine() // returns the next LINE of input
scan.hasNextLine(); // returns true if there is another line of input
Check out the comprehensive list of Scanner methods to learn more.


When you are finished reading from an input stream, 
you should close it to avoid a resource leak. The 
following line of code closes the Scanner object 
referenced by our scan variable:

scan.close();
Let's say we want to assign a value received from stdin to
 some String that we'll name s, and then print it. We can 
 accomplish this with the following code:

Scanner scan = new Scanner(System.in); // open scanner
String s = scan.next(); // read the next token and save it to 's'
scan.close(); // close scanner
System.out.println(s); // print 's' to System.out, followed by a new line
If the input token is Hi!, the above code will print Hi!.


You can also print text in quotes using System.out.println,
or combine quoted text with a variable
 (e.g.: System.out.println("Input received: " + s);).

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	}
}

/*
Problem Setter's code:

C
int main() {
    char inputString[105]; // declare a variable to hold our input
    scanf("%[^\n]", inputString); // get a line of input from stdin and save it to our variable
  
    // Your first line of output goes here
    printf("Hello, World.\n");

    // Write the second line of output
    printf("%s", inputString);

    return 0;
}

C++
#include <iostream>

using namespace std;

int main() {
   string inputString; // declare a variable to hold our input
   getline(cin, inputString); // get a line of input from cin and save it to our variable
  
   // Your first line of output goes here
   cout << "Hello, World." << endl;

   cout << inputString;

   return 0;
}

Java
public class Solution {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
      String inputString = scan.nextLine(); // read a line of input and save it to a variable
      scan.close(); // close the scanner
      
      // Your first line of output goes here
      System.out.println("Hello, World.");
      
      System.out.println(inputString);
   }
}

Javascript
function processData(inputString) {
    console.log("Hello, World.");
    console.log(inputString);
} 

Swift
let inputString = readLine()! 
print("Hello, World.")
print(inputString)

VB.NET
Imports System

Module Solution
    
    Public Shared Sub Main()
        ' Create a String variable:
        Dim greeting As String 

        ' Read value from stdin and save it to variable:
        greeting = Console.ReadLine() 

        ' Write "Hello, World." to stdout:
        Console.WriteLine("Hello, World.")
        
        ' Print variable to stdout:
        Console.WriteLine(greeting)
    End Sub
End Module
Tested by AvmnuSng
Problem Tester's code:

COBOL

IDENTIFICATION DIVISION.
PROGRAM-ID. APP.
AUTHOR. ABHIMANYU SINGH.
ENVIRONMENT DIVISION.
INPUT-OUTPUT SECTION.
FILE-CONTROL.
SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.
DATA DIVISION.
FILE SECTION.
FD SYSIN.
01 ln PIC X(255).
88 EOF VALUE HIGH-VALUES.
WORKING-STORAGE SECTION.
PROCEDURE DIVISION.
OPEN INPUT SYSIN
READ SYSIN
AT END SET EOF TO TRUE
END-READ
DISPLAY "Hello, World.".
DISPLAY ln
PERFORM UNTIL EOF      
READ SYSIN
AT END SET EOF TO TRUE
END-READ
END-PERFORM
CLOSE SYSIN
STOP RUN.
*/