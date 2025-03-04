package com.myself01.string.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/16 14:01
 */
public class UserViewTest {
    public static void main(String[] args) {
        UserView userView = new UserView();
        userView.addUser(new User("啊啊哥","看屁股！"));
        userView.addUser(new User("pig","不喝饮料了"));
        userView.addUser(new User("zzx","我没演你"));
        userView.logIn();


    }
}
