package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Banoffee", "abcd");
        userList.addUser("NaTiSive", "efgh");
        userList.addUser("JaybyouWithcom", "ijkl");

        // TODO: find one of them
        User user = userList.findUserByUsername("JaybyouWithcom");

        // TODO: assert that UserList found User
        assertEquals("JaybyouWithcom", user.getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Banoffee", "abcd");
        userList.addUser("NaTiSive", "efgh");
        userList.addUser("JaybyouWithcom", "ijkl");

        // TODO: change password of one user
        boolean actual = userList.changePassword("JaybyouWithcom", "ijkl", "mnop");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Banoffee", "abcd");
        userList.addUser("NaTiSive", "efgh");
        userList.addUser("JaybyouWithcom", "ijkl");

        // TODO: call login() with correct username and password
        User user = userList.login("JaybyouWithcom", "ijkl");

        // TODO: assert that User object is found
        assertEquals("JaybyouWithcom", user.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Banoffee", "abcd");
        userList.addUser("NaTiSive", "efgh");
        userList.addUser("JaybyouWithcom", "ijkl");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("JaybyouWithcom", "wrongPassword");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}