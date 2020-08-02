package com.arzds;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ArzDsController {
	@PostMapping("/head")
	public String readHeader(@RequestHeader(required = false) String dept, @RequestHeader("Content-Type") String type,
			@RequestBody String data) {
		return "Dept "+dept+" Type "+type+" Body "+data;
	}
}
