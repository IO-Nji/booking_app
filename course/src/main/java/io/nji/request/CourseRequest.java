package io.nji.request;

public record CourseRequest(
        String name,
        String description,
        String skill_level
) {
}
