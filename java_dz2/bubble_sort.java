import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;
import java.util.logging.Level;

public class bubble_sort {

    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(bubble_sort.class.getName());
        FileHandler fileHandler = new FileHandler("logs.xml");
        logger.addHandler(fileHandler);
        XMLFormatter xmlFormatter = new XMLFormatter();
        fileHandler.setFormatter(xmlFormatter);
        logger.log(Level.INFO,"���������� ���������� ��������� ��������.");
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        logger.info(String.format("��������� ������������� ������ ����� ����� %s ", Arrays.toString(array)));
        System.out.println("\n �������� ������");
        print(array);
        System.out.println("\n");
        array = bublesort(array);
        System.out.println("������ ����� ���������� ���������");
        print(array);
        fileHandler.close();
    }

    public static int[] bublesort(int[] arr) throws Exception{
        Logger logger = Logger.getLogger(bubble_sort.class.getName());
        FileHandler fileHandler = new FileHandler("logs.xml");
        logger.addHandler(fileHandler);
        XMLFormatter xmlFormatter = new XMLFormatter();
        fileHandler.setFormatter(xmlFormatter);
        int count = 0;
        int temp;
        for (int i = arr.length-1; i >= 1; i--) {
            count++;
            for (int j = 0; j < i; j++) {
                count++;
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    logger.log(Level.WARNING, String.format("��������� i = %d, j = %d, array = %s ", i, j, Arrays.toString(arr)));
                }else {
                    logger.log(Level.INFO, String.format("��������� i = %d, j = %d, array = %s ", i, j, Arrays.toString(arr)));
                }
            }
        }
        logger.info(String.format("��������� ������������� ������ ����� ����� -> %s �� %d ���������.", Arrays.toString(arr), count));
        return arr;
    }

    public static void print(int[] arr){
        for (int i: arr) {
            System.out.printf("%d ", i);
        }
    }
}