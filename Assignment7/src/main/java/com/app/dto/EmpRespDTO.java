package com.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper =true)
public class EmpRespDTO extends BaseDTO{
	private Long id;
	private String firstName;
	private String lastName;
}
