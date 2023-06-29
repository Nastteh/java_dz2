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
        logger.info("����������� �������.");
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int a = in.nextInt();
        logger.info(String.format("������������ ���� ������ ����� %s", a));
        System.out.print("������� ������ �����: ");
        int b = in.nextInt();
        logger.info(String.format("������������ ���� ������ ����� %s", b));
        System.out.println("������� �������� + - / *: ");
        char operation;
        operation = in.next().charAt(0);
        logger.info(String.format("������������ ���� �������� %s", operation));
        int res;
        switch (operation) {
            case '+':
                res = a + b;
                System.out.printf("���������: %d", res);
                logger.info(String.format("������������ ������� ��������� '%s'", res));
                break;
            case '-':
                res = a - b;
                System.out.printf("���������: %d", res);
                logger.info(String.format("������������ ������� ��������� '%s'", res));
                break;
            case '/':
                res = a / b;
                System.out.printf("���������: %d", res);
                logger.info(String.format("������������ ������� ��������� '%s'", res));
                break;
            case '*':
                res = a * b;
                System.out.printf("���������: %d", res);
                logger.info(String.format("������������ ������� ��������� '%s'", res));
                break;
        }
        logger.info("��������� ���������.");
        in.close();
    }
}