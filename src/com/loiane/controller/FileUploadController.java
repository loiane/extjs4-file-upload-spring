package com.loiane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loiane.model.ExtJSFormResult;
import com.loiane.model.FileUploadBean;

/**
 * Controller - Spring
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
@Controller
@RequestMapping(value = "/upload.action")
public class FileUploadController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String create(FileUploadBean uploadItem, BindingResult result){

		ExtJSFormResult extjsFormResult = new ExtJSFormResult();
		
		if (result.hasErrors()){
			for(ObjectError error : result.getAllErrors()){
				System.err.println("Error: " + error.getCode() +  " - " + error.getDefaultMessage());
			}
			
			//set extjs return - error
			extjsFormResult.setSuccess(false);
			
			return extjsFormResult.toString();
		}

		// Some type of file processing...
		System.err.println("-------------------------------------------");
		System.err.println("Test upload: " + uploadItem.getFile().getOriginalFilename());
		System.err.println("-------------------------------------------");
		
		//set extjs return - sucsess
		extjsFormResult.setSuccess(true);
		
		return extjsFormResult.toString();
	}

}
