# JavaEE课程设计数据库表（图书&&医疗管理）

标签（空格分隔）： javaEE

---

**表名：stu_info**(学生信息表）
| 列 | s_id | s_name | s_sex | s_age | s_tel | s_sid | s_cid | s_mid |
|----|
|说明||学生姓名|性别|年龄|联系方式|学号|班级|专业|


----------


**表名：book_info**（书本信息表）
| 列 | b_id | b_isbn | b_name | b_auth | b_pub | b_price | b_num | b_sum |
|----|----|----|------|------|-----|-------|-----|-----|
|说明|    |书编号|书名|书作者|出版社|价格|余量|简介|


----------
**表名：lend_info**(借还信息表）
| 列 | l_id | s_id | book_name | lend_time | return_time
|----|
|说明||学生id|书名|借书时间|还书时间


----------
**表名：book_manage_info**(图书管理员信息表）
| 列 | bm_id | bm_name | bm_tel | bm_sid
|----|
|说明||姓名|联系方式|工号


----------


**表名：med_info**(医疗信息表）
|列|m_id|s_id|m_date|m_type|m_medicine|m_price|m_sum
|---|
|说明||学生id|看病日期|生病种类|药物使用|总体花费|身体状况简介


----------
**表名：med_manage_info**(医疗管理员信息表）
|列|mm_id|mm_name|mm_tel|mm_sid
|---|
|说明||姓名|联系方式|工号
