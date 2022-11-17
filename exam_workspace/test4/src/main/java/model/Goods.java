package model;

public class Goods {

	String goods_cd;
	String goods_nm;
	int goods_price;
	int cost;
	String in_date;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(String goods_cd, String goods_nm, int goods_price, int cost, String in_date) {
		super();
		this.goods_cd = goods_cd;
		this.goods_nm = goods_nm;
		this.goods_price = goods_price;
		this.cost = cost;
		this.in_date = in_date;
	}

	public String getGoods_cd() {
		return goods_cd;
	}

	public String getGoods_nm() {
		return goods_nm;
	}

	public int getGoods_price() {
		return goods_price;
	}

	public int getCost() {
		return cost;
	}

	public String getIn_date() {
		return in_date;
	}

	@Override
	public String toString() {
		return "Goods [goods_cd=" + goods_cd + ", goods_nm=" + goods_nm + ", goods_price=" + goods_price + ", cost="
				+ cost + ", in_date=" + in_date + "]";
	}
	
	
}
