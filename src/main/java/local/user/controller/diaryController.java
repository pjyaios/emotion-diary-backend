package local.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import local.user.domain.Diary;
import local.user.service.DiaryServiceInterface;

@RestController
public class DiaryController {

    private final DiaryServiceInterface _diaryService;

    @Autowired
    public DiaryController(DiaryServiceInterface diaryService) {
        this._diaryService = diaryService;
    }

    @GetMapping("/diaries")
    public List<Diary> getAll() {
        return _diaryService.getAll();
    }
}
