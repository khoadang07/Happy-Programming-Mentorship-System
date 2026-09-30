package vn.happyprogramming.mentor;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.happyprogramming.common.ApiResponse;

@RestController
@RequestMapping("/api/mentors")
@CrossOrigin(origins = "*")
public class MentorController {
    private final MentorCatalog mentorCatalog;

    public MentorController(MentorCatalog mentorCatalog) {
        this.mentorCatalog = mentorCatalog;
    }

    @GetMapping
    public ApiResponse<List<MentorCard>> getFeaturedMentors() {
        return ApiResponse.ok(mentorCatalog.featuredMentors());
    }
}
