package org.assignmentTracker.factory;

import org.assignmentTracker.entity.Note;
import org.assignmentTracker.entity.User;
import org.assignmentTracker.util.Helper;
import org.assignmentTracker.util.NoteFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

/*
 @author Lyse-Celeste Irakoze
 StudNo: 217132057
 Date: 30 June 2020
 Desc: Note Factory
  */

public class NoteFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createNote() {
        //Date dateCreated = new Date();
        Note note = NoteFactory.createNote("Chapter 1", "Summary", , dateCreated);
        Assert.assertEquals(note, note);
    }
}