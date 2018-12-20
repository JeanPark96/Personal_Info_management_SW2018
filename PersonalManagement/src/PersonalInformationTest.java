import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class PersonalInformationTest {
	
	@Test
	void phoneNumberFormatTest() {
		ContactMenu contactClass = new ContactMenu();	
		Contact contact;
		String name="Jean";
		String phone_num="01012345678";
		String email="hlpark7@naver.com";
		contact=contactClass.addContactInfo(name, phone_num, email);
		assertEquals("010-1234-5678",contact.getPhone_num());		
	}
	
	@Test
	void nameFormatTest() {
		ContactMenu contactClass = new ContactMenu();	
		Contact contactWithEnglishName;
		
		String name="jean";
		String phone_num="010-1234-5678";
		String email="hlpark7@naver.com";
		
		contactWithEnglishName=contactClass.addContactInfo(name, phone_num, email);
		
		assertEquals("Jean",contactWithEnglishName.getName());	
		
	}

	
}
