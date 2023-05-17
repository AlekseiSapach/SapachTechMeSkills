public class ChessBoard {
    public static void main(String[] args)
    {
        getChessBoard();
    }
    public static void getChessBoard()
    {
        // Шахматная доска
        String[][] myArray = new String[8][8];
        for (int rows=0; rows< myArray.length;rows++)
        {
            for (int cols=0;cols< myArray[rows].length;cols++)
            {
                if (rows%2==0 & cols%2==0)
                    myArray[rows][cols]="W";
                else if (rows%2==0 & cols%2==1)
                    myArray[rows][cols]="B";
                else if(rows%2==1 & cols%2==0)
                    myArray[rows][cols]="B";
                else
                    myArray[rows][cols]="W";
            }
        }
        for (int rows=0; rows< myArray.length;rows++)
        {
            for (int cols=0;cols< myArray[rows].length;cols++)
            {
                System.out.print(myArray[rows][cols]+" ");

            }
            System.out.println();
        }


    }
}
