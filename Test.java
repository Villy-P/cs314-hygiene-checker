// 2.1 Package Statements
package NOPACKAGES;

// 2.2 Import Statements
import java.util.*;

import sun.swing.UIAction;

public class Test {
    // 1.3.3 Limit Methods to 25 lines of code
    public static void main(String[] args) {
        // 1.3.2 Magic Numbers
        // 1.3.5 Use descriptive identifiers
        int[] a = new int[10];
        // 3.2 Spacing
        int sum = 1+1+1;
        // 3.7 Enclose all blocks with curly braces
        if (a[0] == sum)
            System.out.println("THIS IS AN ERROR");
            
        // 3.3 One statement per line
        int wrong1; int wrong2;


















    }

    // 2.3 Ordering of Class Components
    private int orderError;

    // 6.1 Casting
    class WRONG_CLASS_REGEX {}
    public int WRONG_VAR_REGEX;
    public void WRONG_METHOD_REGEX() {
        int WRONG;
    }
    public static final int WRONG_FINAL_REGEX = 0;

    public boolean anotherMethod() {
        boolean bool = true;
        
        // 10.1 Avoid the use of break and continue, especially on assignments
        for (int i = 0; i < 1; i++) {
            if (bool) {
                continue;
            } else {
                break;
            }
        }

        // 9.1 Boolean Zen
        if (bool == true) {
            return true;
        } else {
            return false;
        }
    }

    // 10.2 Do not return from void method
    public void voidMethod() {
        // 10.5 Do not use try / catch blocks to deal with avoidable logic errors.
        try {
            int i = 0;
        } catch (Exception e) {
            System.err.println("Oh No!");
        }

        return;
    }
}