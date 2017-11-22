package chap05;

import java.util.Scanner; 

interface StackInterface { 
   int length(); 
   String pop(); 
   boolean push(String ob); 
} 

class StringStack implements StackInterface { 
   String stack[]; 
   private int top = 0; 
   public StringStack() { 
      stack = new String[5]; 
   } 
   public int length() { 
      return top + 1; 
   } 
   public String pop() { 
      return stack[--top]; 
   } 
   public boolean push(String ob) { 
      if (top == 5) return false; 
      else stack[top++] = ob; 
      return true; 
   } 
} 

class StackManager { 
   public static void main(String[] args) { 
      StringStack stack = new StringStack(); 
      Scanner sc = new Scanner(System.in); 
      for (int loop = 0; loop < 5; loop++) { 
         System.out.print("Input " + (loop+1) + " : "); 
         String inputStr = sc.next(); 
         stack.push(inputStr); 
      } 
      for (int loop = 0; loop < 5; loop++) { 
         System.out.println(stack.pop()); 
      } 
   } 
} 
