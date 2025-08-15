import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kieu so nguyen
        // byte 1, short 2, int 4, long 8
        // Gia tri default = 0
        int age = 28;
        long years = 1997L;
        System.out.println(age);
        System.out.println("age = " + age);

        // Kieu so thuc
        // float 4, double 8
        // Gia tri default = 0.0
        float money = 123.456f;
        double tooMoney = 123.456;

        // Kieu boolean
        // Default = false
        boolean isLoading = false;

        // Kieu char 2
        // Default: \u0000
        char c = 'T';
        System.out.println("c = " + c);

        // Kieu thoi gian
        // LocalDate, LocalTime, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(1997, 11, 17);
        System.out.println("date = " + date);

        // Kieu Enum
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        // Kieu array
        int[] numbers = {1, 2, 3, 4};
        String[] fruits = new String[]{"Cam", "Tao", "Oi"};
        String[] arrays = null;
        //....
        arrays = new String[]{"Cam", "Tao", "Oi"};

        System.out.println("numbers.length = " + numbers.length);
        // Chi so bat dau tu 0
        System.out.println("numbers[0] = " + numbers[0]);
        int lastIndex = numbers.length - 1;
        System.out.println("numbers[" + lastIndex + "] = " + numbers[lastIndex]);
    }
}