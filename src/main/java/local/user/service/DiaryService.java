package local.user.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import local.user.domain.Diary;

@Service
public class DiaryService implements DiaryServiceInterface {

    @Override
    public List<Diary> getAll() {
        Date twoDaysAgo = new Date(System.currentTimeMillis() - (1000 * 60 * 60 * 24 * 2));
        Date yesterday = new Date(System.currentTimeMillis() - (1000 * 60 * 60 * 24));
        Date today = new Date(System.currentTimeMillis());

        List<Diary> list = new ArrayList<>();
        list.add(new Diary(1, twoDaysAgo.getTime(), 1, "오늘은 정말 열심히 산 하루였다."));
        list.add(new Diary(2, yesterday.getTime(), 2, "오늘은 운좋은 하루였다."));
        list.add(new Diary(3, today.getTime(), 3, "오늘은 정말 행복한 하루였다."));
        return list;
    }

    @Override
    public Diary getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Diary create(Diary diary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Diary update(Long id, Diary diary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
