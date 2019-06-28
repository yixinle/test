package caiquan;

import java.util.Scanner;

public class lx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			int dn=getRand();
			Scanner scanner =new Scanner(System.in);
			System.out.println("请输入出拳的方式0:剪子      1：包袱        2：石头");
			int wj=scanner.nextInt();
			
			if(dn==0&&wj==1||dn==1&&wj==2||dn==2&&wj==0) {
				System.out.println("玩家的出拳方式为"+wj);
			System.out.println("电脑的出拳方式为"+dn);
			System.out.println("电脑胜利");
			Scanner d=new Scanner(System.in);
			System.out.println("是否继续1继续2结束");
			int zaici=d.nextInt();
			if(zaici==1) {
				System.out.println(wj);
			}if(zaici==2) {
				break;
			}
		}
		if(dn==0&&wj==2||dn==1&&wj==0||dn==2&&wj==1) {
			System.out.println("玩家的出拳方式为"+wj);
		System.out.println("电脑的出拳方式为"+dn);
		System.out.println("玩家胜利");
		Scanner jx=new Scanner(System.in);
		System.out.println("是否继续1继续2结束");
		int zaici=jx.nextInt();
		if(zaici==1) {
			System.out.println(wj);
		}if(zaici==2) {
			break;
		}
		
	}
		if(dn==0&&wj==0||dn==1&&wj==1||dn==2&&wj==2) {
			System.out.println("玩家的出拳方式为"+wj);
		System.out.println("电脑的出拳方式为"+dn);
		System.out.println("和局");
		Scanner jx=new Scanner(System.in);
		System.out.println("是否继续1继续2结束");
		int zaici=jx.nextInt();
		if(zaici==1) {
			System.out.println(wj);
		}if(zaici==2) {
			break;
		}
		}
		
	}while(true);
}
		public static int getRand()
		{
			double d=Math.random();
			//System.out.println(d);
			int x=(int)(d*100);
			x%=3;
			return x;
		}
	}
