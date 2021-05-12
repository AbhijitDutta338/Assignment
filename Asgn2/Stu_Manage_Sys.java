package Assgn.Asgn2;
import java.util.*;

class Student{
    private String name, gender, address;
    private int age;

    // Default constructor
    Student(){
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.address = "";
    }

    // Setter Methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // Getter methods

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public String getAddress(){
        return this.address;
    }
}

class Department{
    private String name, hod;

    // Default Constructor
    Department(){
        this.name = "";
        this.hod = "";
    }

    // Setter Methods

    public void setName(String name){
        this.name = name;
    }

    public void setHOD(String hod){
        this.hod= hod;
    }

    // Getter Methods

    public String getName(){
        return this.name;
    }

    public String getHOD(){
        return this.hod;
    }
}

class Stu_Manage_Sys{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<Student>();
        ArrayList<Department> department = new ArrayList<Department>();
        String run = "Y";

        System.out.println("---------- Student Management System ----------");

        do{
            System.out.println("\n1. Add Student\n2. List Student\n3. Remove Student\n4. Add Department\n5. List Department\n6. Remove Department\n");
            System.out.print("Enter your choice: ");
            int ch = Integer.parseInt(sc.nextLine());
            

            switch(ch){
                case 1:
                    Student stud = new Student();
            
                    System.out.print("\nEnter student name: ");
                    stud.setName(sc.nextLine());
                    System.out.print("\nEnter student age: ");
                    stud.setAge(Integer.parseInt(sc.nextLine()));
                    System.out.print("\nEnter student gender: ");
                    stud.setGender(sc.nextLine());
                    System.out.print("\nEnter student address: ");
                    stud.setAddress(sc.nextLine());
                    
                    student.add(stud);
                    System.out.println("\nStudent added successfully\n");
                    break;

                case 2:
                    for(Student st : student)
                        System.out.println(st.getName() + "\n" + st.getAge() + "\n" + st.getGender() + "\n" + st.getAddress());

                    System.out.println("Number of students = "+student.size());
                    break;

                case 3:
                    System.out.print("\nEnter student name for deletion: ");
                    String studName = sc.nextLine();
                    System.out.println();
                    boolean flag = false;

                    ArrayList<Student> temp = new ArrayList<Student>();

                    for(Student st : student){
                        if(st.getName().equalsIgnoreCase(studName)){
                            flag = true;
                            temp.add(st);
                        }
                    }

                    if(flag){
                        student.removeAll(temp);
                        System.out.println("\nStudent record deleted successfully\n");
                    }
                    else{
                        System.out.println("\nStudent name does not exist"+"\n");
                    }
                    break;

                case 4:
                    Department dept = new Department();

                    System.out.print("\nEnter department name: ");
                    dept.setName(sc.nextLine());
                    System.out.print("Enter department HOD: ");
                    dept.setHOD(sc.nextLine());
                    
                    department.add(dept);
                    System.out.println("\nDepartment added successfully\n");
                    break;

                case 5:
                    for(Department dt : department)
                        System.out.println(dt.getName() + "\n" + dt.getHOD());

                    System.out.println("Number of Departments = " + department.size());
                    break;
                
                case 6:
	                System.out.print("\nEnter the department name for deletion: ");
	                String deptName = sc.nextLine();
	                System.out.println();
	                boolean dFlag = false;

	                ArrayList<Department> dtemp = new ArrayList<Department>();

	                for(Department dt : department){
	                    if(dt.getName().equalsIgnoreCase(deptName)){
	                        dFlag = true;
	                        dtemp.add(dt);
	                    }
	                }

	                if(dFlag){
	                    department.removeAll(dtemp);
	                    System.out.println("\nDepartment removed successfully"+"\n");
	                }

	                else{
	                    System.out.println("Department name does not exist"+"\n");
	                }
	                break;

                default: 
                    System.out.println("Invalid Option :(\n");
            }
            System.out.print("Enter Y/N to continue/exit: ");
            run = sc.nextLine();

        }while(run.equalsIgnoreCase("Y"));
        sc.close();
    }
}