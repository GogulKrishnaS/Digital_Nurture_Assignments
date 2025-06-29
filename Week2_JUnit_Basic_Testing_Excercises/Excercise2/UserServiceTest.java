import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService = new UserService();

    @Test
    void testGetUserRole() {
        assertEquals("ADMIN", userService.getUserRole("admin"));
        assertEquals("USER", userService.getUserRole("john"));
        assertEquals("GUEST", userService.getUserRole(""));
        assertEquals("GUEST", userService.getUserRole(null));
    }

    @Test
    void testCalculateAge() {
        assertEquals(25, userService.calculateAge(2000));
        assertNotEquals(30, userService.calculateAge(2000));
        assertTrue(userService.calculateAge(1990) > 30);
    }

    @Test
    void testIsActiveUser() {
        assertTrue(userService.isActiveUser("alice"));
        assertFalse(userService.isActiveUser(""));
        assertFalse(userService.isActiveUser(null));
    }
}
