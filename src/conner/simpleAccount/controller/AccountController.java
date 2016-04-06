
package conner.simpleAccount.controller;

public class AccountController extends AbstractController {

    /* constructor */
    public AccountController () {
        setModel(new AccountModel());
        setView(new AccountView((AccountModel)getModel(), this));
        ((JFrameView)getView()).setVisible(true);  //setvis part of swing
    }

    /* other methods to be implemented as needed */
}

/* imports used for calc program
import calc.model.Digit5;
import calc.model.CalculatorModel;
import calc.view.CalculatorView;
import calc.view.JFrameView; */
