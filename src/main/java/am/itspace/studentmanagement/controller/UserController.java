package am.itspace.studentmanagement.controller;

import am.itspace.studentmanagement.entitiy.User;
import am.itspace.studentmanagement.entitiy.UserType;
import am.itspace.studentmanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/students")
    public String studentsPage(ModelMap modelMap) {
        List<User> users = new ArrayList<>();
        for (User student : userService.findAll()) {
            if (student.getUserType() == UserType.STUDENT) {
                users.add(student);
            }
        }
        modelMap.put("students", users);
        return "user/students";
    }

    @GetMapping("/teachers")
    public String teachersPage(ModelMap modelMap) {
        List<User> users = new ArrayList<>();
        for (User student : userService.findAll()) {
            if (student.getUserType() == UserType.TEACHER) {
                users.add(student);
            }
        }
        modelMap.put("teachers", users);
        return "user/teachers";
    }

    @GetMapping("/students/addStudent")
    public String addStudentPage() {
        return "user/addStudent";
    }

    @PostMapping("/students/addStudent")
    public String addStudent(@ModelAttribute User user) {
        user.setUserType(UserType.STUDENT);
        userService.save(user);
        return "redirect:/students";
    }

    @GetMapping("/teachers/addTeacher")
    public String addTeacher() {
        return "user/addTeacher";
    }

    @PostMapping("/teachers/addTeacher")
    public String addTeacher(@ModelAttribute User user) {
        user.setUserType(UserType.TEACHER);
        userService.save(user);
        return "redirect:/teachers";
    }
}