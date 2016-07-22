

/*+++++++++++++++++++++++++++++++++++++++++++++++++++*/
/*+++++++++++++++++++Benjamin Cooper+++++++++++++++++*/
/*++++++++++++++++++++++++-and-++++++++++++++++++++++*/
/*+++++++++++++++++++Benjamin Clark++++++++++++++++++*/
/*+++++++++++++++++++++-present-+++++++++++++++++++++*/
/*+++++++++++++++++++++++++++++++++++++++++++++++++++*/
/*+++++++++++++++++++++++++++++++++++++++++++++++++++*/
/*

    -_-/    ,                ,
   (_ /    ||          _    ||          _
  (_ --_  =||= ,._-_  < \, =||=  _-_   / \\  /'\\
    --_ )  ||   ||    /-||  ||  || \\ || || || ||
   _/  ))  ||   ||   (( ||  ||  ||/   || || || ||
  (_-_-    \\,  \\,   \/\\  \\, \\,/  \\_-| \\,/
                                       /  \
                                      '----`

/*+++++++++++++++++++++++++++++++++++++++++++++++++++*/
/*+++++++++++++++++++++++++++++++++++++++++++++++++++*/
/*+++++++++++++++++++++++++++++++++++++++++++++++++++*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class stratego
{

    public static void main(String[] args)
    {
        String[][] board = new String[10][10];
        board = setupBoard(board);

        printBoard(board);
        board = placePieces(board);
        printBoard(board);


    }


    public static void printBoard(String[][] board)
    {
        System.out.print(" -------------------------------------\n");
        for(int i=0; i<10; ++i)
            {
                System.out.print('|');
                for(int j=0; j<10; ++j)
                    {
                        System.out.print(board[j][i]);

                        if (j == 9)
                            {
                                System.out.print("|\n");
                            }
                        else{
                            System.out.print(" | ");
                        }

                    }
 System.out.print("|--+---+---+---+---+---+---+---+---+--|\n");
            }
    }


    public static String[][] placePieces(String[][] board)
    {
        Scanner scan = new Scanner(System.in);
        String foo = new String();
        int i = 0;
        int j = 0;
        String[] pieces = {
            "B","B","B","B","B","B", /*Bombs*/
            "1","2","3","3",         /*Marshal, General, Colonels*/
            "4","4","4",             /*Majors*/
            "5","5","5","5",         /*Captians*/
            "6","6","6","6",         /*Lieutenants*/
            "7","7","7","7",         /*Sergant*/
            "8","8","8","8","8",     /*Miner*/
            "9","9","9","9","9","9","9","9", /*Scouts*/
            "S", "F"};               /*Spy, Flag*/
        ArrayList<String> p1pieces = new ArrayList<String>(Arrays.asList(pieces));
        ArrayList<String> p2pieces = new ArrayList<String>(Arrays.asList(pieces));

        //Player one populates board[0][0] to board[9][3]
        while (p1pieces.size() > 0) //while pieces to place:
            { System.out.print("Please enter coordinates to place " + p1pieces.get(0));
                i = scan.nextInt();
                foo = scan.nextLine();
                j = scan.nextInt();
                foo = scan.nextLine();

                if (board[i][j] == "O")
                    {
                        board[i][j] = p1pieces.get(0);
                        p1pieces.remove(0);
                        printBoard(board);
                        //p1pieces.pop();
                    }
                else
                    {
                        System.out.print("Invalid space. Try again\n");
                    }

            }
      while (p2pieces.size() > 0) //while pieces to place:
            {
                System.out.print("Please enter coordinates to place " + p1pieces.get(0));
                i = scan.nextInt();
                foo = scan.nextLine();
                j = scan.nextInt();
                foo = scan.nextLine();

                if (board[i][j] == "T")
                    {
                        board[i][j] = p2pieces.get(0);
                        p2pieces.remove(0);
                        printBoard(board);
                        //p2pieces.pop();
                    }
                else
                    {
                        System.out.print("Invalid space. Try again\n");
                    }

        return board;
    }

    public static String[][] setupBoard(String[][] board)
    {
        //initialize all spaces:
        for(int i=0; i<10; ++i)
            {
                for(int j=0; j<10; ++j)
                    {
                        board[i][j] = " ";
                    }
            }

        //populate board with lakes:
        board[2][4] = "L";
        board[2][5] = "L";
        board[3][4] = "L";
        board[3][5] = "L";
        board[6][4] = "L";
        board[6][5] = "L";
        board[7][4] = "L";
        board[7][5] = "L";

        //designate player starting positions:
        for (int i=0; i<10; ++i)
            {
                for (int j=0; j<4; ++j)
                    {
                        board[i][j] = "O";
                    }

            }

        for (int i=0; i<10; ++i)
            {
                for (int j=6; j<10; ++j)
                    {
                        board[i][j] = "T";
                          }

            }



        return board;
    }

    public static String[][] playGame(String[][] board)
    {

        return board;
    }

}

            
