package local.user.domain;

public class DiaryDTO {

    private long createdDate;
    private int emotionId;
    private String content;

    public DiaryDTO() {
    }

    public DiaryDTO(Diary diary) {
        this.createdDate = diary.getCreatedDate();
        this.emotionId = diary.getEmotionId();
        this.content = diary.getContent();
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
