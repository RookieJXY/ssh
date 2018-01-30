package cn.jxy.ssh.action;

import cn.jxy.ssh.domain.Product;
import cn.jxy.ssh.service.ProductService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理Action的类
 * @author Administrator
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//模型驱动使用的类
	private Product product = new Product();
	
	@Override
	public Product getModel() {
		return product;
	}
	
	//Struts和Spring整合过程中按名称自动注入的业务层的类
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	/**
	 * 保存商品的执行的方法：save
	 */
	public String save(){
		System.out.println("Action中的save方法执行了。。。");
		productService.save(product);
		return NONE;
	}
	
}
