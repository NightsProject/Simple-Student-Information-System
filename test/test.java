import java.util.Arrays;
import java.util.Comparator;

class test {
    String idNum;

    public test(String idNum) {
        this.idNum = idNum;
    }

    public String getIdNum() {
        return idNum;
    }

    @Override
    public String toString() {
        return "MyObject{idNum='" + idNum + "'}";
    }



    public static void main(String[] args) {
        test[] array = {
            new test("2023-2222"),
            new test("2022-1111"),
            new test("2023-1111"),
            new test("2022-2222"),
            new test("2023-3333")
        };

        int startIndex = 0;
        int endIndex = 4; // Exclusive

        // Sort the subarray based on idNum (numerically in ascending order)
        Arrays.sort(array, startIndex, endIndex, Comparator.comparing((test obj) -> {
            String[] parts = obj.getIdNum().split("-");
            int year = Integer.parseInt(parts[0]);
            int uniqueId = Integer.parseInt(parts[1]);
            return new int[]{year, uniqueId};
        }, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]); // Compare year
            return Integer.compare(a[1], b[1]); // Compare unique ID
        }));

        // Print the sorted array
        for (test obj : array) {
            System.out.println(obj);
        }
    }
}