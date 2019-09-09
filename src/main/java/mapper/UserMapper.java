package mapper;

import domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("SELECT * FROM tb_user WHERE loginname = #{loginname} and password = #{password}")
    User findWithLoginnameAndPassword(@Param("loginname") String loginname, @Param("password")String password);
}
