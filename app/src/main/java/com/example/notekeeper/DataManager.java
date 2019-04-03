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

    public int createNewNote(){
        NoteInfo note= new NoteInfo(null, null, null);
        mNotes.add(note);
        return mNotes.size() -1 ;
    }

    public int findNote(NoteInfo note){
        for (int index=0; index < mNotes.size(); index++) {
            if (note.equals(mNotes.get(index)))
                return index;
        }
        return -1;
    }

    public void removeNote(int index){ mNotes.remove(index);}

    public List<CourseInfo> getmCourses(){return mCourses;}

    public CourseInfo getCourse (String id){
        for (CourseInfo course :mCourses){
            if (id.equals(course.getCourseId()))
                return course;
        }
        return null ;
    }



}



