package com.bridgelabz.Work_Shop_AddressBook_37;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {
	private static final String PATH_TXT = "./src/main/resources/temp.txt";

	@Test
	public void givenContactsEntries_WhenWrittenToFileShouldMatchAddressEntries() {
		List<Contacts> contactsList = new ArrayList<>();
		contactsList.add(new Contacts("Nitin", "Babar", "pune", "pune", "Maharashtra", 414501l, 7522929393,
				"nitinbabar@gmail.com"));
		contactsList.add(new Contacts("Shivani", "Babar", "pune", "Pune", "Maharashtra", 41414l, 8237259393,
				"shivani@gmail.com"));
		AddressBook addressBook = new AddressBook(contactsList);
		addressBook.writeFileData(PATH_TXT);
	}

	@Test
	public void givenContactsEntries_WhenReadingTotalFileShouldMatch() {
		AddressBook service = new AddressBook();
		long entries = service.readFile(PATH_TXT);
		Assert.assertEquals(2, entries);
	}

}