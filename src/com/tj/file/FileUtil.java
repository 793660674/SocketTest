package com.tj.file;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	public static void main(String[] args) {
		File file_date = new File("C:\\Test\\test");
		//�ж������·������ �����κβ��� �������� ������Ӧ���ļ�
		if (file_date.exists()) {
	     System.out.println("�ļ����Ѿ����ڣ�");
	    } else { 
	//���ֱ��д�����һ�仰���ͻ�˵���ļ�����ʧ�ܡ���Ϊ���ļ�user�����ڡ�
	     boolean file_true = file_date.mkdir();
	//����д�������仰���Ͳ��ᱨ���ļ��н���ʧ�ܡ���Ϊ�����Զ����������ڵĸ��Ľ��С�
	//boolean file_true = file_date.mkdirs();
	     if (file_true) {
	      System.out.println("�ļ��н����ɹ�");
	     } else {
	      System.out.println("�ļ�����ʧ��");
	      return;
	     }

	    }
	}
	/**
	 * eg  C:\\test\\home
	 * �����ļ���
	 * @param url
	 * @return
	 */
	static boolean mdirFiles(String url){
		File file=new File(url);
		//ʹ��mkdir����ʱ�����·����������һ���Ŀ¼�ǲ����ڵ� �ͻᴴ��ʧ��
		return  file.mkdirs();
	}
	
	
	/**
	 * �����ļ� ����ʱ��
	 * eg c://test.txt
	 * @param fileurl �ļ�·��
	 * @return
	 * @throws IOException 
	 */
	static boolean creatFile(String fileurl) throws IOException{
		File file=new File(fileurl);
			//�ڶ�Ӧ��·���´����ļ� �������ļ��� ���������ʱ��
			//�е�ʱ����Ҫ��Ĭ�ϵ���ʱ�ļ�Ŀ¼�´����ļ� ����Ҫ���� ��̬����createTempFile�÷�������ǰ׺�ͺ�׺��������ʱ�ļ�����
		return  file.createNewFile();
	}
	
	
	
	
	
	/**
	 * �鿴�ļ�·���Ƿ����
	 * eg c://test.txt
	 * @param fileurl �ļ�·��
	 * @return
	 */
	static boolean FileIsHava(String fileurl){
		File file=new File(fileurl);
		return file.exists();
	}
	
	
	
}
