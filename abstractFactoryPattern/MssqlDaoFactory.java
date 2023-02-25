package abstractFactoryPattern;

public class MssqlDaoFactory extends DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMssqlDao(); 
    }
    @Override
    public ProductDao createProductDao() {
        return new MssqlUserProductDao(); 
    }
}