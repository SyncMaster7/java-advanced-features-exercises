package exerciseOne;

public class UserValidator {

    public String validateEmails() {
        return null;
    }

    // https://www.abstractapi.com/guides/java-email-validation
    // Open Web Application Security Project®, OWASP
    private static final String REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    class Email {
        private final String eMail;
        private final String altEmail;

        public Email(final String eMail, final String altEmail) {
            this.eMail = eMail;
            this.altEmail = altEmail;
        }
    }
}