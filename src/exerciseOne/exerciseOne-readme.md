#Classes and interfaces - exercises

###Task 1

Create the UserValidator  class which with the validateEmails  method will be
responsible for validating user data such as: email, alternative email. Within the
scope of the validateEmails  method, please create the local Email  class
which will be responsible for formatting the provided email. Validation should
cover the following scenarios:
if the given email address is empty or it is null, set the value to unknown
if the given email address does not meet the email criteria, set the value to
unknown  (use regular expressions)