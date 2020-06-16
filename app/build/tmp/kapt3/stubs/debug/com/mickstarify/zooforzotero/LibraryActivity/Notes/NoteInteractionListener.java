package com.mickstarify.zooforzotero.LibraryActivity.Notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/Notes/NoteInteractionListener;", "", "deleteNote", "", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "editNote", "app_debug"})
public abstract interface NoteInteractionListener {
    
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
    
    public abstract void editNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
}