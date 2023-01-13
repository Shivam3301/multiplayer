package com.jspiders.multiplayer.entity;

public class Song 
{
private int id;
private String songName;
private String singerName;
private String movieName;
private String composer;
private String lyricist;
private String length;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getSongName() {
	return songName;
}

public void setSongName(String songName) {
	this.songName = songName;
}

public String getSingerName() {
	return singerName;
}

public void setSingerName(String singerName) {
	this.singerName = singerName;
}

public String getMovieName() {
return movieName;
}

public void setMovieName(String movieName) {
this.movieName = movieName;
}

public String getComposer() {
return composer;
}

public void setComposer(String composer) {
this.composer = composer;
}

public String getLyricist() {
return lyricist;
}

public void setLyricist(String lyricist) {
this.lyricist = lyricist;
}

public String getLength() {
return length;
}

public void setLength(String length) {
this.length = length;
}

@Override
public String toString() {
return"Song:\n [" + id + ". " + songName + " from movie " + movieName + " is Sung by " + singerName
+ " and composed by " + composer + ", lyricist=" + lyricist + ", length=" + length + "]";
}

}
