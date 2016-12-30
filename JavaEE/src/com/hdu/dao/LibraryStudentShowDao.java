package com.hdu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hdu.model.Book;
import com.hdu.model.User;
import com.hdu.util.JdbcUtils;
import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("rawtypes")
public class LibraryStudentShowDao {
	
	private String books;
	private int isbn;
	private String bookName;
	private String author;
	private String publisher;
	private int price;
	private int snum;
	private String summary;
	private String lendTime;
	private String returnTime;
	
	@SuppressWarnings("unused")
	private int pageNow = 1;	//初始页面为第1页
	@SuppressWarnings("unused")
	private int pageSize = 7;	//每页显示7条记录
	
	// 添加
	@SuppressWarnings({ "unused" })
	public void addBook(Book book) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "insert into book_info(b_isbn,b_name,b_auth,b_pub,b_price,b_num,b_sum),lend_info(lend_time,return_time) values('"
				+ isbn
				+ "','"
				+ bookName
				+ "','"
				+ author
				+"','"
				+ publisher
				+"','"
				+ price
				+"','"
				+ snum
				+"','"
				+ summary
				+"','"
				+ lendTime
				+"','"
				+ returnTime
				+ "')";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

	// 管理员获取展示列表
	@SuppressWarnings({ "unused", "unchecked" })
	public List<Book> getAllBook() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		if(books==null||books.equals("")) {
			sql = "select lend_info.lend_time,"
					+ "lend_info.return_time,"
					+ "book_info.b_isbn,"
					+ "book_info.b_name,"
					+ "book_info.b_auth,"
					+ "book_info.b_pub,"
					+ "book_info.b_price,"
					+ "book_info.b_num,"
					+ "book_info.b_sum ,"
					+ "student.name,"
					+ "student.tel,"
					+ "student.age,"
					+ "student.sex"
					+ "from book_info,lend_info,student"
					+ "where book_info.b_isbn=lend_info.b_isbn and "
					+ "student.id=lend_info.s_id";
		} else{
			sql = "select lend_info.lend_time,"
					+ "lend_info.return_time,"
					+ "book_info.b_isbn,"
					+ "book_info.b_name,"
					+ "book_info.b_auth,"
					+ "book_info.b_pub,"
					+ "book_info.b_price,"
					+ "book_info.b_num,"
					+ "book_info.b_sum ,"
					+ "student.name,"
					+ "student.tel,"
					+ "student.age,"
					+ "student.sex"
					+ "from book_info,lend_info,student"
					+ "where book_info.b_isbn=lend_info.b_isbn and "
					+ "student.id=lend_info.s_id"
					+ "and book_info.b_name like '%%"+books+"%%' ";
		}
		ResultSet rs = JdbcUtils.executeQuery(sql);
		List<Book>bookm = new ArrayList<Book>();
		try {
			while(rs.next()) {
				Book book = new Book();
				book.setIsbn(rs.getInt("book_info.b_isbn"));
				book.setBookName(rs.getString("book_info.b_name"));
				book.setAuthor(rs.getString("book_info.b_auth"));
				book.setPublisher(rs.getString("book_info.b_pub"));
				book.setPrice(rs.getFloat("book_info.b_price"));
				book.setCnum(rs.getInt("book_info.b_num"));
				book.setSummary(rs.getString("book_info.b_sum"));
				book.setLendTime(rs.getString("lend_info.lend_time"));
				book.setReturnTime(rs.getString("lend_info.return_time"));
				book.setName(rs.getString("student.name"));
				book.setTel(rs.getString("student.tel"));
				book.setAge(rs.getInt("student.age"));
				book.setSex(rs.getString("student.sex"));
				bookm.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.put("bookm", bookm);
		request.put("books", books);
		return bookm;
	}
	
	// 学生获取展示列表
	@SuppressWarnings({ "unchecked" })
	public void getBookById(User user) throws Exception {
		// Book book = null;
		// 从数据库获取数据
		@SuppressWarnings("unused")
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		
		if(books==null||books.equals("")) {
			sql = "select lend_info.lend_time,"
					+ "lend_info.return_time,"
					+ "book_info.b_isbn,"
					+ "book_info.b_name,"
					+ "book_info.b_auth,"
					+ "book_info.b_pub,"
					+ "book_info.b_price,"
					+ "book_info.b_num,"
					+ "book_info.b_sum "
					+ "from book_info,lend_info "
					+ "where book_info.b_isbn=lend_info.b_isbn and lend_info.s_id='"+user.getIdentity()+"'";
		}else {
			sql = "select lend_info.lend_time,"
					+ "lend_info.return_time,"
					+ "book_info.b_isbn,"
					+ "book_info.b_name,"
					+ "book_info.b_auth,"
					+ "book_info.b_pub,"
					+ "book_info.b_price,"
					+ "book_info.b_num,"
					+ "book_info.b_sum "
					+ "from book_info,lend_info "
					+ "where lend_info.s_id='"+user.getIdentity()+"'"
					+ "and book_info.b_name like '%%"+books+"%%' "
					+ "and book_info.b_isbn=lend_info.b_isbn ";
		}
		ResultSet rs = JdbcUtils.executeQuery(sql);
		List<Book>bookstudent = new ArrayList<Book>();
		while(rs.next()) {
			Book book = new Book();
			book.setIsbn(rs.getInt("book_info.b_isbn"));
			book.setBookName(rs.getString("book_info.b_name"));
			book.setAuthor(rs.getString("book_info.b_auth"));
			book.setPublisher(rs.getString("book_info.b_pub"));
			book.setPrice(rs.getFloat("book_info.b_price"));
			book.setCnum(rs.getInt("book_info.b_num"));
			book.setSummary(rs.getString("book_info.b_sum"));
			book.setLendTime(rs.getString("lend_info.lend_time"));
			book.setReturnTime(rs.getString("lend_info.return_time"));
			bookstudent.add(book);
		}
		request.put("bookstudent", bookstudent);
		request.put("books", books);
	}

	// 更新信息
	@SuppressWarnings({ "unused" })
	public void modifyBook(Book book) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "update lend_info set "
				+ "lend_time='"+lendTime+"'"
						+ "return_time='"+returnTime+"'"
								+ "where b_isbn='"+book.getIsbn()+"'";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

	// 删除信息
	@SuppressWarnings({ "unused" })
	public void deleteBook(Book book,User user) throws Exception {
		Map session=ActionContext.getContext().getSession();
		Map request=(Map)ActionContext.getContext().get("request");
		String sql;
		sql = "delete from book_info,lend_info where "
				+ "book_info.b_isbn='"+book.getIsbn()+"'"
						+ "and lend_info.b_isbn='"+book.getIsbn()+"'"
								+ "and lend_info.s_id='"+user.getIdentity()+"'";	
		ResultSet rs = JdbcUtils.executeQuery(sql);
	}

}
