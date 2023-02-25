package abstractFactoryPattern;

public class UserInfoMssqlDao implements UserInfoDao {
    @Override
	public boolean insertUserInfo(UserInfo userinfo) {
		String message = "insert into MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean updateUserInfo(UserInfo userinfo) {
		String message = "update into MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean deleteUserInfo(UserInfo userinfo) {
		String message = "delete into MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
}
