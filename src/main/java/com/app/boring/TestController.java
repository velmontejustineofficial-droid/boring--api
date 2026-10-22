package com.app.boring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping
    public String health(){
        return "ok";
    }
    @GetMapping("/tools")
    public List<Tool> getTools() {
        return List.of(
                new Tool(
                        1,
                        "JSON Formatter",
                        "Format, validate, and organize JSON data with a simple and easy-to-use interface.",
                        "Developer Tools",
                        "Web Tool",
                        "JavaScript",
                        "Alex Developer",
                        "Oct 18, 2026",
                        List.of("JavaScript", "HTML", "CSS"),
                        "https://jsonformatter.org/",
                        "https://github.com/"
                ),
                new Tool(
                        2,
                        "Email Service",
                        "A web-based email tool designed to help users manage and organize email-related tasks.",
                        "Web Tools",
                        "Web Tool",
                        "PHP",
                        "Jamie Santos",
                        "Oct 17, 2026",
                        List.of("PHP", "MySQL", "JavaScript"),
                        "",
                        "https://github.com/"
                ),
                new Tool(
                        3,
                        "Java Utility Library",
                        "A reusable Java library containing helper methods for common programming tasks.",
                        "Libraries",
                        "Java Library",
                        "Java",
                        "Chris Rivera",
                        "Oct 16, 2026",
                        List.of("Java", "Maven"),
                        "",
                        "https://github.com/"
                ),
                new Tool(
                        4,
                        "Color Palette Generator",
                        "Generate color combinations for websites, applications, and creative projects.",
                        "Design Tools",
                        "Web Tool",
                        "JavaScript",
                        "Taylor Dev",
                        "Oct 15, 2026",
                        List.of("JavaScript", "CSS", "HTML"),
                        "",
                        "https://github.com/"
                ),
                new Tool(
                        5,
                        "File Organizer",
                        "A desktop utility that helps organize files into folders based on their file types.",
                        "Desktop Tools",
                        "Desktop App",
                        "Java",
                        "Morgan Lee",
                        "Oct 14, 2026",
                        List.of("Java", "Swing"),
                        "",
                        "https://github.com/"
                ),
                new Tool(
                        6,
                        "Password Generator",
                        "Generate random passwords with customizable length and character options.",
                        "Developer Tools",
                        "Web Tool",
                        "JavaScript",
                        "Jordan Cruz",
                        "Oct 12, 2026",
                        List.of("JavaScript", "HTML", "CSS"),
                        "",
                        "https://github.com/"
                )
        );
    }

    public record Tool(
            int id,
            String name,
            String description,
            String category,
            String type,
            String language,
            String author,
            String date,
            List<String> technologies,
            String demo,
            String github
    ) {}
}
