package lab7;

public class Employee {
    private String name;
    private String id;
    private String position;
    private double salary;
    private String email;
     public Employee(){}
     public Employee(String name,String id,String position,double salary,String email){
         this.name =name;
         this.id = id;
         this.position = position;
         this.salary = salary;
         this.email = email;

     }
     public String getName(){
         return this.name;
     }
     public void setName(String name){
         this.name = name;
     }
     public String getId(){
         return this.id;
     }
     public void setId(String id){
         this.id = id;
     }
     public String getPosition(){
         return  this.position;
     }
     public void setPosition(String position){
         this.position = position;
     }
     public double getSalary(){
         return this.salary;
     }
     public void setSalary(double salary){
         this.salary = salary;
     }
     public String getEmail(){
         return this.email;
     }
     public void setEmail(String email){
         this.email = email;
     }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}//class
