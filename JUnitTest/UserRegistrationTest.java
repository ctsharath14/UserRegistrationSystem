package JUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

     /*Tests whether first name has proper format or not.
     First name should have first letter capital and
     minimum characters*/

    //Given String should return true if first character is capital and has minimum three characters.
    @Test
    public void FirstNameTest1() {
        UserRegistration user = new UserRegistration();

        String actual = user.validFirstName("Rahul");
        String expected = "Happy";
        Assert.assertEquals(actual, expected);
    }

    //Given String should return false if first character is not capital.
    @Test
    public void FirstNameTest2() {
        UserRegistration user = new UserRegistration();

        String actual = user.validFirstName("rahul");
        String expected = "Sad";
        Assert.assertEquals(actual, expected);
    }

    //Given String should return false if there are less than 3 characters
    @Test
    public void FirstNameTest3() {
        UserRegistration user = new UserRegistration();

        String result = user.validFirstName("Rh");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

     /*Tests whether last name has proper format or not.
     Last name should have first letter capital and
     minimum characters */

    //Given String should return true if first character is capital and has minimum three characters.
    @Test
    public void LastNameTest1() {
        UserRegistration user = new UserRegistration();

        String actual = user.validFirstName("Patil");
        String expected = "Happy";
        Assert.assertEquals(actual, expected);
    }

    //Given String should return false if first character is not capital.
    @Test
    public void LastNameTest2() {
        UserRegistration user = new UserRegistration();

        String result = user.validLastName("patil");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if there are less than 3 characters
    @Test
    public void LastNameTest3() {
        UserRegistration user = new UserRegistration();

        String result = user.validLastName("Pa");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

     /*Tests whether email has proper format or not
     EMail format-abc.xyz@bl.co.in where
     abc@bl.co is mandatory part and .xyz, .in are optional */

    //Given String should return false if the email doesn't have @ symbol.
    @Test
    public void EmailTest1() {

        UserRegistration user = new UserRegistration();

        String result = user.validEMail("abc.xyz.co.in");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the email has more than three TLD(Top Level Domains)
    @Test
    public void EmailTest2() {

        UserRegistration user = new UserRegistration();

        String result = user.validEMail("abc.xyz@bl.co.in.co");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the email has one character in TLD
    @Test
    public void EmailTest3() {

        UserRegistration user = new UserRegistration();

        String result = user.validEMail("abc.xyz@.co.i");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the email has two continuous dots
    @Test
    public void EmailTest4() {

        UserRegistration user = new UserRegistration();

        String result = user.validEMail("abc..xyz@co.in");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the email has three dots before @
    @Test
    public void EmailTest5() {

        UserRegistration user = new UserRegistration();

        String result = user.validEMail("alb.xyz.co@.in");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the email has numbers in TLD
    @Test
    public void EmailTest6() {

        UserRegistration user = new UserRegistration();

        String result = user.validEMail("abc.xyz@c1.in");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the email has proper format as required
    @Test
    public void EmailTest7() {

        UserRegistration user = new UserRegistration();

        String result = user.validEMail("abc.xyz@bl.co.in");
        String expected = "Happy";
        Assert.assertEquals(result, expected);
    }

     /*Tests whether mobile number has proper format or not.
     Mobile number should have space after country code
     while country code is also mandatory*/

    //Given String should return true if the mobile number has space after country code and ten digits number.
    @Test
    public void MobileNumberTest1() {

        UserRegistration user = new UserRegistration();

        String result = user.validMobileNumber("91 9967116186");
        String expected = "Happy";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the mobile number does not have space after country code.
    @Test
    public void MobileNumberTest2() {

        UserRegistration user = new UserRegistration();

        String result = user.validMobileNumber("919967116186");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the mobile number has more than ten digits.
    @Test
    public void MobileNumberTest3() {

        UserRegistration user = new UserRegistration();

        String result = user.validMobileNumber("9199671161861");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the mobile number has less than ten digits.
    @Test
    public void MobileNumberTest4() {

        UserRegistration user = new UserRegistration();

        String result = user.validMobileNumber("91996711618");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

     /*Tests whether password has proper format or not.
     Password should have at least one uppercase,one
     lowercase & one special character. Minimum character
     should be eight */

    //Given String should return false if the password does not have at least one upper case character
    @Test
    public void PasswordTest1() {

        UserRegistration user = new UserRegistration();

        String result = user.validMobileNumber("rahul@123");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the password does not have at least one special character
    @Test
    public void PasswordTest2() {

        UserRegistration user = new UserRegistration();

        String result = user.validPassWord("rahul123");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the password does not have at least one lower case character
    @Test
    public void PasswordTest3() {

        UserRegistration user = new UserRegistration();

        String result = user.validPassWord("RAHUL@123");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }

    //Given String should return false if the password does not have minimum eight characters
    @Test
    public void PasswordTest4() {

        UserRegistration user = new UserRegistration();

        String result = user.validPassWord("R@123");
        String expected = "Sad";
        Assert.assertEquals(result, expected);
    }


    //Given String should return true if the password is accepted as per required format
    @Test
    public void PasswordTest5() {

        UserRegistration user = new UserRegistration();

        String result = user.validPassWord("Abccc@123");
        String expected = "Happy";
        Assert.assertEquals(result, expected);
    }

}
