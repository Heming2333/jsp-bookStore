package cn.bs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.bs.model.BsAdmin;

@Controller("bsAdminAction")
@Scope("prototype")
public class BsAdminAction extends BaseAction<BsAdmin> {
	
	public String login() {
		//���е�½���ж�
		model = bsAdminService.login(model);
		if(model == null) {
			request.put("error", "�û������������");
			return "error"; 
		} else {
			//��¼�ɹ����Ƚ��û��洢��session��
			session.put("user", model);
			//����session��goURL�Ƿ���ֵ������ҳ�����ת
			//if(session.get("goURL") == null) {
			return "success"; //������ҳ
			//} else {
			//	return "goURL";
			//}
		}
	}

    public String query() {
//    	request.put("bsAdminList", bsAdminService.query()); 
    	session.put("bsAdminList", bsAdminService.query()); 
//    	application.put("bsAdminList", bsAdminService.query()); 
    	return "user_manage"; 
    } 
    
    //public String update() {  
    //    System.out.println("----update----");   
    //    bsAdminService.update(model); //�¼�һ����䣬���������ݿ� 
    //    return "index";  
    //}  
      
    //public String save() {  
    //    System.out.println("----save----");  
    //    System.out.println(model);//����ǰ�������ͬ  
    //    return "index";  
    //} 
}
