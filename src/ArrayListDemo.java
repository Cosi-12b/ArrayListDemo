import java.util.ArrayList;

public class ArrayListDemo {
  static ArrayList<String> composers = new ArrayList<String>();
  static String[] beatles = {"Lennon", "McCartney", "Harrison", "Starr"};

  public static void main(String[] args) {
    example1();
//    example2();
  }
  
  public static void example1() {
    
    System.out.println("\nAdding and removing elements from an ArrayList");

    composers.add("Beethoven");
    composers.add("Springstein");
    composers.add("Lennon");
    System.out.println(composers);
    
//    composers.add(1, "Ablanedo");
//    System.out.println(composers);
//    
//    composers.remove(2);
//    System.out.println(composers);
//    
//    composers.add(3, "Bernstein");
//    System.out.println(composers);
//    
//    System.out.println("\nUsing a for-each loop to iterate over an ArrayList");
//    for (String s: composers) {
//      System.out.printf("Element is %s%n", s.toUpperCase());
//    }
//    System.out.println("\nSorting an ArrayList");
//    composers.sort(null);
//    System.out.printf("Composers, sorted: %s%n", composers);   
  }
  
  public static void example2() {
    System.out.println("\nNotice that a for-each loop can also process an array:");
    for (String s: beatles) {
      System.out.printf("Beatle: %s%n", s);
    }    
  }

}
