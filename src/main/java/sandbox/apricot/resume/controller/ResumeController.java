package sandbox.apricot.resume.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/resume")
public class ResumeController {

    @GetMapping("/heonuk")
    public String introHeonUk(Model model) {
        return "developerIntroductionViews/heonuk/intro";
    }

    @GetMapping("/heejung")
    public String introHeeJung(Model model) {
        return "developerIntroductionViews/heejung/heejung";
    }

    @GetMapping("/heejung/resume")
    public String introHeeJungResume(Model model) {
        return "developerIntroductionViews/heejung/resume";
    }

    @GetMapping("/heejung/projects")
    public String introHeeJungProjects(Model model) {
        return "developerIntroductionViews/heejung/projects";
    }
    @GetMapping("/seoho")
    public String introSeoHo(Model model) {
        return "resume/seoho";
    }

    @GetMapping("/seockhyun")
    public String introSeockHyun(Model model) {
        return "resume/seockhyun";
    }

}
