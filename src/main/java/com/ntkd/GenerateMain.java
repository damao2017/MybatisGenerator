package com.ntkd;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 *  @description 
 *	@author NTDM
 *	@date 2020年1月15日 上午8:32:31
 *
 */
public class GenerateMain {

	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   String genCfg = "/GeneratrConfig.xml";  
	       File configFile = new File(GenerateMain.class.getResource(genCfg).getFile());  
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}

}
