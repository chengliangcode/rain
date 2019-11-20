package com.rao.client.resource;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import util.result.ResultMessage;

/**
 * 资源后台方 客户端
 * @author raojing
 * @date 2019/11/20 20:36
 */
@FeignClient(name = "rain-resource")
public interface ResourceAdminClient {

    @RequestMapping(value = "/resource/admin/local/test_local", method = RequestMethod.POST)
    ResultMessage testLocal();
    
}