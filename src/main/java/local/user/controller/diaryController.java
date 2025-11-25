package local.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import local.user.domain.diary;
import local.user.service.imple.diaryService;
import local.user.service.inter.diaryServiceInterface;

@RestController
public class diaryController {

    private final diaryServiceInterface _diaryService;

    public diaryController(diaryServiceInterface diaryService) {
        this._diaryService = new diaryService();
    }

    @GetMapping("/diaries")
    public List<diary> diary() {
        return _diaryService.getAll();
    }
}
