package com.ccarlos.collector.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

/**
 * @description: 首页控制器
 * @author: ccarlos
 * @date: 2020/7/4 20:23
 */
@Slf4j
@RestController
public class IndexController {


    /**
     * [%d{yyyy-MM-dd'T'HH:mm:ss.SSSZZ}]
     * [%level{length=5}]
     * [%thread-%tid]
     * [%logger]
     * [%X{hostName}]
     * [%X{ip}]
     * [%X{applicationName}]
     * [%F,%L,%C,%M]
     * [%m] ## '%ex'%n
     * -----------------------------------------------
     * [2019-09-18T14:42:51.451+08:00]
     * [INFO]
     * [main-1]
     * [org.springframework.boot.web.embedded.tomcat.TomcatWebServer]
     * []
     * []
     * []
     * [TomcatWebServer.java,90,org.springframework.boot.web.embedded.tomcat.TomcatWebServer,initialize]
     * [Tomcat initialized with port(s): 8001 (http)] ## ''
     * <p>
     * ["message",
     * "\[%{NOTSPACE:currentDateTime}\]
     * \[%{NOTSPACE:level}\]
     * \[%{NOTSPACE:thread-id}\]
     * \[%{NOTSPACE:class}\]
     * \[%{DATA:hostName}\]
     * \[%{DATA:ip}\]
     * \[%{DATA:applicationName}\]
     * \[%{DATA:location}\]
     * \[%{DATA:messageInfo}\]
     * ## (\'\'|%{QUOTEDSTRING:throwable})"]
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {

        log.info("我是一条info日志");

        log.warn("我是一条warn日志");

        log.error("我是一条error日志");

        return "idx";
    }

}