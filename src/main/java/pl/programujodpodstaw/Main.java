package pl.programujodpodstaw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();

        System.out.println("Podaj numer telefonu do walidacji jego poprawności: ");

        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();

        if (phoneNumberValidator.validatePhoneNumber(phoneNumber)){
            System.out.println("Numer telefonu jest poprawny!");
        }else {
            System.out.println("Numer telefonu jest nie poprawny!");
        }
    }
}