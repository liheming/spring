package cn.heming.db;

public class SQLConstant {
	public final static String AddAnonymous= " INSERT INTO `anonymous` (`id`, `ip`, `content`) VALUES (?, ?, ?)  ";
	public final static String DeleteUserByiD= " DELETE FROM `admin`  WHERE  `id` = ?  ";
	public final static String UpdateUserInfo= " UPDATE  `admin`  SET  `username` = ?   `email`=?   `sex` = ?  WHERE `id`=? ";
	public final static String AddMessage= " INSERT INTO `admin` (`id`, `username`, `password`, `email`) VALUES (?, ?, ?, ?)  ";
	public final static String getUserByName= "SELECT * FROM `admin` WHERE `username` = ?";
	public final static String GetAllMessage= "SELECT * FROM `admin` ";
	// "SELECT * FROM `test_table` WHERE `id` = ?";
//	public final static String AddMessage= " INSERT INTO `test_table` (`id`, `name`) VALUES ( ?, ?)  ";
}
