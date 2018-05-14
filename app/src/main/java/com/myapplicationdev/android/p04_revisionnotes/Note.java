package com.myapplicationdev.android.p04_revisionnotes;

public class Note {

	private int id;
	private String note;
	private int stars;

    public Note(int id, String note, int stars) {
        this.id = id;
        this.note = note;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
