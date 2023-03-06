package basicConcepts;

public class Test {

    public static void main(String args[]){
        Student student1 = new Student();
        student1.setName(123);
        student1.setRollNo(456);
        Student student2 = new Student();
        student2.setName(123);
        student2.setRollNo(456);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println("== " + (student1 == student2));
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println("-----------------------");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
