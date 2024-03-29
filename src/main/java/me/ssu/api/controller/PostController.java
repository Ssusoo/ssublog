package me.ssu.api.controller;

import lombok.extern.slf4j.Slf4j;
import me.ssu.api.dto.PostCreate;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

/**
 * HTTP Method
 *  GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT
 */

/**
 * key=value 데이터 형태와 Json 데이터
 *  1) Key=Value(@RequestParam)
 *      /v1/posts/title=xxx&content=xxx&userId=xxx&userName=xxx
 *      완전히 풀어서 보내는 형태이기에 한계가 있다.
 *
 *  2) Json Data(@RequestBody)
 */
@Slf4j // Lombok
@RestController
public class PostController {

	@PostMapping("/posts")
//	public String post(@RequestParam String title, @RequestParam String content) {
//	public String post(@RequestParam Map<String, String> params) {
	public Map<String, String> post(@Valid @RequestBody PostCreate params) {
		/**
		 * 데이터를 검증하는 이유?
		 *  1) 클라이언트 개발자가 깜박할 수 있다.
		 *  2) 클라이언트 버그로 값을 누락할 수 있다.
		 *  3) 외부에서 값을 임의로 조작해 보낼 수 있다.
		 *  4) DB에 값을 저장할 때 의도하지 않은 오류가 발생할 수 있다.
		 *  5) 서버 개발자의 편안함을 위해
		 */
//		log.info("title={}, content={}", title, content);
//		log.info("params={}", params);
		log.info("params={}", params.toString());

//		if (result.hasErrors()) {
//			var fieldErrors = result.getFieldErrors();
//			var fieldError = fieldErrors.get(0);
//			var filedName = fieldError.getField(); // title
//			var errorMessage = fieldError.getDefaultMessage(); // 에러 메시지
//
//			Map<String, String> error = new HashMap<>();
//			error.put(filedName, errorMessage);
//
//			return error;
//		}
		return Map.of();
	}
}
