package me.ssu.api.controller;

import me.ssu.api.common.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class PostControllerTest extends BaseTest {

	@Test
	@DisplayName("글 등록 - 성공")
	void createPost() throws Exception {
		// When & Then
		mockMvc.perform(MockMvcRequestBuilders.post("/posts")
						.contentType(MediaType.APPLICATION_JSON) // Content-Type : Application JSON
								.content("{\"title\": \"제목입니다.\", \"content\": \"내용입니다.\"}")
						)
				.andExpect(status().isOk())
				.andExpect(content().json("{}")); // (성공)
//				 .andExpect(content().string("Hello World2")); // (실패)
	}

	@Test
	@DisplayName("글 등록 - 실패 - 글제목이 필수인 경우")
	void createPostFiledError() throws Exception {
		// When & Then
		mockMvc.perform(MockMvcRequestBuilders.post("/posts")
						.contentType(MediaType.APPLICATION_JSON) // Content-Type : Application JSON
						// "title": ""
						// "title": null
//						.content("{\"title\": \"\", \"content\": \"내용입니다.\"}")
						.content("{\"title\": null, \"content\": \"내용입니다.\"}")
				)
				.andDo(print())
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("code").value("400"))
				.andExpect(jsonPath("message").value("잘못된 요청입니다."));
//				 .andExpect(content().string("Hello World2")); // (실패)
	}
}
