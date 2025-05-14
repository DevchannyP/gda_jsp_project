package sitemesh;

import javax.servlet.annotation.WebFilter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/*
 * 1. sitemesh 패키지 생성
 * 2. SiteMeshFilter 클래스 파일생성
 * 
 * sitemesh 기능 : 화면에 layout 페이지를 구현하여 jsp 페이지를 적용하는 프레임워크 
 * 
 * filter 기능 : servlet 이전에 먼저 실행하여 request나 response 객체를 변경할 수 있는 기능
 */
@WebFilter("/*") // url mapping /* => 모든 요청시 필터 적용
public class SiteMeshFilter extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "/layout/layout.jsp").addExcludedPath("/user/login*")
				.addExcludedPath("/user/signupform");
		builder.addDecoratorPath("/projects/*", "/layout/layout.jsp");

	}
}
