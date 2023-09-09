package chapter07.section08;

// chapter07/section08/CharacterTest.java
public class CharacterTest{
    public static void main(String[] args) {
        Character c = 'a';
        char res1 = c.charValue();
        System.out.println(res1); // a
        Character a = 'a';
        Character b = 'b';
        System.out.println(a.compareTo(b)); // -1
        System.out.println(a.equals(b)); // false
        System.out.println(Character.isDigit('1')); // true
        System.out.println(Character.isLetter('a')); // true
        System.out.println(Character.isLetterOrDigit('1')); // true
        System.out.println(Character.isLetterOrDigit('a')); // true
        System.out.println(Character.isLowerCase('a')); // true
        System.out.println(Character.isUpperCase('A')); // true
        System.out.println(Character.isSpaceChar(' ')); // true
        System.out.println(c.toString());  // a
        System.out.println(Character.valueOf('c'));  // c
    }
}
