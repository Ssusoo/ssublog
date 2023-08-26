package me.ssu.api.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class PostControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("/posts 요청시 Hello World를 출력")
	void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/posts"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World")); // (success)
				// .andExpect(content().string("Hello World2")); (failed)
	}
}