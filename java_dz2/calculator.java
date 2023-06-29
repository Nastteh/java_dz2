import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;

public class calculator {
    
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(calculator.class.getName());
        FileHandler fh = new FileHandler("logCalc.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("калькулятор запущен.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        logger.info(String.format("пользователь ввел первое число %s", a));
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        logger.info(String.format("пользователь ввел второе число %s", b));
        System.out.println("Введите операцию + - / *: ");
        char operation;
        operation = in.next().charAt(0);
        logger.info(String.format("пользователь ввел оператор %s", operation));
        int res;
        switch (operation) {
            case '+':
                res = a + b;
                System.out.printf("Результат: %d",res);
                logger.info(String.format("пользователь получил результат '%s'", res));
                break;
            case '-':
                res = a - b;
                System.out.printf("Результат: %d",res);
                logger.info(String.format("пользователь получил результат '%s'", res));
                break;
            case '/':
                res = a / b;
                System.out.printf("Результат: %d",res);
                logger.info(String.format("пользователь получил результат '%s'", res));
                break;
            case '*':
                res = a * b;
                System.out.printf("Результат: %d",res);
                logger.info(String.format("пользователь получил результат '%s'", res));
                break;
        }
        logger.info("программа завершена.");
        in.close();
    }
}