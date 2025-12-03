package local.user.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import local.user.domain.Diary;

@Repository
public class DiaryRepositoryPostgresql implements DiaryRepository {

    private final EntityManager em;

    public DiaryRepositoryPostgresql(EntityManager em) {
        this.em = em;
    }

    public List<Diary> getAll() {
        List<Diary> result = em.createQuery("select d from Diary d", Diary.class)
                .getResultList();
        return result;
    }

    public Diary getById(Long id) {
        return em.find(Diary.class, id);
    }

    public Diary create(Diary diary) {
        em.persist(diary);
        return diary;
    }

    public Diary update(Long id, Diary diary) {
        Diary old = em.find(Diary.class, id);
        old.setCreatedDate(diary.getCreatedDate());
        old.setEmotionId(diary.getEmotionId());
        old.setContent(diary.getContent());
        em.merge(old);

        return em.find(Diary.class, id);
    }

    public void delete(Long id) {
        Diary diary = em.find(Diary.class, id);
        em.remove(diary);
    }

}
