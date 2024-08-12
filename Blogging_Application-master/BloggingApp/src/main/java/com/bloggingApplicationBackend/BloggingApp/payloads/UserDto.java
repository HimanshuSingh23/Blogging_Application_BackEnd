package com.bloggingApplicationBackend.BloggingApp.payloads;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	
	private int id;
	
	@NotEmpty
	@Size(min = 4,message = "UserName must have atleast 4 characters!!")
	private String name;
	
	@Email(message = "Email address is ot valid!!")
	private String email;
	
	@NotEmpty
	@Size(min = 3,max = 10,message = "Password must be atleast 3 characters and not more than 10 characters")
	private String password;
	
	@NotEmpty
	private String about;

}
