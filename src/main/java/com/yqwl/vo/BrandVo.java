package com.yqwl.vo;

import com.yqwl.pojo.Brand;
import com.yqwl.pojo.Product;

import java.util.List;
import java.util.Objects;

public class BrandVo extends Brand {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "BrandVo{" +
                "products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BrandVo brandVo = (BrandVo) o;
        return Objects.equals(products, brandVo.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), products);
    }
}
