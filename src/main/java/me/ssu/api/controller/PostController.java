package me.ssu.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SSR(Server-Side Rendering)
 *  -> Jsp, thymeleaf, mustache
 *  보통 웹 페이지 만들 때 많이 사용함.
 *  html rendering
 *
 *  : 웹페이지의 HTML이 서버에서 생성해 완성한 형태로 클라이언트에게 전송 가능하다.
 *  : 초기 로드 시간을 줄이고 SEO(검색 엔진 최적화)에 유리하다.
 */

/**
 * SPA(Single Page Application)
 *  Vue -> Vue + SSR => nuxt.js
 *      : JavaScript + <-> API(JSON) 형태로 응답처리
 *  React -> React_SSR => next.js
 *
 *  : SPA는 '단일 페이지 애플리케이션이다. 전체 페이지를 새로고침하지 않고,
 *  사용자와 상호작용할 수 있는 웹 애플리케이션을 구축할 수 있다.
 *  페이지 또는 페이지의 일부를 동적으로 업데이트해 사용자에게 더 나은 사용자 경험을 제공한다.
 */
@RestController
public class PostController {

	@GetMapping("/posts")
	public String get() {
		return "Hello World";
	}
}
