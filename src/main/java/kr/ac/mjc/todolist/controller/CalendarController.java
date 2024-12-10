package kr.ac.mjc.todolist.controller;  // 패키지명은 본인의 프로젝트에 맞게 수정

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

    @GetMapping("/calendar")
    public String showCalendar() {
        return "calendar";
    }
}