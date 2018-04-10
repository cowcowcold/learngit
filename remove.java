package lyhyalyh;
public class remove{
	public static void main(String[] args) {
		String str=" Hello World      Hello Uestc  Haha  nu      ";
		char[] str1=str.toCharArray();
		int x,y;
		re test=new re();
		x=test.removebefore(str1);
		y=test.removeafter(str1);
		test.removefinal(str1, x, y);
		for(int i=0;i<y-1;i++){
			System.out.print(test.b[i]);
		}
	}
}

class re{
		char b[]=new char[100];
		int removebefore(char[] a){
			int i;
			for(i=0;a[i]==' ';i++){
			}
			return i;
		}
		int removeafter(char[] a){
			int k;
			for(k=a.length-1;a[k]==' ';k--){
			}
			return k+1;
		}
		void removefinal(char[] a,int i,int k){
			int j;
			for(j=0;i<k;i++,j++){
				b[j]=a[i];
			}
		}
	}