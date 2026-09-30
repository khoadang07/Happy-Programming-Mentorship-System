package vn.happyprogramming.mentor;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MentorCatalog {
    public List<MentorCard> featuredMentors() {
        return List.of(
            new MentorCard("minh-an", "Minh An Nguyen", "MA", "Senior Backend Engineer", "Backend", "6 years of experience", "purple", List.of("Java", "Spring Boot", "SQL Server"), "2,500,000", "500,000", "Build a solid Java foundation, design better APIs, and turn your Spring Boot project into work you are proud to share.", "mentor-1.jpg"),
            new MentorCard("thao-linh", "Thao Linh Tran", "TL", "Senior Frontend Developer", "Frontend", "5 years of experience", "peach", List.of("React", "TypeScript", "Tailwind CSS"), "1,800,000", "400,000", "Go from your first component to a thoughtful web experience with practical feedback on React, accessibility, and your portfolio.", "mentor-2.jpg"),
            new MentorCard("hoang-nam", "Hoang Nam Le", "HN", "AI & Data Engineer", "AI & Data", "7 years of experience", "green", List.of("Python", "Machine Learning", "SQL"), "2,800,000", "600,000", "Make sense of your data, understand your models, and build a machine learning project with a clear purpose and a realistic plan.", "mentor-3.jpg"),
            new MentorCard("david-pham", "David Pham", "DP", "Full-stack Developer", "Full-stack", "8 years of experience", "purple", List.of("JavaScript", "React", "Node.js"), "2,400,000", "500,000", "Connect frontend and backend with confidence. Work through architecture decisions and get hands-on feedback on your full-stack app.", "mentor-4.jpg"),
            new MentorCard("sofia-tran", "Sofia Tran", "ST", "Software Engineer", "Backend", "5 years of experience", "peach", List.of("Java", "System Design", "SQL"), "2,200,000", "450,000", "Strengthen your problem-solving skills, understand system design, and learn to explain the reasoning behind your technical decisions.", "mentor-5.jpg"),
            new MentorCard("alex-nguyen", "Alex Nguyen", "AN", "DevOps Engineer", "DevOps", "6 years of experience", "green", List.of("Docker", "CI/CD", "Cloud"), "2,600,000", "550,000", "Take your project from a local setup to a reliable deployment. Learn containers, delivery pipelines, and practical cloud fundamentals.", "mentor-6.jpg")
        );
    }
}
