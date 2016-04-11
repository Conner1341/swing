
package simpleAccount.view;

//import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import simpleAccount.controller.AccountController;
import simpleAccount.model.AccountModel;
import simpleAccount.model.ModelEvent;

public class AccountView extends JFrameView {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* constructor - each button has a listener (button pressed or not) */
    public AccountView (AccountModel model, AccountController controller) {
        super(model, controller);
        //TODO - complete the constructor
    }

    // Now implement the necessary event handling code
	public void modelChanged(ModelEvent event) {
		//TODO
	// 	String msg = event.getAmount() + "";
	// 	textField.setText(msg);  //swing
    //
	 }

	// Inner classes for Event Handling - MUST implement ActionListener
	class Handler implements ActionListener {
	// 	// Event handling is handled locally
	 	public void actionPerformed(ActionEvent e) {
	 		//TODO
	// 		//capture input and send it to the controller & which operation of the controller it should invoke
	// 		((AccountController) getController()).operation(e.getActionCommand());
	 	}
	}

	public static void main(String[] args) {
		new AccountController();
	}
}
