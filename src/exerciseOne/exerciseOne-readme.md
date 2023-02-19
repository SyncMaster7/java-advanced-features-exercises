# Classes and interfaces - exercises

### Task 1

Create the `UserValidator`  class which with the `validateEmails`  method will be
responsible for validating user data such as: _email_, _alternative email_. Within the
scope of the `validateEmails`  method, please create the local `Email`  class
which will be responsible for formatting the provided email.

Validation should cover the following scenarios:

- [ ] if the given email address is _empty_ or it _is null_, set the value to **unknown**
- [ ] if the given email address does not meet the email criteria, set the value to
**unknown**  (use regular expressions)