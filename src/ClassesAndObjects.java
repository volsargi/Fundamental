public class ClassesAndObjects {
public static void main (String [] args) {
Person person1 = new Person();
person1.name = "Kate";
person1.age = 9; // bez skobok
  person1.sayHello();
    person1.speak();

    Person person2 = new Person();
 person2.name = "Arvils";
 person2.age = 4;
 person2.sayHello();
 person2.speak();

}
}

    class Person {
        String name;
        int age;

        void speak() {
            for (int i = 0; i < 3; i++) { //ja gribam, te norādam cik reizes izvadīt speak
                System.out.println("Menja zovut " + name + ", mne " + age + " let");
            }
            }
            void sayHello(){
                System.out.println("Privet");

            }
        }







// SAPRATNEI KĀ NOTIEK PROCESS
//public class ClassesAndObjects {
//public static void main (String [] args) {
    //Person person1 = new Person();
   // person1.name = "Kate";
   // person1.age = 9; // bez skobok
   // System.out.println("Menja zovut " + person1.name + ", " + "mne " + person1.age + " let");

  //  Person person2 = new Person();
   // person2.name = "Arvils";
   // person2.age = 4;
   // System.out.println("Menja zovut " + person2.name + ", " + "mne " + person2.age + " let");
//}

//}

//class Person{
   // String name;
   // int age;
//}