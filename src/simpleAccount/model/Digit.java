/*
 *  for exception handling
 */

package simpleAccount.model;

public class Digit extends Exception {
	
    /**	 */
	private static final long serialVersionUID = 1L;
	
	public Digit() {
		super();
	}
	public Digit(String s) {
		super(s);
	}

}
