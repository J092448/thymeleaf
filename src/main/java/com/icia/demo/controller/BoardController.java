package com.icia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/board", method = RequestMethod.POST)
public class BoardController {
    @GetMapping("/list")
    @ResponseBody
    public String boardlist() {
        System.out.println("list 목록보기");
        return "/board/list 요청";
    }

    @GetMapping("/write")
    @ResponseBody
    public String boardwrite() {
        System.out.println("글쓰기");
        return "/board/write 요청";
    }
}
