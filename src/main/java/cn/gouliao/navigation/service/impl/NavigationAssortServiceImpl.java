package cn.gouliao.navigation.service.impl;

import cn.gouliao.navigation.entity.NavigationAssort;
import cn.gouliao.navigation.mapper.NavigationAssortMapper;
import cn.gouliao.navigation.service.NavigationAssortService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 导航分类
 服务实现类
 * </p>
 *
 * @author Shawn
 * @since 2018-05-25
 */
@Service(value = "navigationAssortServiceImpl")
public class NavigationAssortServiceImpl extends ServiceImpl<NavigationAssortMapper, NavigationAssort> implements NavigationAssortService {
	
}
