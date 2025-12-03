package local.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import local.user.domain.Diary;
import local.user.service.DiaryService;

import org.springframework.web.bind.annotation.PutMapping;

import local.user.domain.DiaryDTO;

@RestController
public class DiaryController {

    private final DiaryService diaryService;

    @Autowired
    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping("/diaries")
    public List<Diary> getAll() {
        return diaryService.getAll();
    }

    @GetMapping("/diaries/{id}")
    public Diary getById(@PathVariable Long id) {
        Diary diary = diaryService.getById(id);
        return diary;
    }

    @PostMapping("/diaries")
    public Diary create(@RequestBody DiaryDTO diaryDto) {
        Diary created = diaryService.create(new Diary(diaryDto));
        return created;
    }

    @PutMapping("/diaries/{id}")
    public Diary update(@PathVariable Long id, @RequestBody Diary diary) {
        Diary updated = diaryService.update(id, diary);
        return updated;
    }

    @DeleteMapping("/diaries/{id}")
    public void delete(@PathVariable Long id) {
        diaryService.delete(id);
    }
}
