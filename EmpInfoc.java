import java.io.*;
class Employee {
    String name;
    int id;
    int salary ;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void get (){
        try {
            System.out.println("Enter ID:");
            id =Integer.parseInt(br.readLine());
            System.out.println("Enter Name:");
            name=br.readLine();
            System.out.println("Enter Salary:");
            salary=Integer.parseInt(br.readLine());
            
            
            
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    
    void show (){
        System.out.println("ID is  " + id);
        System.out.println("Name is " + name);
        System.out.println("Salary is  "+ salary );
        
        
    }
}
class EmpInfoc {
     public static void main (String [] args){
        Employee el = new Employee();
        el.get();
        el.show();
    }
    
}

