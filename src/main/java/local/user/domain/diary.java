package local.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long createdDate;
    private int emotionId;
    private String content;

    public Diary() {
    }

    public Diary(int id, long createdDate, int emotionId, String content) {
        this.id = id;
        this.createdDate = createdDate;
        this.emotionId = emotionId;
        this.content = content;
    }

    public Diary(DiaryDTO diaryDto) {
        this.createdDate = diaryDto.getCreatedDate();
        this.emotionId = diaryDto.getEmotionId();
        this.content = diaryDto.getContent();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public int getEmotionId() {
        return emotionId;
    }

    public void setEmotionId(int emotionId) {
        this.emotionId = emotionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
