/**
 *  should be complete except for import statements
 */
package conner.simpleAccount.controller;
import simpleAccount.model.Model;  //does it need to be 'conner.simpleAccount...', or just 'simpleAccount.model...' ?
import conner.simpleAccount.view.View;

public abstract class AbstractController implements Controller {
	private View view;
	private Model model;

	public void setModel(Model model) {
        this.model = model;
    }

	public Model getModel() {
        return model;
    }

	public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
