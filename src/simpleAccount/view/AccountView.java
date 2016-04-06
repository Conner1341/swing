package simpleAccount.view;

public class AccountView extends JFrameView {

    /* constructor - each button has a listener (button pressed or not) */
    public AccountView (AccountModel model, AccountController controller) {
        super(model, controller);
        //TODO - complete the constructor
    }

    // Now implement the necessary event handling code
	// public void modelChanged(ModelEvent event) {
	// 	String msg = event.getAmount() + "";
	// 	textField.setText(msg);  //swing
    //
	// }

	// Inner classes for Event Handling - MUST implement ActionListener
	// class Handler implements ActionListener {
	// 	// Event handling is handled locally
	// 	public void actionPerformed(ActionEvent e) {
	// 		//capture input and send it to the controller & which operation of the controller it should invoke
	// 		((AccountController) getController()).operation(e.getActionCommand());
	// 	}
	// }

	public static void main(String[] args) {
		new AccountController();
	}
}
