package vn.happyprogramming.mentor;

import java.util.List;

public record MentorCard(
    String id,
    String name,
    String initials,
    String role,
    String specialty,
    String experience,
    String accent,
    List<String> skills,
    String monthly,
    String session,
    String description,
    String portrait
) {}
