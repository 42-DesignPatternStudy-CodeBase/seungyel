package strategyPatternDB.userinfo.dao;
import strategyPatternDB.userinfo.UserInfo;

public interface UserInfoDao {
	boolean insert(UserInfo userinfo);
	boolean update(UserInfo userinfo);
	boolean delete(UserInfo userinfo);
}
