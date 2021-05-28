 
package LOGIN.error;

import javax.swing.JOptionPane;


public class error {
    
    public static void errorsql(){
    
    JOptionPane.showMessageDialog(null,"Sorry The Security is V2.1.1.0 which can't be Hack usign SQL INJECTION");
    
    }
    
    public static void error(){
        JOptionPane.showMessageDialog(null,"UserName Or Password is error");
                             
    }
     public static void empty(){
        JOptionPane.showMessageDialog(null,"UserName Or Password will not be emptyn please");
                             
    }
public static void del(){
         JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ??");
                                                        
    }
public static void notfound(){
          JOptionPane.showMessageDialog(null, "THis id is not found the this class \n please go back to home and set");
                                                                             
    }
public static void succeed(){
  JOptionPane.showMessageDialog(null,"Data Record is updated");

} 

    
}
