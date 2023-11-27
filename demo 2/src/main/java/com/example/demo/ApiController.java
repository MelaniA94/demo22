import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Value("${app.url}")
    private String appUrl;

    @GetMapping("/url")
    public String getUrl() {
        return appUrl;
    }
}
