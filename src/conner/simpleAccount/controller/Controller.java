/*
 *  should be complete except for clarification on imports
 */

package conner.simpleAccount.controller;
import simpleAccount.model.Model;
import simpleAccount.view.View;

public interface Controller {
    void setModel(Model model);
	Model getModel();
	View getView();
	void setView(View view);

}
