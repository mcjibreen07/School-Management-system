/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIN;

import database.School_db.db_connection;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author JIBREEN
 */
public class Position {
db_connection data = new db_connection();
   public String Student_Id(String student){
         try{
         data.connect();
         PreparedStatement st = data.conn.prepareStatement("SELECT english , math ,hausa , religion ,phe,social_studies,computer_studies ,"
                 + "english + math +hausa+ religion+phe+social_studies+computer_studies"
                 + " as Totals ,Dense_rank() over(ORDER by Totals )as position from courses");
         ResultSet rss = st.executeQuery();
         
         if (rss.next()){
             out.println(rss.next());
         
         }else{
         out.println("No data to print joor");
         }
         
         }catch(Exception q){
         q.printStackTrace();
         System.out.print(q);
         }
   //
    return null;
   }
}
  
