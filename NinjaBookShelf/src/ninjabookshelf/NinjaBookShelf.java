/**
 * NinjaBookShelf was created by Phillip Feist
 * Using the NetBeans IDE 7.2.1
 * For the Zappos TechU Coding Challenge
 * Thanks for viewing!
 **/
package ninjabookshelf;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author Phil Feist
 */
public class NinjaBookShelf {

    public static void main(String[] args) {
      /**
       * This program uses an alphabetically sorted array to produce a bookshelf
       * effect.
       */
        String[] ninjaBooks = { "Deadly Silence", "Ninjutsu For Dummies", "Enter"
                + " the Ninja", "Return of the Ninja", "Hiding in Plain Sight", 
                "9,999 Ways to Die", "Handbook of the League of Shadows, Volume"
                + " 1"};
        /**
         * This displays the ninja books, unsorted,
         */
        
        System.out.println("This week's shipment of Ninja books"
                + " includes: " + ninjaBooks[0] + ", " + ninjaBooks[1] + ", \n" +
                ninjaBooks[2] + ", " + ninjaBooks[3] + ", " + ninjaBooks[4] +
                ", " + ninjaBooks[5] + ", and \n" + ninjaBooks[6] + ".");
        
        /**
         * Now the books are sorted alphabetically, and the characters of each 
         * book is printed separately.
         **/
        
        Arrays.sort(ninjaBooks);
        
        /**
         * For loop prints each letter of each book in turn
         */
   for (int i=0; i<43; i++){
                
            char book1 = ninjaBooks[0].charAt(i);
            char book2 = ninjaBooks[1].charAt(i);
            char book3 = ninjaBooks[2].charAt(i);
            char book4 = ninjaBooks[3].charAt(i);
            char book5 = ninjaBooks[4].charAt(i);
            char book6 = ninjaBooks[5].charAt(i);
            char book7 = ninjaBooks[6].charAt(i);
            
             
              {
                System.out.println(book1 + " " + book2 + " " + book3 +
                        " " + book4 + " " + book5 + " " + book6 + " " + book7);
            
            
        }
    }
    }
    }
        