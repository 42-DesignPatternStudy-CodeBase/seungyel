package abstractFactoryPattern;

public class MySqlDaoFactory extends DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao(); 
    }
    @Override
    public ProductDao createProductDao() {
        return new MySqlUserProductDao(); 
    }
}
