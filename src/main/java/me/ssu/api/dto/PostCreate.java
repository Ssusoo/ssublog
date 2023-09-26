package me.ssu.api.dto;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class PostCreate {
	public String title;
	public String content;
}
