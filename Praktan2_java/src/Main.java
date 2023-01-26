import java.util.Scanner;

enum Color {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, background color etc.
    BLACK("\033[0;30m"),    // BLACK
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    BLUE("\033[0;34m"),     // BLUE
    MAGENTA("\033[0;35m"),  // MAGENTA
    CYAN("\033[0;36m"),     // CYAN
    WHITE("\033[0;37m"),    // WHITE

    // Bold
    BLACK_BOLD("\033[1;30m"),   // BLACK
    RED_BOLD("\033[1;31m"),     // RED
    GREEN_BOLD("\033[1;32m"),   // GREEN
    YELLOW_BOLD("\033[1;33m"),  // YELLOW
    BLUE_BOLD("\033[1;34m"),    // BLUE
    MAGENTA_BOLD("\033[1;35m"), // MAGENTA
    CYAN_BOLD("\033[1;36m"),    // CYAN
    WHITE_BOLD("\033[1;37m"),   // WHITE

    // Underline
    BLACK_UNDERLINED("\033[4;30m"),     // BLACK
    RED_UNDERLINED("\033[4;31m"),       // RED
    GREEN_UNDERLINED("\033[4;32m"),     // GREEN
    YELLOW_UNDERLINED("\033[4;33m"),    // YELLOW
    BLUE_UNDERLINED("\033[4;34m"),      // BLUE
    MAGENTA_UNDERLINED("\033[4;35m"),   // MAGENTA
    CYAN_UNDERLINED("\033[4;36m"),      // CYAN
    WHITE_UNDERLINED("\033[4;37m"),     // WHITE

    // Background
    BLACK_BACKGROUND("\033[40m"),   // BLACK
    RED_BACKGROUND("\033[41m"),     // RED
    GREEN_BACKGROUND("\033[42m"),   // GREEN
    YELLOW_BACKGROUND("\033[43m"),  // YELLOW
    BLUE_BACKGROUND("\033[44m"),    // BLUE
    MAGENTA_BACKGROUND("\033[45m"), // MAGENTA
    CYAN_BACKGROUND("\033[46m"),    // CYAN
    WHITE_BACKGROUND("\033[47m"),   // WHITE

    // High Intensity
    BLACK_BRIGHT("\033[0;90m"),     // BLACK
    RED_BRIGHT("\033[0;91m"),       // RED
    GREEN_BRIGHT("\033[0;92m"),     // GREEN
    YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
    BLUE_BRIGHT("\033[0;94m"),      // BLUE
    MAGENTA_BRIGHT("\033[0;95m"),   // MAGENTA
    CYAN_BRIGHT("\033[0;96m"),      // CYAN
    WHITE_BRIGHT("\033[0;97m"),     // WHITE

    // Bold High Intensity
    BLACK_BOLD_BRIGHT("\033[1;90m"),    // BLACK
    RED_BOLD_BRIGHT("\033[1;91m"),      // RED
    GREEN_BOLD_BRIGHT("\033[1;92m"),    // GREEN
    YELLOW_BOLD_BRIGHT("\033[1;93m"),   // YELLOW
    BLUE_BOLD_BRIGHT("\033[1;94m"),     // BLUE
    MAGENTA_BOLD_BRIGHT("\033[1;95m"),  // MAGENTA
    CYAN_BOLD_BRIGHT("\033[1;96m"),     // CYAN
    WHITE_BOLD_BRIGHT("\033[1;97m"),    // WHITE

