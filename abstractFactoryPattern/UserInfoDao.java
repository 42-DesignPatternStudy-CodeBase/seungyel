package abstractFactoryPattern;

public interface UserInfoDao {
	boolean insertUserInfo(UserInfo userinfo);
	boolean updateUserInfo(UserInfo userinfo);
	boolean deleteUserInfo(UserInfo userinfo);
}