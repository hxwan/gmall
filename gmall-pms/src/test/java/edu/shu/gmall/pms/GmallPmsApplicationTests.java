package edu.shu.gmall.pms;

import edu.shu.gmall.pms.entity.Brand;
import edu.shu.gmall.pms.entity.Product;
import edu.shu.gmall.pms.service.BrandService;
import edu.shu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        Product byId = productService.getById(1);
//        System.out.println(byId.getName());
        //测试增删改在主库，查在从库
//        Brand brand = new Brand();
//        brand.setName("哈哈哈");
//        brandService.save(brand);
        Brand byId = brandService.getById(53);
        System.out.println("保存成功..."+byId.getName());

    }

}
