/**
 * FileName: UserService
 * Author:   hy
 * Date:     2019/9/28 9:21
 * Description: 用于用户数据的初始化
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.login.service;
import com.login.entity.User;
import com.login.util.Md5Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class UserService {
    private  List<User> userList;
    public List<User> init(){
        User[] user = {
               new  User(1,"202cb962ac59075b964b07152d234b70","123"),
               new  User(2,"250cf8b51c773f3f8dc8b4be867a9a02","456"),
               new  User(2,"68053af2923e00204c3ca7c6a3150cf7","789")
        };
        //将数组转换成集合
        userList = Arrays.asList(user);
        return userList;
    }

    public User Login(User Loginuser){
        init();
        String newpassword = Md5Util.crypt(Loginuser.getPassword());
        for(User user :userList){
            if(user.getAccount().equals(Loginuser.getAccount())&&user.getPassword().equals(newpassword)){
                return user;
            }
    }
        return null;
}
}
