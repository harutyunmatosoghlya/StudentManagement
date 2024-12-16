package am.itspace.studentmanagement.repository;

import am.itspace.studentmanagement.entitiy.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}