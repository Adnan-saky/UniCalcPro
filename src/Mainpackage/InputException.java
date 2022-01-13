//An exception class to handle to user input exceptions
package Mainpackage;

public class InputException extends Exception{

    public InputException(String e) {
        ErrorWindow ob = new ErrorWindow();
        
        //Showing exception details in a pop up window
        ob.setErrorText(e);
        ob.setVisible(true);
    } 
}
