import java.util.*;
import java.io.*;

class studentsystem{
    public static void main(String args[]){
        // System.out.println("enter your choise");
        Scanner sc= new Scanner(System.in);
        //int choise=sc.nextInt();
        ArrayList<String>student=new ArrayList<>();
        while(true){
            System.out.println("\n1.Add student");
            System.out.println("\n2.view student");
            System.out.println("\n3.search student");
            System.out.println("\n4.delete student");
            System.out.println("\n5.show total number of student");
            System.out.println("\n6.Exit");
            System.out.println("enter your choise");
             
          int choise=sc.nextInt();
          sc.nextLine();
             switch(choise){
                  case 1:
                    System.out.println("enter the name");
                   String name1=sc.nextLine();
                   student.add(name1);
                   break;
                   case 2:
                    if(student.isEmpty()){
                        System.out.println("student does not exist");
                    
                    }
                    else{
                        System.out.println("the student is");
                    }
                    System.out.println(student);
                    break;
                    case 3:
                        System.out.println("enter the name to search the student");
                        String name2=sc.nextLine();
                        if(student.contains(name2)){
                            System.out.println("found");
                        }
                        else{
                            System.out.println("does not found");
                        }
                        break;
                        case 4:
                            System.out.println("delete the student");
                            String name3=sc.nextLine();
                            System.out.println(student.remove(name3));
                            break;
                            case 5:
                                System.out.println("total number of student is the"+student.size());
                                break;
                            case 6:
                                System.out.println("exit");
                                
                                return;
                                default:
                                    System.out.println("invalid choise please try again thank you");


            }

        }

    }
}