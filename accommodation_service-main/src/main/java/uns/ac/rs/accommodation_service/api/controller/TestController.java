package uns.ac.rs.accommodation_service.api.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> addAllJudgmentsFromPdfToCsv() throws IOException {
        return ResponseEntity.ok("Test uspio");
    }
}
