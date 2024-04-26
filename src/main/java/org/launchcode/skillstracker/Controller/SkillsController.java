package org.launchcode.skillstracker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    // this mapping should happen at http://localhost:8080/
    @GetMapping
    public String skillsTracker() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }


    @GetMapping("form")
    public String formSkill() {
        return "<form method='post'>" +
                    "Name:<br>" +
                    "<input type = 'text' name = 'name' />" +
                    "<br>My favorite language:<br>" +
                        "<select name = 'firstChoice'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'Javascript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "</select>" +
                    "<br>My second favorite language:<br>" +
                        "<select name = 'secondChoice'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'Javascript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "</select>" +
                    "<br>My third favorite language:<br>" +
                        "<select name = 'thirdChoice'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'Javascript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "</select><br>" +
                    "<input type = 'submit' value = 'Submit' />" +
                "</form>";
    }


    //
    @PostMapping("form")
    public String form(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<il>" + firstChoice + "</li>" +
                    "<il>" + secondChoice + "</li>" +
                    "<il>" + thirdChoice + "</li>" +
                "</ol>";
    }

}
