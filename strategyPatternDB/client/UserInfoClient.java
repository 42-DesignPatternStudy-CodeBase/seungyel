package strategyPatternDB.client;
import strategyPatternDB.userinfo.*;
import strategyPatternDB.userinfo.dao.*;
import strategyPatternDB.userinfo.dao.mssql.*;
import strategyPatternDB.userinfo.dao.mysql.*;
import strategyPatternDB.userinfo.dao.oracle.*;
import javax.management.*;

public class UserInfoClient {
	private static UserInfoDao userInfoDao;

	private static void getDBProp() throws RuntimeErrorException {
		String dbType = "";

		switch (dbType) {
			case "MSSQL":
				UserInfoClient.userInfoDao = new UserInfoMssqlDao();
				break;
			case "MYSQL":
				UserInfoClient.userInfoDao = new UserInfoMySqlDao();
				break;
			case "ORACLE":
				UserInfoClient.userInfoDao = new UserInfoOracleDao();
				break;	
			default:
				throw new RuntimeErrorException(null);
		}
	}
    public static void main(String[] args) {
		UserInfo user1 = new UserInfo("1", "pass", "name");
		UserInfo user2 = new UserInfo("2", "pass", "seungyel");
		UserInfo user3 = new UserInfo("3", "pass", "jihokim");

		getDBProp();
		userInfoDao.insert(user1);
		userInfoDao.insert(user2);
		userInfoDao.insert(user3);
		userInfoDao.delete(user1);
	}
}