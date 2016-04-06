/*
 *  for exception handling
 */

package simpleAccount.model;

public class Digit extends Exception {
    public Digit() {
		super();
	}
	public Digit(String s) {
		super(s);
	}

}
