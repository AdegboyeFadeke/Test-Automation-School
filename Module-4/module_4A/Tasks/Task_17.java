package module_4A.Tasks;

public interface Task_17 {
    //You are required to build the blueprint for your company's login page.
    // From the discussions with the product team, all login pages will have a username field,
    // password field, forgot password field, and sign-in button
    // while other elements like remember me checkbox, continue to homePage,
    // OAuth button will not be applicable to all login pages.
    // with your knowledge of Abstract classes,
    // Create a class that others developers will have to inherit from

    public abstract void password();
    public abstract void username();
    public abstract void forgotPassword();
    public abstract void SignInButton();
    public static void rememberMeCheckbox(){

    }

    public static void OathButton() {

    }

    public  static void continueToHomePage(){

    }
}