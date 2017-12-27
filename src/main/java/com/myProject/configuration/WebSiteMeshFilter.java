/*package com.myProject.configuration;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {
	*//** 需要装饰的访问路径 *//*
	@Value("${sitemesh.contentPath}")
	private String contentPath;

	*//** 装饰器页面路径 *//*
	@Value("${sitemesh.decoratorPath}")
	private String decoratorPath;

	*//** 不需要装饰的访问路径,多个之间用英文逗号分隔 *//*
	@Value("${sitemesh.excludedPaths}")
	private String excludedPaths;

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		// 程序写死
		//builder.addDecoratorPath("/my/*", "/decorators/default.jsp").addExcludedPath("/js/*")
		//		.addExcludedPath("/plugin/*").addExcludedPath("/css/*");

		// 通过配置文件
		builder.addDecoratorPath(contentPath, decoratorPath);
		if (excludedPaths == null) {
			return;
		}
		String[] paths = excludedPaths.split(",");
		for (String path : paths) {
			builder.addExcludedPath(path);
		}
	}
}
*/