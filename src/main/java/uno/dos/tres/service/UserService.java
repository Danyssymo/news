package uno.dos.tres.service;

import uno.dos.tres.bean.AuthInfo;
import uno.dos.tres.bean.RegInfo;
import uno.dos.tres.bean.User;

public interface UserService {

    User signIn(AuthInfo authInfo);

    User signUp(RegInfo regInfo);

}
