import java.util.Random;

static void main() {
    Random rnd = new Random();
    int dieOne, dieTwo, dieThree, sum, roll = 0;
    IO.println("Roll\tDie1\tDie2\tDie3\tSum");
    IO.println("-----------------------------------");

    do {
        roll++;
        dieOne = rnd.nextInt(6) + 1;
        dieTwo = rnd.nextInt(6) + 1;
        dieThree =  rnd.nextInt(6) + 1;
        sum = dieOne + dieTwo + dieThree;

        System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", roll, dieOne, dieTwo, dieThree, sum);
    } while(dieOne != dieTwo || dieTwo != dieThree);
}