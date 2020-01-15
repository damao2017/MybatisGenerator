package com.ntkd;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class MyCommentGenerator extends DefaultCommentGenerator {

	private Properties properties;
	private Properties systemPro;
	private boolean suppressDate;
	private boolean suppressAllComments;
	private String currentDateStr;

	public MyCommentGenerator() {
		super();
		properties = new Properties();
		systemPro = System.getProperties();
		suppressDate = false;
		suppressAllComments = false;
		currentDateStr = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
	}

	//字段注释
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("/**"+"\n");
		sb.append("	* 字段注释："+introspectedColumn.getRemarks()+"\n");
		sb.append("	* 列名:" + introspectedColumn.getActualColumnName() + " 类型:" + introspectedColumn.getJdbcTypeName()
				+ "(" + introspectedColumn.getLength() + ")" + " 允许空:" + introspectedColumn.isNullable() + " 缺省值:"
				+ introspectedColumn.getDefaultValue()+"\n");
		sb.append("	*/");
		field.addJavaDocLine(sb.toString());

	}
	
	//类添加注释
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

		if (suppressAllComments) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("/**"+"\n");
		sb.append("* @description 数据表" + introspectedTable.getFullyQualifiedTableNameAtRuntime() + "映射"+"\n");
		sb.append("* @author "+ systemPro.getProperty("user.name") + "\n");
		sb.append("* @date " + currentDateStr + "\n");
		sb.append("*/");
		topLevelClass.addJavaDocLine(sb.toString());

	}
	

	//方法不用加
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

//		if (suppressAllComments) {
//			return;
//		}
//		StringBuilder sb = new StringBuilder();
//		sb.append("/**");
//		sb.append("\n");
//		sb.append("	* ");
//		sb.append("\n");
//		sb.append("	* @author "+systemPro.getProperty("user.name") + "\n");
//		if (!suppressDate) {
//
//			sb.append("	* @date " + currentDateStr + "\n");
//
//		}
//
//		List<Parameter> parameters = method.getParameters();
//
//		for (Parameter parameter : parameters) {
//
//			sb.append("	* @param " + parameter.getName() + "\n");
//
//		}
//
//		sb.append("	* @return " + method.getReturnType());
//		sb.append("\n" + "	*/");
//		method.addJavaDocLine(sb.toString());
	}

	
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

		super.addClassComment(innerClass, introspectedTable, markAsDoNotDelete);
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

	}


	//xml什么都不加
	public void addComment(XmlElement xmlElement) {
    }
	//getter()什么都不加
	public void addGetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
	}
	//setter()什么都不加
	public void addSetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
	}
	
	
	@Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        // add no file level comments by default
    }


    @Override
    public void addRootComment(XmlElement rootElement) {
        // add no document level comments by default
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
       
    }

    
    protected void addJavadocTag(JavaElement javaElement,
            boolean markAsDoNotDelete) {
    }



  
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {


    }

 

}