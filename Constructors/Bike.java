class Student{
    int id; 
    String name;
     Student(i, n)
     {
         id = i;
         String = n;
     }
     void display(){
         System.out.println(id + " " + name);

     }

     public static void main(String args[])
     {
         Student s1 = new Student(111, "karan");
         Student s2 = new Student(121, "Rohit");

         s1.display();
         s2.display();
     }

}