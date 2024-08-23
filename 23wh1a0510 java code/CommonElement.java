import java.util.*; 
public class Main {
   public static void main(String[] args) {
      String[] array1 = {"gayatri","madhavi","rohan","ramana"};
      String[] array2 = {"gayatri","rohan","vanshika","rinky"};
      List<String> commonElements = new ArrayList<>();
      for (int i = 0; i < array1.length; i++) {
         for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j]) {
               commonElements.add(array1[i]);
               break;
            }
         }
      }
      System.out.println("Common Elements: " + commonElements);
   }
}
