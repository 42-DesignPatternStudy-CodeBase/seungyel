package strategyPatternDB.userinfo.dao.mysql;
import strategyPatternDB.userinfo.UserInfo;
import strategyPatternDB.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
	public boolean insert(UserInfo userinfo) {
		String message = "insert into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean update(UserInfo userinfo) {
		String message = "update into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean delete(UserInfo userinfo) {
		String message = "delete into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
}
