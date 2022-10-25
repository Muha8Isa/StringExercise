package se.lexicon;


public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
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
    public static void ex4(){
        String greeting = "Ok this is not as long!";
        System.out.print("Ex4: ");
        System.out.println(greeting.substring(11, greeting.length() - 1));
    }

    /* 5. Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to
    uppercase and print it out again. */
    public static void ex5(){
        String sen = "CAPS EQUALS SCREAMING";
        System.out.print("Ex5 a: ");
        System.out.println(sen.toLowerCase());
        System.out.print("Ex5 b: ");
        System.out.println(sen.toUpperCase());
    }

    /* 6. Correct the following String: "Java is the worst programming language!" by replacing the (obviously
        incorrect) word "worst" with the word "best". Then print out the sentence. */
    public static void ex6(){
        String wrong = "Java is the worst programming language!";
        System.out.print("Ex6: ");
        System.out.println(wrong.replace("worst", "best"));
    }

    // 7. What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
    public static void ex7(){
        String trimm = "\tJ\ta\tv\ta\t";
        System.out.print("Ex7 a: ");
        System.out.println(trimm.trim());
        System.out.print("Ex7 b: ");
        System.out.println(trimm.replace( "\t", " "));
    }

    // 8. Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".
    
}