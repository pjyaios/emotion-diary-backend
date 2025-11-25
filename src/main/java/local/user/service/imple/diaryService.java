package local.user.service.imple;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import local.user.domain.diary;
import local.user.service.inter.diaryServiceInterface;
import local.user.domain.diary;

@Service
public class diaryService implements diaryServiceInterface {

    @Override
    public List<diary> getAll() {
        Date twoDaysAgo = new Date(System.currentTimeMillis() - (1000 * 60 * 60 * 24 * 2));
        Date yesterday = new Date(System.currentTimeMillis() - (1000 * 60 * 60 * 24));
        Date today = new Date(System.currentTimeMillis());

        List<diary> list = new ArrayList<>();
        list.add(new diary(1, twoDaysAgo.getTime(), 1, "오늘은 정말 열심히 산 하루였다."));
        list.add(new diary(2, yesterday.getTime(), 2, "오늘은 운좋은 하루였다."));
        list.add(new diary(3, today.getTime(), 3, "오늘은 정말 행복한 하루였다."));
        return list;
    }

    @Override
    public diary getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public diary create(diary diary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public diary update(Long id, diary diary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
