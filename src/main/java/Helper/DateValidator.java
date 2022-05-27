/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author MyPC
 */
public class DateValidator {
    static int MAX_VALID_YR = 3000;
    static int MIN_VALID_YR = 1000;

    // Returns true if
    // given year is valid.
     static boolean isLeap(int year) {
        // Return true if year is
        // a multiple of 4 and not
        // multiple of 100.
        // OR year is multiple of 400.
        return (((year % 4 == 0)
                && (year % 100 != 0))
                || (year % 400 == 0));
    }

    // Returns true if given
    // year is valid or not.
    public static boolean isValidDate(int d,
            int m,
            int y, StringBuilder sb, StringBuilder sbMsg) {
        // If year, month and day
        // are not in given range
        if (y > MAX_VALID_YR
                || y < MIN_VALID_YR) {
            sb.append("\nInput data for Year is out of range!");
            return false;
        }
        if (m < 1 || m > 12) {
            sb.append("\nInput data for Month is out of range!");
            return false;
        }
        if (d < 1 || d > 31) {
            sb.append("\nInput data for Day is out of range!");
            return false;
        }

        // Handle February month
        // with leap year
        if (m == 2) {
            if (isLeap(y)) {
                if (!(d <= 29)){
                    sbMsg.append("dd/mm/yy is NOT correct date time!");
                    return true; 
                }
            } else {
                if (!(d <= 28)){
                    sbMsg.append("dd/mm/yy is NOT correct date time!");
                    return true;
                }
            }
        }

        // Months of April, June,
        // Sept and Nov must have
        // number of days less than
        // or equal to 30.
        if (m == 4 || m == 6
                || m == 9 || m == 11) {
            if (!(d <= 30)){
                sbMsg.append("dd/mm/yy is NOT correct date time!");
                return true; 
            }
        }

        return true;
    }

}
