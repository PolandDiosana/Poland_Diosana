public class FurnitureMaker {
    public static void main(String[] args) {

    for (int h = 1; h <= 6; h++){
    for (int w = 1; w <= 22; w++){
    if ((w == 1 || w == 22) || (h == 3 && w>=10 && w<=22)){
       System.out.print("X");
       }else {
         System.out.print("  ");
       }
       }
       System.out.println();
      }
      }
    }
  