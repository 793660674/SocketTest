package com.tj.file;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	public static void main(String[] args) {
		File file_date = new File("C:\\Test\\test");
		//判断如果该路径存在 则不做任何操作 不存在则 创建对应的文件
		if (file_date.exists()) {
	     System.out.println("文件夹已经存在！");
	    } else { 
	//如果直接写下面的一句话，就会说：文件建立失败。因为父文件user不存在。
	     boolean file_true = file_date.mkdir();
	//但是写下面的这句话，就不会报错：文件夹建立失败。因为它会自动建立不存在的父文建夹。
	//boolean file_true = file_date.mkdirs();
	     if (file_true) {
	      System.out.println("文件夹建立成功");
	     } else {
	      System.out.println("文件建立失败");
	      return;
	     }

	    }
	}
	/**
	 * eg  C:\\test\\home
	 * 创建文件夹
	 * @param url
	 * @return
	 */
	static boolean mdirFiles(String url){
		File file=new File(url);
		//使用mkdir创建时，如果路径中有任意一层的目录是不存在的 就会创建失败
		return  file.mkdirs();
	}
	
	
	/**
	 * 创建文件 非临时的
	 * eg c://test.txt
	 * @param fileurl 文件路径
	 * @return
	 * @throws IOException 
	 */
	static boolean creatFile(String fileurl) throws IOException{
		File file=new File(fileurl);
			//在对应的路径下创建文件 而不是文件夹 这个不是临时的
			//有的时候需要在默认的临时文件目录下创建文件 则需要调用 静态方法createTempFile该方法接受前缀和后缀以生成临时文件名。
		return  file.createNewFile();
	}
	
	
	
	
	
	/**
	 * 查看文件路径是否存在
	 * eg c://test.txt
	 * @param fileurl 文件路径
	 * @return
	 */
	static boolean FileIsHava(String fileurl){
		File file=new File(fileurl);
		return file.exists();
	}
	
	
	
}
