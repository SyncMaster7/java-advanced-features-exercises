package exerciseOne;

public class UserValidator {

    public String validateEmails(String eMail) {
        return null;
    }

    // https://www.abstractapi.com/guides/java-email-validation
    // Open Web Application Security Project®, OWASP
    private static final String REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    static class Email {
        private String eMail;
        private final String altEmail;

        Email(String altEmail) {
            this.altEmail = altEmail;
        }

        public String[] Email(final String eMail) {

            if (eMail == null || eMail.isEmpty()) {
                this.eMail = "unknown";
            } else {
                this.eMail = eMail;
            }

            Email givenEmail = new Email(eMail);
            return new String[]{givenEmail.eMail};
        }

    }
}