package com.cape.phonesimulator;

import java.util.List;

public interface Search {

	List<AllContact> getAllContact();

	boolean updateAllContact(String Contactname, int ContactNumber, String ContactGroup);

	boolean deleteAllContact(String Contactname, int ContactNumber, String ContactGroup);

	boolean searchAllContact(String Contactname, int ContactNumber, String ContactGroup);

	boolean callAllContact(String Contactname, int ContactNumber, String ContactGroup);

	boolean messageAllContact(String Contactname, int ContactNumber, String ContactGroup);

	boolean SearchInfo(String Contactname, int ContactNumber, String ContactGroup);

	boolean addAllContact(String Contactname, int ContactNumber, String ContactGroup);

	
	
}
