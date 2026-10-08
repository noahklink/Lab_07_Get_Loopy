void main() {
    // T1
    for (int i = 1; i <= 10; i++)
        IO.println(i);
    

    // T2
    for (int i = 10; i >= 0; i--)
        IO.println(i);
    

    // T3
    for (int i = 0; i <= 18; i+=3)
        IO.println(i);
    

    // T4
    for (int i = 10; i >= 0; i-=2)
        IO.println(i);
    

    // T5
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            IO.print("*");
        }
        IO.println();
    }
    

    // T6
    for (int i = 5; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            IO.print("*");
        }
        IO.println();
    }
    

    // T7
    for (int row = 1; row <= 5; row++) {
        for (int col = 1; col <= 5; col++) {
            IO.print("*");
        }
        IO.println();
    }
}