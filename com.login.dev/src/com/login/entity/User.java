/**
 * FileName: User
 * Author:   hy
 * Date:     2019/9/28 9:21
 * Description: 用户类，定义用户id account等属性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.login.entity;

public class User {
    private Integer id;
    private String account;
    private String password;

    public User(Integer id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
