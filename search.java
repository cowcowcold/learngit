package lyhyalyh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;

public class search {
	
	public static void find(File f){
		if(f.exists()){//����ļ�����
			if(f.isDirectory()){//�����Ŀ¼
				File[] f1=f.listFiles();
				for(File fi:f1){
					find(fi);
				}
			}else{
				try {//�ж��Ƿ��������ֶ�
					StringBuffer get=read(f);
					if((get.indexOf("NetUnion")>=0)){
						System.out.println(f);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static StringBuffer read(File f) throws FileNotFoundException{
		StringBuffer str = new StringBuffer();
		String line=new String();
		try {
			InputStream fis = new FileInputStream(f);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
			line=reader.readLine();
			while(line!=null){
				str.append(line+"\n");
				line=reader.readLine();
			}
			reader.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	public static void main(String args[]){
		File file=new File("C:/Users/admin/Desktop/git/��Ҫѧϰ/Java��̨��һ��/dormforce");
		find(file);
        }
}

