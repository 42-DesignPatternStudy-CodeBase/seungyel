package abstractFactoryPattern;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
	public boolean insertUserInfo(UserInfo userinfo) {
		String message = "insert into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean updateUserInfo(UserInfo userinfo) {
		String message = "update into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean deleteUserInfo(UserInfo userinfo) {
		String message = "delete into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
}
