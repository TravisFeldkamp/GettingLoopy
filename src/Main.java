public class Main {
    public static void main(String[] args) {

        for (int count = 0; count < 31 && count > -1; count++)//if count is less than 31 and greater than -1 count up  by 1,starting at 0
            System.out.println(count);//output of numbers

        for (int count = 30; count < 31 && count > -1; count--)//if count is less than 31 and greater than -1 count down by 1, starting at 30
            System.out.println(count);//output of numbers

           for  (int count = 0; count < 19 && count > -1; count = count + 3 )//if count is less than 19 and greater than count up by 3, starting at 0
               System.out.println(count);//output of numbers

        for  (int count = 10; count <= 10  && count >= 0 ; count = count - 2 )//if count is less than or equal to 10 and greater than or equal to 0, count down by 2 starting at 10
            System.out.println(count);//output of numbers



             int row = 5;
                 for (int line = 1; line <= row ; line++ ) {//if line is less than or = to row, add a line all the way to 5
                    for (int col = 1; col <= line; col++){//if col is less than or = line, add  a column
                    System.out.printf("*");}//output of stars
                     System.out.println();}




           int LINE = 1;

                  for (int rowz = 5; rowz >= LINE; rowz--) {//starting at 5 take a way a star until rowz = line
                    for (int col = 1; col <= rowz; col++){//if col is less than or equal to rowz, add a col
                       System.out.printf("*");//ouput of stars
                   }
                     System.out.println();

                  }




            int line = 5;

          for (int rows = 1; rows <= line ; rows++ ) {//if row <= line add a row up to 5
            for (int col = 1; col <= line; col++){//if col <= line add a column
                System.out.printf("*");//output stars
            }
            System.out.println();
          }






    }
}