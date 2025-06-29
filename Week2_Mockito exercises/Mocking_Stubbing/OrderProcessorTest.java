import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderProcessorTest {

    @Test
    void testPlaceOrderSuccess() {
        PaymentService mockPaymentService = mock(PaymentService.class);
        when(mockPaymentService.processPayment("user123", 100.0)).thenReturn(true);

        OrderProcessor processor = new OrderProcessor(mockPaymentService);

        String result = processor.placeOrder("user123", 100.0);

        assertEquals("ORDER_SUCCESS", result);
        verify(mockPaymentService, times(1)).processPayment("user123", 100.0);
    }

    @Test
    void testPlaceOrderFailure() {
        PaymentService mockPaymentService = mock(PaymentService.class);
        when(mockPaymentService.processPayment("user123", 100.0)).thenReturn(false);

        OrderProcessor processor = new OrderProcessor(mockPaymentService);

        String result = processor.placeOrder("user123", 100.0);

        assertEquals("ORDER_FAILED", result);
        verify(mockPaymentService, times(1)).processPayment("user123", 100.0);
    }
}
