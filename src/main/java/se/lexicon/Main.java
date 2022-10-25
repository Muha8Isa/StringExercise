package se.lexicon;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
    }

    public static void ex1() {
        // 1. What is the length of the String: "Java" ?
        String string = "Java";
        System.out.print("Ex1: ");
        System.out.println("Length of the string Java is: " + string.length());
    }

    // 2. What char is at index position 6 in the following String: "Long example sentence" ?
    public static void ex2() {
        String sentence = "Long example sentence";
        System.out.print("Ex2: ");
        System.out.println("The char is at index position 6 is: " + sentence.charAt(6));
    }

    // 3. What is the index position of 'o' in the following String: "Even longer example sentence" ?
    public static void ex3() {
        String string = "Even longer example sentence";
        int index1 = string.indexOf("o");
        System.out.print("Ex3: ");
        System.out.println("The index position of 'o' is : " + index1);
    }

    // 4. Given the following String: "Ok this is not as long!"create a substring of only "not as long" (excluding the exclamation point) and print it out.
    public static void ex4() {
        String greeting = "Ok this is not as long!";
        System.out.print("Ex4: ");
        System.out.println(greeting.substring(11, greeting.length() - 1));
    }

    /* 5. Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to
    uppercase and print it out again. */
    public static void ex5() {
        String sen = "CAPS EQUALS SCREAMING";
        System.out.print("Ex5 a: ");
        System.out.println(sen.toLowerCase());
        System.out.print("Ex5 b: ");
        System.out.println(sen.toUpperCase());
    }

    /* 6. Correct the following String: "Java is the worst programming language!" by replacing the (obviously
        incorrect) word "worst" with the word "best". Then print out the sentence. */
    public static void ex6() {
        String wrong = "Java is the worst programming language!";
        System.out.print("Ex6: ");
        System.out.println(wrong.replace("worst", "best"));
    }

    // 7. What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
    public static void ex7() {
        String trimm = "\tJ\ta\tv\ta\t";
        System.out.print("Ex7 : ");
        System.out.println(trimm.replaceAll("\t", ""));
    }

    // 8. Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".
    public static void ex8() {
        int number = 20;
        String s = String.valueOf(number);
        System.out.print("Ex8: ");
        System.out.println(s + "20");
    }

    /* 9. Oil and water don't go well together.
    Given the String: "Oil and Water", split them up into the words "Oil","Water"
    and store them in a String array. */
    public static void ex9() {

        /* An easier approach:
        String sentence = "Oil And Water";
        String[] array;
        array = sentence.split(" And ");

        System.out.println(Arrays.toString(array));
        */

        String mix = "Oil and Water";
        System.out.print("Ex9: ");
        String oil = mix.substring(0, 4);
        String water = mix.substring(8, 13);

        // Declaring an empty string array
        String[] arr1;
        String[] arr2;
        // Converting using String.split() method with whitespace as a delimiter
        arr1 = oil.split(" ");
        arr2 = water.split("");
        // Printing the converted string array
        for (String s : arr1) {
            System.out.print(s + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
    }

    // 10. Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.
    public static void ex10() {
        /*String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] array;
        array = names.split(" ");
        System.out.print("Ex10: ");
        System.out.println(Arrays.toString(array));*/

        // OR USE SAME METHOD AS EXERCISE 9
    }

    // 11. Convert the following String: "ThisShouldBeConverted" to
    // a char array. Iterate through the char array and print out each element.
    public static void ex11() {
        String convert = "ThisShouldBeConverte";
        System.out.println("Ex11: Answer below");
        for (int i = 0; i < convert.length(); i++) {
            char c = convert.charAt(i);
            System.out.println("char at " + i + " index is: " + c);
        }
    }

    // 12. Convert the following char[]: {'J','a','v','a'} to a String and print it out.
    public static void ex12() {
        char[] convert = {'J','a','v','a'};
        System.out.print("Ex12: ");
        String str = String.valueOf(convert);
        System.out.println(str);
    }


}