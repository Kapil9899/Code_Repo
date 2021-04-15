package com.example.exercise;

public class PostfixOperation {
	
	Integer stack[] = new Integer[20];
	int top;
	

	PostfixOperation(){
		top=-1;
	}
	
	void push(Integer value){
		top++;
		stack[top]=value;
	}
	
	int pop(){
		
		if(top==-1) {
			System.out.println("stack is emply");
		}
		return stack[top--];
	}
		
		boolean isNumber(char value){
			  return(value>='0' && value<='9');
		}
		
		
	int performOperation(Integer v1, Integer v2,char x){
		
		 switch(x)

         {

                     case '+': return v1+v2;

                     case '-': return v1-v2;

                     case '*': return v1*v2;

                     case '/': return v1/v2;
                     
                     case '%': return (v1*v2)/100;
                     case '^': return (int) (Math.pow(v1,v2));
                     

                     default : System.out.println("Invalid Operation");

                                   System.exit(1);

         }

         return 1;

	}
	
	 double eval(char b[])

     {

		 Integer v1,v2,v3,v;                 

                 for(int i=0;i<b.length;i++)

                 {

                             if(isNumber(b[i]))                                    

                             push(Integer.parseInt(String.valueOf(b[i])));

                             else

                             {

                                         v2=pop();                                           

                                         v1=pop();                                           

                                         v=performOperation(v1,v2,b[i]);                                           

                                         push(v);

                             }                                 

                 }

                  if(top!=0) { System.out.println("\nImproper expression"+(char)7); System.exit(1); }

                 return pop();

     }
}
