# javaEE课程设计数据库表（宿舍管理）

标签（空格分隔）： javaEE

---

**表名：stu_info**(学生信息表）
| 列 | s_id | s_name | s_sex | s_age | s_tel | s_sid | s_cid | s_mid | s_dom|s_bed|
|----|
|说明||学生姓名|性别|年龄|联系方式|学号|班级|专业|住的宿舍|铺位


----------
**表名：building_info**（宿舍楼信息表）
| 列 | b_id | b_no | b_sex | b_intro |
|----|
|说明| | 楼号|男生楼或女生楼|宿舍楼简介|


----------
**表名：dom_info**(宿舍信息表）
| 列 | d_id | d_build | d_no | d_num | d_score | d_ good |
|----|
|说明||所属楼|宿舍号|容纳人数|卫生得分|优秀宿舍（T or F)|


----------
**表名：dom_manage_info**(宿舍管理员信息表）
| 列 | dm_id | dm_name| dm_sid | dm_tel |  d_build |
|----|
|说明||姓名|工号|联系方式|负责哪栋楼
