/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author HOANG PHUC
 */
public class LAB3 {
    public class Hinhvuong
	{
		private String tenHinh;
		public String getTenhinh()
		{
			return tenHinh;
		}
		private int canh;
		public Hinhvuong(String tenHinh, int canh)
		{
			this.tenHinh=tenHinh;
			this.canh=canh;
		}
		public float tinhchuvi()
		{
			return (float) (this.canh*4);
		}
		public float tinhdientich(){
			return (float) (this.canh * this.canh);
		}
	}

	public class Hinhtron
	{
		private String tenHinh;
		public String getTenhinh()
		{
		return tenHinh;
		}
		private double bankinh;
		private double duongkinh;
		public double getDuongkinh()
		{
			return duongkinh;
		}
		public Hinhtron(String tenHinh,double bankinh,double duongkinh)
		{
			this.tenHinh =tenHinh;
			this.bankinh =bankinh;
			this.duongkinh =duongkinh;
		}
		public float tinhchuvi()
		{
			double PI=3.14;
			return (float) (this.bankinh * PI * 2);
		}
		public double tinhdientich()
		{
			double PI=3.14;
			return this.bankinh * this.bankinh * PI;
		}
	} 
}


    
