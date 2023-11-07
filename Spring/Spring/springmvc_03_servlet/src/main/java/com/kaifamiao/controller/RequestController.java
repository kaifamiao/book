package com.kaifamiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestController {
    @GetMapping("/showRequestInfo")
  public String showRequestInfo(HttpServletRequest request, Model model){
      String method = request.getMethod();
      String uri = request.getRequestURI();
      String queryString = request.getQueryString();

      model.addAttribute("method", method);
      model.addAttribute("uri", uri);
      model.addAttribute("queryString", queryString);

      return "requestInfo";
  }
}
