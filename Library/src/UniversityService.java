public class UniversityService {


    static Student students = new Student();



    static Library createLibrary(){
        Student student= students.createStudent();

        Library library=new Library(students.admNo,"River Between",450,1200);
        System.out.println(library);


        return library;
    }
    static Account createAccounting(){
        Student student= students.createStudent();




        Account account= new Account(student.admNo,12000,createLibrary().penaltyAmount);
        if ( account== null){
            System.out.println("Its Null");
        }else {
            System.out.println("Its not Null ");
        }
        if( createLibrary().penaltyAmount>=1000){
            System.out.println("Pay Penalty First");}
        else
            if (createLibrary().penaltyAmount<1000){
                System.out.println("Sit for exam");
            }else{
                System.out.println("Not valid input");
            }


       return account;
    }
    public static void main(String[] args) {
        System.out.println(createAccounting());


    }
}
