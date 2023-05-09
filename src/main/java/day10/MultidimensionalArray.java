package day10;

public class MultidimensionalArray {
    public static void main(String[] args)
    {
        String ar[][][]=new String[2][2][1];
        ar[0][0][0]="Akilan";
        ar[0][1][0]="Bharathan";
        ar[1][0][0]="Chandran";
        ar[1][1][0]="Danapalan";

        for(int i=0;i< ar.length;i++)
        {
            for(int j=0;j<ar[0].length;j++)
            {
                for(int k=0;k<ar[0][0].length;k++)
                {
                    System.out.println(ar[i][j][k]);
                }
            }
        }
    }
}
