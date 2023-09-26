package me.ssu.api.controller;

import me.ssu.api.common.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class PostControllerTest extends BaseTest {

	@Test
	@DisplayName("글 등록")
	void test() throws Exception {
		// When & Then
		mockMvc.perform(MockMvcRequestBuilders.post("/posts")
						.contentType(MediaType.APPLICATION_JSON) // Content-Type : Application JSON
								.content("{\"title\": \"제목입니다.\", \"content\": \"내용입니다.\"}")
						)
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World")); // (성공)
//				 .andExpect(content().string("Hello World2")); // (실패)
	}
}
