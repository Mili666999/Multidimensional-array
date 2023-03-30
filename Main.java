import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Pretrazivanje slobodnih mjesta u kinu.
        int[][] seats = {
                {0,0,0,1,1,1,0,0,1,1},
                {1,1,0,1,0,1,1,0,0,0},
                {1,1,1,1,1,1,1,1,1,1},
                {0,0,0,1,1,1,1,0,0,0},
                {0,1,1,1,0,0,0,1,1,1}
                };
        Scanner sc = new Scanner(System.in);
        System.out.print("Koji red? ");
        int x = sc.nextInt();
        System.out.print("Koje sjedalo? ");
        int y = sc.nextInt();

        if (seats[x][y] == 0)
            System.out.println("Sjedalo je slobodno.");
        else
            System.out.println("Sjedalo je zauzeto.");

    }
}