    // High Intensity backgrounds
    BLACK_BACKGROUND_BRIGHT("\033[0;100m"),     // BLACK
    RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW
    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),      // BLUE
    MAGENTA_BACKGROUND_BRIGHT("\033[0;105m"),   // MAGENTA
    CYAN_BACKGROUND_BRIGHT("\033[0;106m"),      // CYAN
    WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        String text_background = null;
        String text_color = null;
        char operation;
        char op;
        System.out.print("\nХотите настроить задний фон или цвет кода?(1 - да, 2 - нет)\n");
        op = Read.next().charAt(0);
        if (op != '2'){
            while (op != '2'){
                System.out.print("\nНастройте цвет текста и заднего фона");
                System.out.print("\nName\tColor code\tBackground Color\tBackground Color code\n\n" +
                        "1 - BLACK\t\\u001B[30m\tb - BLACK_BACKGROUND\t\\u001B[40m\n" +
                        "2 - RED\t\t\\u001B[31m\tr - RED_BACKGROUND\t\t\\u001B[41m\n" +
                        "3 - GREEN\t\\u001B[32m\tg - GREEN_BACKGROUND\t\\u001B[42m\n" +
                        "4 - YELLOW\t\\u001B[33m\ty - YELLOW_BACKGROUND\t\\u001B[43m\n" +
                        "5 - BLUE\t\\u001B[34m\tl - BLUE_BACKGROUND\t\t\\u001B[44m\n" +
                        "6 - MAGENTA\t\\u001B[35m\tp - MAGENTA_BACKGROUND\t\\u001B[45m\n 0 - сбросить цвет текста и фон по умолчанию\n q - выйти из программы");
                operation = Read.next().charAt(0);
                switch (operation) {
                    case 'q':
                        op = '2';
                        break;
                    case '0':
                        System.out.print(Color.RESET);
                        System.out.println("Black_Bold");
                        break;
                    case '1':
                        text_color = String.valueOf(Color.BLACK);
                        System.out.print(text_color);
                        System.out.println("Black_Bold");
                        break;
                    case '2':
                        text_color = String.valueOf(Color.RED_BOLD);
                        System.out.print(text_color);
                        System.out.println("Black_Bold");
                        break;
                    case '3':
                        text_color = String.valueOf(Color.GREEN_BOLD);
                        System.out.print(text_color);
                        System.out.println("Black_Bold");
                        break;
                    case '4':
                        text_color = String.valueOf(Color.YELLOW_BOLD);
                        System.out.print(text_color);
                        System.out.println("Black_Bold");
                        break;
                    case '5':
                        text_color = String.valueOf(Color.BLUE_BOLD);
                        System.out.print(text_color);
                        System.out.println("Black_Bold");
                        break;
                    case '6':
                        text_color = String.valueOf(Color.MAGENTA_BOLD);
                        System.out.print(text_color);
                        System.out.println("Black_Bold");
                        break;
                    case 'b':
                        text_background = String.valueOf(Color.BLACK_BACKGROUND);
                        System.out.print(text_background);
                        System.out.println("Black_Bold");
                        break;
                    case 'r':
                        text_background = String.valueOf(Color.RED_BACKGROUND);
                        System.out.print(text_background);
                        System.out.println("Black_Bold");
                        break;
                    case 'g':
                        text_background = String.valueOf(Color.GREEN_BACKGROUND);
                        System.out.print(text_background);
                        System.out.println("Black_Bold");
                        break;
                    case 'y':
                        text_background = String.valueOf(Color.YELLOW_BACKGROUND);
                        System.out.print(text_background);
                        System.out.println("Black_Bold");
                        break;
                    case 'l':
                        text_background = String.valueOf(Color.BLUE_BACKGROUND);
                        System.out.print(text_background);
                        System.out.println("Black_Bold");
                        break;
                    case 'p':
                        text_background = String.valueOf(Color.MAGENTA_BACKGROUND);
                        System.out.print(text_background);
                        System.out.println("Black_Bold");
                        break;
                    default:
                        break;
                }


            }

        }
        if (op == '2'){
            System.out.print(Color.RESET);
            System.out.print("\nВыберите программу (1 - For, 2 - While)\n");
            operation = Read.next().charAt(0);
            if (operation == '1'){
                try {
                    int n;
                    System.out.printf("Введите N: ");
                    n = Read.nextInt();
                    int rez = 0;
                    int i;
                    for (i = 1; i <= (2 * n - 1); i += 2) {
                        rez += i;
                        System.out.print(text_background);
                        System.out.print(text_color);
                        System.out.print(rez);
                    }
                }
                catch (Exception d){
                        System.out.print ("Ошибка");
                    }
            }
            if (operation == '2'){
                try {
                    float a;
                    System.out.printf("Введите A: ");
                    a = Read.nextFloat();
                    while (a <= 1){
                        System.out.printf("Введите A, начение которой будет больше 1");
                        a = Read.nextFloat();
                    }
                    int k = 0;
                    float temp = 0;
                    while (temp <= a) {
                        ++k;
                        temp += 1 / (float)k;
                    }
                    System.out.print(text_background);
                    System.out.print(text_color);
                    System.out.print (" K: ");
                    System.out.print (k - 1);
                    System.out.print ("  Nsum:");
                    System.out.print (temp - 1 / (float)k);

                }
                catch (Exception d){
                    System.out.print ("Ошибка");
                }
            }
        }
    }

}