package lesson2.Exept.competitors;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
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
