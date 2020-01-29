package org.dockerwell.util.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dockerwell.exception.EmptyListException;

/**
 * <h1>DStringUtil</h1> class DStringUtil implements an application that simply
 * help for string manipulation.
 *
 * @author Vinod Sharma
 * @version 1.0
 * @since 2020-02-02
 */

public class DStringUtil {

	/**
	 * compare method takes two string parameter as input.
	 * 
	 * @param l String.
	 * @param r String.
	 * @return boolean.
	 * @apiNote compare method is safe for NullPointerException
	 * 
	 *          <p>
	 *          compare method is safe for null value check, if both input @param is
	 *          null it will return true
	 *          </p>
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

	public List<String> toList(String str, String token) {
		List<String> list = new ArrayList<String>();
		if (str != null) {
			list.addAll(Arrays.asList(str.split(token)));
		}
		return list;
	}
	
	public String[] toArray(String str, String token) {
		if(str != null && token != null) {
			return str.split(token);
		} else {
			throw new NullPointerException();
		}
	}
	
	public List<String> toList(String[] arr) {
		return Arrays.asList(arr);
	}
	
	public String[] toArray(List<String> strList) {
		return strList.toArray(new String[strList.size()]);
	}
	
	public String listToString(List<String> list, String token) throws EmptyListException {
		String s = "";
		
		if(token == null || token.equals("")) {
			token = ",";
		}
		
		if(!list.isEmpty()) {
			for(int i = 0; i< list.size(); i++) {
				if(i < list.size()-1) {
					s  = s + list.get(i) + token ;
				}else {
					s  = s + list.get(i);
				}
			}
			return s;
		} else {
			throw new EmptyListException();
		}
	}
	
	public String arrayToString(String[] s, String token) throws EmptyListException {
		String st = "";
		
		if(token == null || token.equals("")) {
			token = ",";
		}
		
		if(s != null && s.length > 0) {
			for(int i = 0; i< s.length; i++) {
				if(i < s.length-1) {
					st  = st + s[i] + token ;
				}else {
					st  = st + s[i];
				}
			}
			return st;
		} else {
			throw new EmptyListException();
		}
	}
	
	public static void main(String[] args) {
		DStringUtil d = new DStringUtil();
		ArrayList<String> l = new ArrayList<String>();
		l.add("aa");
		l.add("ca");
		l.add("da");
		l.add("ea");
		try {
			System.out.println(d.arrayToString(d.toArray(l), "@"));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
}
