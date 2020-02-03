package edu.shu.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.shu.gmall.pms.entity.ProductCategory;
import edu.shu.gmall.pms.mapper.ProductCategoryMapper;
import edu.shu.gmall.pms.service.ProductCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author Lsc
 * @since 2020-02-02
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

}
