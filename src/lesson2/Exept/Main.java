package lesson2.Exept;

public class Main {

    public static void main(String[] args) {
// �������� �������
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            try {
                int result = StringToIntClass.StringToInt(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("������ ������� ��������!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("������������ �������� �������!");
            System.out.println("������ � ������: " + e.i + "x" + e.j);
        }

    }




}
