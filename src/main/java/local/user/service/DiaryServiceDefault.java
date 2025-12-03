package local.user.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import local.user.domain.Diary;
import local.user.repository.DiaryRepository;

@Service
@Transactional
public class DiaryServiceDefault implements DiaryService {

    private final DiaryRepository diaryRepository;

    @Autowired
    public DiaryServiceDefault(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    @Override
    public List<Diary> getAll() {
        return diaryRepository.getAll();
    }

    @Override
    public Diary getById(Long id) {
        return diaryRepository.getById(id);
    }

    @Override
    public Diary create(Diary diary) {
        return diaryRepository.create(diary);
    }

    @Override
    public Diary update(Long id, Diary diary) {
        return diaryRepository.update(id, diary);
    }

    @Override
    public void delete(Long id) {
        diaryRepository.delete(id);
    }

}
