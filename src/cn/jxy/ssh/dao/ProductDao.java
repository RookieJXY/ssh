package cn.jxy.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jxy.ssh.domain.Product;

/**
 * 商品管理的DAO的类
 * @author Administrator
 *
 */
public class ProductDao extends HibernateDaoSupport{
	/**
	 * DAO中的保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("DAO中的save的方法执行了。。。");
		this.getHibernateTemplate().save(product);
	}

}
