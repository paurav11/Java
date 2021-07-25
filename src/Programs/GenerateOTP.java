package Programs;

public class GenerateOTP {
    public static void main(String[] args) {
        // OTP can be generated randomly using random numbers in Java
        int OTP = (int)(Math.random()*(10000 - 1000) + 1000);
        System.out.println(OTP + " is your One Time Password (OTP) for mobile verification.");
    }
}
