package am.itspace.studentmanagement.service;

import am.itspace.studentmanagement.entitiy.Lesson;

import java.util.List;

public interface LessonService {
    List<Lesson> findAll();

    Lesson save(Lesson lesson);
}