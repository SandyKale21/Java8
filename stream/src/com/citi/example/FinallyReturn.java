package com.citi.example;

import java.util.ArrayList;
import java.util.List;

public class FinallyReturn {
   int calc() {
      try {
    	  System.out.println("try");
       int i= 10/0;
       return 10;

      } catch(Exception e) {
    	//  System.out.println("catch");

         return 20;
      } finally {
    //	  System.out.println("100");
       //return 30;
      }
   }
   
   public static void main(String[] args) {
      FinallyReturn fr = new FinallyReturn();
      System.out.println(fr.calc());
      

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(11);
		numList.add(22);
		numList.add(18);
		
		numList.stream().map(x->x.toString()).filter(x->x.startsWith("1")).forEach(System.out::println);
		numList.stream().mapToInt(x-> x.intValue()).filter(x->x/10==1).forEach(System.out::println);


   }
}


/*\   SELECT b.Emp_id, b.Emp_name,e.emp_id as managerID, e.emp_name as managerName
FROM Employee b
JOIN Employee e ON b.Emp_ID = e.emp_mgr_id ;

SELECT * FROM EMPLOYEES WHERE (EMPLOYEE_ID IN (SELECT MANAGER_ID FROM EMPLOYEES));

SELECT 
    fruit_name,
    color,
    COUNT(*)
FROM 
    fruits
GROUP BY 
    fruit_name,
    color
HAVING COUNT(*) > 1; 
Code language: SQL (Structured Query Language) (sql)

*/