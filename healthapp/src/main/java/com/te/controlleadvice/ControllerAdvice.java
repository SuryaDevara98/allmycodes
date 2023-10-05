package com.te.controlleadvice;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.te.customexceptions.InvalidInputException;
import com.te.customexceptions.InvalidPasswordException;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String myNullPointerEcxeption(Model model) {
		model.addAttribute("myError", "our application has a Null Pointer Exception");
		return "errorpage";
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidPasswordException.class)
	public String invalidPasswordException(Model model, InvalidPasswordException inValidPass) {
		model.addAttribute("myError", inValidPass.getMessage());
		return "errorpage";
	}

	@ResponseStatus(value = HttpStatus.CHECKPOINT)
	@ExceptionHandler(InvalidInputException.class)
	public String invalidInputException(Model model, InvalidInputException inValidInput) {
		model.addAttribute("myError", inValidInput.getMessage());
		return "errorpage";
	}

}
