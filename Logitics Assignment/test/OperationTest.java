package Demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class OperationTest {
	Operation op=new Operation();
	@Test
	void testAdd() {
		op.add(3);
	}

	@Test
	void testShow() {
		op.show();
	}

	@Test
	void testDeliverytime() {
		op.deliverytime(LocalDateTime.of(2023, 8, 25, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 8, 26, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 8, 27, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 8, 14, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 8, 14, 10, 00));
		op.deliverytime(LocalDateTime.of(2022, 12, 31, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 1, 1, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 1, 25, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 1, 26, 20, 00));
		op.deliverytime(LocalDateTime.of(2023, 2, 25, 20, 00));
		op.deliverytime(LocalDateTime.of(2020, 2, 28, 20, 00));
		op.deliverytime(LocalDateTime.of(2020, 3, 28, 20, 00));
		//assertEquals(LocalDateTime.of(2023, 8, 28, 4, 0).getDayOfMonth(), op.deliverytime(LocalDateTime.of(2023, 8, 25, 20, 00)).getDayOfMonth());
		//assertEquals(LocalDateTime.of(2023, 8, 28, 4, 0).getDayOfMonth(), op.deliverytime(LocalDateTime.of(2023, 8, 25, 20, 00)).getDayOfMonth());
		
	}

}
