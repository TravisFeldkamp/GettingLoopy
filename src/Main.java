public class Main {
    public static void main(String[] args) {

        for (int count = 0; count < 31 && count > -1; count++)
            System.out.println(count);
        for (int count = 30; count < 31 && count > -1; count--)
            System.out.println(count);
           for  (int count = 0; count < 19 && count > -1; count = count + 3 )

            System.out.println(count);
        for  (int count = 10; count <= 10  && count >= 0 ; count = count - 2 )
            System.out.println(count);



             int row = 5;
                 for (int line = 1; line <= row ; line++ ) {
                    for (int col = 1; col <= line; col++){
                    System.out.printf("*");}
                System.out.println();}




           int LINE = 1;

                  for (int rowz = 5; rowz >= LINE; rowz--) {
                    for (int col = 1; col <= rowz; col++){
                       System.out.printf("*");
                   }
                     System.out.println();

                  }




            int line = 5;

          for (int rows = 1; rows <= line ; rows++ ) {
            for (int col = 1; col <= line; col++){
                System.out.printf("*");
            }
            System.out.println();
          }






    }
}