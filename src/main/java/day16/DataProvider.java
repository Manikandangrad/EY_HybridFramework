package day16;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "DataProvider")
    public static Object[][] DataProvider() {
        Object[][] arr = new Object[3][2];
        arr[0][0] = "20000";
        arr[0][1] = "10";
        arr[1][0] = "30000";
        arr[1][1] = "20";
        arr[2][0] = "40000";
        arr[2][1] = "30";
        return arr;
    }
}
