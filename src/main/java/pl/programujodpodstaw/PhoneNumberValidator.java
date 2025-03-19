package pl.programujodpodstaw;

public class PhoneNumberValidator {

    public boolean validatePhoneNumber(String phoneNumber){
        String[] splittedPhoneNumber = phoneNumber.split("[-;.: ()]");
        StringBuilder noRegexPhoneNumber = new StringBuilder();
        for (String split :splittedPhoneNumber){
            noRegexPhoneNumber.append(split);
        }
        return noRegexPhoneNumber.length() == 9;
    }
}
