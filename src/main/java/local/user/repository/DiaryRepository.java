package local.user.repository;

import java.util.List;

import local.user.domain.Diary;

public interface DiaryRepository {

    List<Diary> getAll();

    Diary getById(Long id);

    Diary create(Diary diary);

    Diary update(Long id, Diary diary);

    void delete(Long id);
}
