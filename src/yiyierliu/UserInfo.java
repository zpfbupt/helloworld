package yiyierliu;


import java.util.List;

public class UserInfo {
	public int getTotalPage(List ga,int pageSize) {

       
           int  pages = ((ga.size() - 1) / pageSize + 1);
           
        
        return pages;
    }
	
public int getPagedRs(int pageSize, int pageNumber) {
    	
        
            
        int absoluteLocation = pageSize * (pageNumber - 1);

       

            //�ý����rs��λ����ҳ֮ǰ�����һ�������
      
        
        // ���ظ�ҳҪ��ʾ�Ľ��
        return absoluteLocation+1;

    }

}
