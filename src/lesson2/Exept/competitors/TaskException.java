package lesson2.Exept.competitors;



public class TaskException {
    //1. �������� �����, �� ���� �������� ������� ��������� ��������� ������ �������� 4�4,
    // ��� ������ ������� ������� ������� ���������� ������� ���������� MyArraySizeException.
    //2. ����� ����� ������ �������� �� ���� ��������� �������, ������������� � int, � ��������������.
    // ���� � �����-�� �������� ������� �������������� �� ������� (��������, � ������ ����� ������ ��� ����� ������ �����),
    // ������ ���� ������� ���������� MyArrayDataException, � ������������ � ����� ������ ������ ����� �������� ������.
    //3. � ������ main() ������� ���������� �����, ���������� ��������� ���������� MySizeArrayException � MyArrayDataException,
    // � ������� ��������� �������.
    public static void main(String[] args) {
        Object[][] arr;
        int sum = 0;
        try {
            arr = initArray(4,4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += (int) arr[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("� ������ [" + i + "],[" + j + "] ��������� ��� �������� �� int." );
                }
            }
        System.out.println("����� ������� = " + sum);
    }

    public static Object[][] initArray(int row, int col) throws MyArraySizeException {
        if (row != 4 || col != 4) {
            throw new MyArraySizeException("������ ����� ���� �������� 4�4, ����� �����.");
        }
        return new Object[][]{{1,'2',4,3},{1,2,3,4}};
    }
}
