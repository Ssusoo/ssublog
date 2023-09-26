package me.ssu.api.controller;

import me.ssu.api.common.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class PostControllerTest extends BaseTest {

	@Test
	@DisplayName("/posts 요청시 Hello World를 출력")
	void test() throws Exception {

		// When & Then
		mockMvc.perform(MockMvcRequestBuilders.get("/posts"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World")); // (성공)
				// .andExpect(content().string("Hello World2")); (실패)
	}
}
