package cn.gouliao.navigation.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import cn.gouliao.navigation.common.ApiResponse;
import cn.gouliao.navigation.common.BusinessException;
import cn.gouliao.navigation.entity.NavigationAssort;
import cn.gouliao.navigation.service.NavigationAssortService;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 类说明
 * </p>
 *
 * @author Shawn
 * @since 2018/05/25
 */
@RestController
@Slf4j
public class WelcomeController {
    @Resource(name = "navigationAssortServiceImpl")
    private NavigationAssortService navigationAssortService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ApiResponse listClient(@RequestBody NavigationAssort navigationAssort) throws BusinessException {
        Integer id = navigationAssort.getId();
        NavigationAssort resultObj = navigationAssortService.selectById(id);
        return ApiResponse.successOf(resultObj);
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ApiResponse listClient() {

        return ApiResponse.successOf("Hello 呵呵");
    }
}
