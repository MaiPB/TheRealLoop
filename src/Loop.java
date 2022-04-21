public class Loop {
    public static void main(String[] args) {
        sayShowMainMenu();
    }
    public static final int HEIGHT = 25;
    public static final int WEIGHT = 80;

    public static void DrawlineWithoutCornor(){
    for (int i = 0;i<WEIGHT;i++){
        System.out.print("-");
    }
        System.out.println();
    }
    public static void DrawLineWithCornor(){
        System.out.print("|");
        for (int i = 0;i<WEIGHT-2;i++){
            System.out.print("-");
        }
        System.out.println("|");
    }

        public static void sayShowMainMenu () {
        DrawlineWithoutCornor();
        System.out.println("| Welcome to Stamford LCD Library Demo                                         |");
        System.out.println("|                                                                              |");
        System.out.println("| Select a Function (1-3)                                                      |");
        DrawLineWithCornor();
        System.out.println("|                                                                              |");
        System.out.println("| 1. Login                                                                     |");
        System.out.println("| 2. Restart                                                                   |");
        System.out.println("| 3. Shutdown                                                                  |");
        DrawlineWithoutCornor();
    }
    }



