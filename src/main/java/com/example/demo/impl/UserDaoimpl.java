package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.impl.DbConnection;
import com.example.demo.User;
import com.example.demo.UserInterface;



@Component
public class UserDaoimpl implements UserInterface {

@Autowired
DbConnection db;
@Autowired
User user=null;
int row=0;
boolean c;
public int addUser(User user) {
try {
PreparedStatement ps = db.getConnection().prepareStatement("Insert into USER values(?,?,?,?,?,?,?,?,?,?,?)");
ps.setInt(1,user.getUser_Id());
ps.setString(2, user.getPassword());
ps.setString(3, user.getUsername());
ps.setString(4, user.getEmail());
ps.setString(5, user.getFirst_Name());
ps.setString(6,user.getLast_Name());
ps.setLong(7, user.getContact_Number());
ps.setString(8, user.getRole());
ps.setBoolean(9, user.getIsactive());
ps.setString(10, user.getDob());
ps.setString(11, user.getCreated_on());



row = ps.executeUpdate();
db.closeConnection();
}catch(SQLException e) {System.out.println(e);}



return row;



}



public List<User> getallUser() {
List<User> UserList=new ArrayList<>();
try {
PreparedStatement cs= db.getConnection().prepareStatement("Select * from User");
ResultSet rs= cs.executeQuery();
while(rs.next()) {
User u=new User();
int USER_ID=rs.getInt(1);
String PASSWOORD=rs.getString(2);
String USERNAME= rs.getString(3);
String EMAIL =rs.getString(4);
String FIRST_NAME= rs.getString(5);
String LAST_NAME=rs.getString(6);
Long CONTACT_NUMBER=rs.getLong(7);
String Role=rs.getString(8);
Boolean IS_ACTIVE=rs.getBoolean(9);
String DOB=rs.getString(10);
String CREATED_ON =rs.getString(11);
u.setUser_Id(USER_ID);
u.setPassword(PASSWOORD);
u.setUsername(USERNAME);
u.setEmail(EMAIL);
u.setFirst_Name(FIRST_NAME);
u.setLast_Name(LAST_NAME);
u.setContact_Number(CONTACT_NUMBER);
u.setRole(Role);
u.setIsactive(IS_ACTIVE);
u.setDob(DOB);
u.setCreated_on(CREATED_ON);
UserList.add(u);
}
}catch(SQLException e) {System.out.println(e);}
return UserList;
}

public boolean validateUser(String Username, String Password){
try {
PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("select USERNAME, PASSWORD from user where USERNAME =? and PASSWORD=?");
ps.setString(1, Username);
ps.setString(2,Password);
ResultSet rs = ps.executeQuery();
while(rs.next()) {
if(Username.equals(rs.getString(1)) && Password.equals(rs.getString(2))) {
c = true;
}
else {
c = false;
}
}
}catch(SQLException sqe) {sqe.printStackTrace();}

return c;
}

public void deleteUser(int User_ID) {
    try {
        PreparedStatement cs2 = db.getConnection().prepareStatement("delete from user where User_ID=?");
        cs2.setInt(1, User_ID);
        row=cs2.executeUpdate();
    }catch(SQLException e) {System.out.println(e);}

}



public User login(User user2) {
	// TODO Auto-generated method stub
	return null;
}


}