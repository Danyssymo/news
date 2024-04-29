package uno.dos.tres.service.impl;

import uno.dos.tres.bean.AuthInfo;
import uno.dos.tres.bean.RegInfo;
import uno.dos.tres.bean.User;
import uno.dos.tres.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User signIn(AuthInfo authInfo) {
        if ("user@mail.ru".equals(authInfo.getLogin())) {
            return new User("Dany", "admin");
        }
        return null;
    }

    @Override
    public User signUp(RegInfo regInfo) {
        if ("user@mail.ru".equals(regInfo.getEmail())) {
            return new User("Dany", "admin");
        }
        return null;
    }
}
