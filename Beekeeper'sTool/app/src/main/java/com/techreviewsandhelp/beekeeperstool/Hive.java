package com.techreviewsandhelp.beekeeperstool;

import android.app.Activity;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;

import java.io.File;

/**
 * Created by crua9 on 4/21/2015.
 */
public class Hive extends Activity {


    private MediaRecorder recorder = null;
    private int opformats [] = {MediaRecorder.OutputFormat.MPEG_4};
    private int curFormat = 0;

    /**
     * Not sure how this layout will be yet
     * 
     * maybe I will keep it as a button or make it into a dynamic list.
     * I don't like the look of the buttons
     *
     */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hive);
}

    /**
     *
     * This code maybe useless now. Users may not actually care for the notes. However, the user should
     * have the ability to take note, or have the phone read off the Q&A to them. See comment 8 on java.
     *
     *
     * public void startRecording(){
     recorder = new MediaRecorder();
     recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
     recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
     recorder.setOutputFile(opformats[curFormat]);
     recorder.setOutputFile(getFileStreamPath());

     try{
     recorder.prepare();
     recorder.start();
     } catch (Exception e){
     e.printStackTrace();
     }}

     public void stopRecording(){
     if(recorder != null){
     recorder.stop();
     recorder.reset();
     recorder.release();

     recorder= null;
     }
     }

     private String getFilePath(){
     String filePath = Environment.getExternalStorageDirectory().getPath();
     File file = File(filePath, "something");

     if(!file.exists())
     file.mkdirs();
     return (file.getAbsolutePath() +"/" + System.currentTimeMillis() + curFormat );
     }
     */


}

/**
 * To tired to keep going.
 * I need to make it work the audio recording will save with the hives number and the time of the recording.
 */