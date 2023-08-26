package me.ssu.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SSR -> Jsp, thymeleaf, mustache
 *  html rendering
 */

/**
 * SPA
 *  Vue -> Vue+SSR => nuxt.js
 *      : JavaScript + <-> API(JSON) 형태로 응답처리
 *  React -> React_SSR => next.js
 */

@RestController
public class PostController {

	@GetMapping("/posts")
	public String get() {
		return "Hello World";
	}
}
