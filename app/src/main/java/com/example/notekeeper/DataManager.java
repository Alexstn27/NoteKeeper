package com.example.notekeeper;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager ourInstance = null;

    private List<CourseInfo> mCourses = new ArrayList<>();
    private List<NoteInfo> mNotes = new ArrayList<>();

    public static DataManager getInstance(){
        if (ourInstance == null){
            ourInstance =new DataManager();
            ourInstance.initializeCourses();
            ourInstance.initializeExempleNotes();
        }
        return ourInstance;
    }

    public String getCurrentUserName(){ return "Stan Alexandru";}

    public String getCurrentUserEmail(){ return "stan.alexandru@gmail.com";}

    public List<NoteInfo> getNotes(){ return mNotes;}
    

}
