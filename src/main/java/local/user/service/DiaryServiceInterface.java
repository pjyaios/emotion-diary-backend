package local.user.service;

import java.util.List;

import local.user.domain.Diary;

public interface DiaryServiceInterface {

    List<Diary> getAll();

    Diary getById(Long id);

    Diary create(Diary diary);

    Diary update(Long id, Diary diary);

    void delete(Long id);
}
