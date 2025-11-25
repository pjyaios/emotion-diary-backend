package local.user.service.inter;

import java.util.List;
import local.user.domain.diary;

public interface diaryServiceInterface {

    List<diary> getAll();

    diary getById(Long id);

    diary create(diary diary);

    diary update(Long id, diary diary);

    void delete(Long id);
}
