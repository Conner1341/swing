/*
 *  like 'update' in observer pattern
 *  should be complete
 */
package simpleAccount.model;

public interface ModelListener {
	public void modelChanged(ModelEvent event);
}
