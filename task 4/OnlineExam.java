import java.util.Scanner;

public class OnlineExam {
    public static void main(String[] args) {
        int ch = 4;
        int choice;
        String name;

        boolean flag = false;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Please Enter Your name : ");
        name = sc.nextLine();
        System.out.print("Please Enter Your Roll no : ");
        int id = sc.nextInt();
        int count = 0;
        System.out.println();
        System.out.println("*******************************************************************");
        System.out.println("\tWelcome "+name.toUpperCase()+" to Online Examination");
        System.out.println("*******************************************************************");
        System.out.println();
   
        do{
        	System.out.println("Select any one option from below : ");
        	System.out.println("\tPress 1 to Take Exam ");
        	System.out.println("\tPress 2 for Exit ");
            System.out.print("Please Enter your choice : ");
            ch=sc.nextInt();
            
            if(ch == 2){
            	System.out.println("\n\nThank you for taking Exam. Please Visit Again...");
            	System.out.println("\nExiting......................................... ");
            	break;
            }
            
            switch(ch){
            	case 1:{
            		flag = true;
            		System.out.println();
            		System.out.println("Select programming language of your preference:");
            		System.out.println("1.C \n2.Java \n3.C++");
            		System.out.print("Enter your choice:");
            		int sub=sc.nextInt();
            		System.out.println("Please read the following instructions carefully:");
             
            		System.out.println();
            		System.out.println("1.The examination will comprise of Objective type Multiple Choice Questions (MCQs). \n2.Each question consist of 4 option you have to choose correct answer.");
            		System.out.println("3.Each question carreis 2 marks \n4.There will be NO NEGATIVE MARKING for the wrong answers. \n5.The Subjects or topics covered in the exam will be as per the Syllabus. ");
            		System.out.println();

					
            		
            		if(sub==1){
                    	count=0;
                    	
                    	System.out.println();
                    	System.out.println("Ques1. C is developed by:");
                    	System.out.println("\t1.Bjarne Strousrup\n\t2.Dennis Ritchie\n\t3.Steve Jobs\n\t4.Ken Thompson");
                    	System.out.print("Enter answer: ");
                    	choice=sc.nextInt();
                    	if(choice==2)
                    		++count;
                
                    	System.out.println();
                    	System.out.println("Ques2. C is:");
                    	System.out.println("\t1.High Level\n\t2.Low Level\n\t3.Middle Level\n\t4.Machine Level");
                    	System.out.print("Enter answer: ");
                    	choice=sc.nextInt();
                    	if(choice==3)
                    		++count;
                
                    	System.out.println();
                    	System.out.println("Ques3. C is:");
                    	System.out.println("\t1.Platform Dependent\n\t2.Platform Indepenedent\n\t3.None\n\t4.All of the above");
                    	System.out.print("Enter answer: ");
                    	choice=sc.nextInt();
                    	if(choice==1)
                    		++count;
                
                    	System.out.println();
                    	System.out.println("Ques4. C is:");
                    	System.out.println("\t1.Object Oriented\n\t2.Procedure Oriented\n\t3.Strictly Object Orieneted\n\t4.None");
                    	System.out.print("Enter answer: ");
                    	choice=sc.nextInt();
                    	if(choice==2)
                    		++count;
                
                    	System.out.println();
                    	System.out.println("Ques5. C is:");
                    	System.out.println("\t1.Compiled Language\n\t2.Interpreted Language\n\t3.Both Compiled and Interpreted\n\t4.None");
                    	System.out.print("Enter answer: ");
                    	choice=sc.nextInt();   
                    	if(choice==1)
                    		++count;
                    	System.out.println();
                        if(flag) {
            			System.out.println();
                		System.out.println("Congrats  "+name.toUpperCase()+"  You scored "+count*2+" marks "+"out of 10");
                		System.out.println();
            		}
            		else {
            			System.out.println();
            			System.out.println("You haven't attempted the test...");
            			System.out.println();
            		}
            		
                
            		}


					else if(sub==2){
            			count=0;
            			System.out.println();
            			System.out.println("Ques1. Java is developed by:");
                
            			System.out.println("\t1.James Gosling \n\t2.Dennis Ritchie\n\t3.Steve Jobs\n\t4.Ken Thompson");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==1)
            				++count;
            			
            			System.out.println();
            			System.out.println("Ques2. Java is:");
            			System.out.println("\t1.High Level\n\t2.Low Level\n\t3.Middle Level\n\t4.Machine Level");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==1)
            				++count;
            			
            			System.out.println();
            			System.out.println("Ques3. Java is:");
            			System.out.println("\t1.Platform Dependent\n\t2.Platform Indepenedent\n\t3.None\n\t4.All of the above");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==2)
            				++count;
            			
            			System.out.println();
            			System.out.println("Ques4. Technical Name of Core Java is knon as:");
            			System.out.println("\t1.JSE\n\t2.JEE\n\t3.J2SE\n\t4.J2EE");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==1)
            				++count;
                
            			System.out.println();
            			System.out.println("Ques5. Java is:");
            			System.out.println("\t1.Compiled Language\n\t2.Interpreted Language\n\t3.Both Compiled and Interpreted\n\t4.None");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==3)
            				++count;
            			System.out.println();
                        if(flag) {
            			System.out.println();
                		System.out.println("Congrats  "+name.toUpperCase()+"  You scored "+count*2+" marks "+"out of 10");
                		System.out.println();
            		}
            		else {
            			System.out.println();
            			System.out.println("You haven't attempted the test...");
            			System.out.println();
            		}
            		
                
            		}

            		else{
            			count=0;
            			System.out.println();
            			System.out.println("Ques1. C++ is developed by:");
            			System.out.println("\t1.Bjarne Strousrup\n\t2.Dennis Ritchie\n\t3.Steve Jobs\n\t4.Ken Thompson");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==1)
            				++count;
                
            			System.out.println();
            			System.out.println("Ques2 C++ is:");
            			System.out.println("\t1.High Level\n\t2.Low Level\n\t3.Middle Level\n\t4.Machine Level");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==3)
            				++count;
                
            			System.out.println("Ques3. C++ is:");
            			System.out.println("\t1.Platform Dependent\n\t2.Platform Indepenedent\n\t3.None\n\t4.All of the above");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==1)
            				++count;
                
            			System.out.println("Ques4. C++ is:");
            			System.out.println("\t1.Object Oriented\n\t2.Procedure Oriented\n\t3.Strictly Object Orieneted\n\t4.None");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();
            			if(choice==1)
            				++count;
                
            			System.out.println("Ques5. C++ is:");
            			System.out.println("\t1.Compiled Language\n\t2.Interpreted Language\n\t3.Both Compiled and Interpreted\n\t4.None");
            			System.out.print("Enter answer: ");
            			choice=sc.nextInt();   
            			if(choice==1)
            				++count;
            			System.out.println();
                        if(flag) {
            			System.out.println();
                		System.out.println("Congrats  "+name.toUpperCase()+"  You scored "+count*2+" marks "+"out of 10");
                		System.out.println();
            		}
            		else {
            			System.out.println();
            			System.out.println("You haven't attempted the test...");
            			System.out.println();
            		}
					
            		}
                
            		break;
            	}
				default: {
					System.out.println("Invalid choice.");
				  }     
            }  
        }
        
        while(true);
    }
}