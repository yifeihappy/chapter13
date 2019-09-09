package mapper;

import domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    @Select("SELECT * FROM tb_book")
    List<Book> findAll();
}
