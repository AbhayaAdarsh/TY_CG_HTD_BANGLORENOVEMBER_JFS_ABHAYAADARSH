package com.capgemini.forestrymanagement.collectiondao;

import java.util.ArrayList;
import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.ProductBean;

public class ProductDaoImpl implements ProductDao {
	private List<ProductBean> productBean = new ArrayList<ProductBean>();
	private Object ProductBean;

	@Override
	public boolean addProduct(ProductBean bean) {
		for (ProductBean productBean : productBean) {
			if (productBean.getProductid() == bean.getProductid()) {
				return false;
			}
		}
		productBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteProduct(int productid) {
		ProductBean bean = null;
		for (ProductBean productBean2 : productBean) {
			if (productBean2.getProductid() == productid) {
				bean = productBean2;
			}
		}
		if (bean != null) {
			productBean.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		for (ProductBean productBean2 : productBean) {
			if (productBean2.getProductid() == bean.getProductid()) {
				productBean.contains(productBean2);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ProductDaoImpl [productBean=" + productBean + ", ProductBean=" + ProductBean + "]";
	}

}
