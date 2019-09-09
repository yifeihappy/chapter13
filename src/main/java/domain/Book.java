package domain;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
    private String publication;
    private Date publicationdate;
    private Double price;
    private String image;
    private String remark;
}
