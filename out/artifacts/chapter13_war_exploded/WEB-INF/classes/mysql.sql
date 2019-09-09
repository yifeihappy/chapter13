CREATE TABLE tb_user (
  id INT PRIMARY KEY AUTO_INCREMENT,
  loginname VARCHAR(50) UNIQUE,
  PASSWORD VARCHAR(18),
  username VARCHAR(18),
  phone VARCHAR(18),
  address VARCHAR(255)
);
INSERT INTO tb_user(loginname, PASSWORD, username, phone, address) VALUES ('jack', '123456', '杰克', '13920001234', '广州市天河区');
CREATE TABLE tb_book(
  id INT(11) PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(54),
  author VARCHAR(54),
  publicationdate DATE,
  publication VARCHAR(150),
  price DOUBLE,
  image VARCHAR(54),
  remark VARCHAR(600)
);
INSERT INTO tb_book(name, author, publicationdate, publication, price, image, remark) VALUES ('疯狂Java讲义（附光盘)', '李刚', '2008-11-01', '电子工业出版社', '59.2', 'ee.jpg', '本书主要介绍了Java学习遇到的典型错误');
INSERT INTO tb_book(name, author, publicationdate, publication, price, image, remark) VALUES ('轻量级Java EE 企业应用实战', '李刚', '2008-11-01', '电子工业出版社', '69.2', 'ee.jpg', '本书主要介绍了Java学习遇到的典型错误');
INSERT INTO tb_book(name, author, publicationdate, publication, price, image, remark) VALUES ('疯狂 Android 讲义（附光盘）', '李刚', '2008-11-01', '电子工业出版社', '79.2', 'ee.jpg', '本书主要介绍了Java学习遇到的典型错误');
INSERT INTO tb_book(name, author, publicationdate, publication, price, image, remark) VALUES ('疯狂Ajax讲义（附光盘)', '李刚', '2008-11-01', '电子工业出版社', '89.2', 'ee.jpg', '本书主要介绍了Java学习遇到的典型错误');
