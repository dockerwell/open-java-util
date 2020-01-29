package org.dockerwell.util.strings;

/**
 * <h1> DStringUtil </h1>
 * class DStringUtil implements an application that simply help for string
 * manipulation.
 *
 * @author Vinod Sharma
 * @version 1.0
 * @since 2020-02-02
 */

public class DStringUtil {

	 /**
	   * compare method takes two string parameter as input.
	   * @param l String.
	   * @param r String.
	   * @return boolean.
	   * @apiNote compare method is safe for NullPointerException
	   * 
	   * <p>compare method is safe for null value check, if both input @param is null it will return true</p>
	   */
	public boolean compare(String l, String r) {
		if (l == null && r == null) {
			return true;
		} else if (l == null || r == null) {
			return false;
		} else if (l != null && r != null) {
			return l.equals(r);
		} else {
			return false;
		}
	}

	public boolean compareIgnoreCase(String l, String r) {
		if (l == null && r == null) {
			return true;
		} else if (l == null || r == null) {
			return false;
		} else if (l != null && r != null) {
			return l.equalsIgnoreCase(r);
		} else {
			return false;
		}
	}
}
