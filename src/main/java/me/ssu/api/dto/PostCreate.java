package me.ssu.api.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostCreate {

	@NotNull(message = "글 제목이 없습니다.")
	@NotEmpty(message = "글 제목이 없습니다.")
	public String title;

	@NotNull(message = "글 내용이 없습니다.")
	@NotEmpty(message = "글 내용이 없습니다.")
	public String content;
}
