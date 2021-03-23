
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TenantTest {
Tenant TN = new Tenant("Anas", 5);
private Payment P1 = new Payment("March",100);
private PaymentList PL = new PaymentList(2);
	@Test 
	//Test to check getName() method
	void getNametest() {
		TN.getName();
		assertEquals("Anas", TN.getName());
	}
	
	@Test
	void getRoomTest() {
		TN.getRoom();
		assertEquals(5, TN.getRoom());
	}
	
	@Test
	void getPaymentTest() {
		TN.makePayment(P1);
		PL.add(P1);
		assertEquals("March", 100, TN.getPayments());
	}

}
