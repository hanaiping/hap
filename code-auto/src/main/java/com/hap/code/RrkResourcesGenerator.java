package com.hap.code;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RrkResourcesGenerator {
    public static void main(String[] args) {
        org.slf4j.impl.StaticLoggerBinder s;
        org.apache.velocity.context.Context c;
        String outputDir = "D:\\Temp";
        final String viewOutputDir = outputDir + "/view/";
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //配置全局ID
        gc.setIdType(IdType.ID_WORKER);
        gc.setOutputDir(outputDir);
//        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);

        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("I%sServiceImpl");
        gc.setControllerName("%sController");

        gc.setAuthor("aiPing");
        gc.setFileOverride(false);

        mpg.setGlobalConfig(gc);

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("wpx120516");
        dsc.setUrl("jdbc:mysql://42.51.1.30:3308/rrk-dev-capital?useUnicode=true&characterEncoding=utf8&useSSL=false");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategy.setSuperControllerClass("BaseController");
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        mpg.setStrategy(strategy);

        PackageConfig pc = new PackageConfig();
        pc.setParent("com.rrk.capital.center");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

     /*   pc.setEntity("entity");
        mpg.getTemplate().setEntity("/templates/entity.java.vm");*/

        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };
//        File viewDir = new File(viewOutputDir);
//        if (!viewDir.exists()) {
//            viewDir.mkdirs();
//        }
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        focList.add(new FileOutConfig("/templates/entity.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return getGeneratorViewPath(viewOutputDir, tableInfo, ".vue");
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);


        //生成controller相关
        mpg.execute();
    }

    /**
     * 获取配置文件
     *
     * @return 配置Props
     */
    private static Properties getProperties() {
        // 读取配置文件
        Resource resource = new ClassPathResource("/config/application.properties");
        Properties props = new Properties();
        try {
            props = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }

    /**
     * 页面生成的文件名2
     */
    private static String getGeneratorViewPath(String viewOutputDir, TableInfo tableInfo, String suffixPath) {
        String name = StringUtils.firstToLowerCase(tableInfo.getEntityName());
        String path = viewOutputDir + "/" + name + "/index" + suffixPath;
        File viewDir = new File(path).getParentFile();
        if (!viewDir.exists()) {
            viewDir.mkdirs();
        }
        return path;
    }
}
