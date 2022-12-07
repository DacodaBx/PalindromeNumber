public class PalindromeNumber {
    public static void main(String[] args){
        int x = 123;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x == 0){
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reversedInt = 0;
        while(x > reversedInt) {
            int pop = x % 10;
            x /= 10;
            reversedInt = (reversedInt * 10) + pop;
        }
        if (x == reversedInt || x == reversedInt / 10) {
            return true;
        } else {
            return false;
        }
    }
}

/*Dacoda's Notes: 
 * "A Palindrome is => A palindrome is a word, number, phrase,
 * or other sequence of symbols that reads the same backwards
 * as forwards, such as the words madam or racecar." -Wikipedia
 * 
 * A number is x, this is the number in question.
 * This example it's numbers. 0 will be a true Palindrome.
 * No matter how you look at it, it's 0.
 * If the number is less than 0 or when divided by 10
 * doesn't have a modulus aka a remainder, it is not a Palindrome.
 * Make a variable to hold the incoming numbers.
 * In order to flip a number, it must have a remainder after being
 * divided by 10. That modulus is then multiplied by 10.
 * The multiplication step is what reverses the numbers
 * and place them in the proper sequence.
 * If the variable we made to hold the incoming numbers 
 * that have been modulused and multiplied off,
 * is the same as x, then it is true.
 */