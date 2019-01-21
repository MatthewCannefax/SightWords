package com.matthewcannefax.sightwords.activity;

import android.content.Intent;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.matthewcannefax.sightwords.R;
import com.matthewcannefax.sightwords.model.SightWord;
import com.matthewcannefax.sightwords.sampleData.SampleSightWords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements RecognitionListener {

    private static final int SPEECH_REQUEST_CODE = 10;
    TextView tvSightWord;
    ImageView ivMic;
    int position;
    String currentWord;
    TextView tvMessage;
    int messagePosition;
    boolean correct;

    List<SightWord> wordList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSightWord = findViewById(R.id.tvSightWord);
        ivMic = findViewById(R.id.ivMic);
        tvMessage = findViewById(R.id.tvMessage);
        position = 0;
        messagePosition = 0;

        ivMic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setSightWord();
                getSpeechInput(view);
            }
        });

        wordList = new ArrayList<>();
        for (SightWord s :
                SampleSightWords.sampleWordsList()) {
            wordList.add(s);
        }

        Collections.shuffle(wordList);
        setSightWord();
    }

    private void getSpeechInput(View view){

        SpeechRecognizer speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
//        speechRecognizer.setRecognitionListener(this);
//        Intent speechIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//        speechIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//        speechIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this.getPackageName());
//        speechRecognizer.startListening(speechIntent);

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, SPEECH_REQUEST_CODE);
        } else {
            Toast.makeText(this, "feature not supported", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case SPEECH_REQUEST_CODE:

                if(resultCode == RESULT_OK && data != null){
                    List<String> resultList = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    for (String s :
                            resultList) {
                        if(s.toLowerCase().equals(currentWord.toLowerCase())) {
                            correct = true;
                            break;
                        }
                    }

                    if(correct){
                        tvMessage.setText(SampleSightWords.positiveWordList().get(messagePosition));
                        tvMessage.setTextColor(getResources().getColor(R.color.correct));
                        setSightWord();
                    }else {
                        tvMessage.setTextColor(getResources().getColor(R.color.incorrect));
                        tvMessage.setText(SampleSightWords.getNegativeWord());
                    }
                }

                break;
        }
    }

    private void setSightWord(){
        tvSightWord.setText(wordList.get(position).toString());
        currentWord = wordList.get(position).toString();

        if(position < wordList.size() - 1){
            position++;
        }else{
            position = 0;
        }

        if(messagePosition < SampleSightWords.positiveWordList().size() - 1){
            messagePosition++;
        }else {
            messagePosition = 0;
        }
        correct = false;
    }

    @Override
    public void onReadyForSpeech(Bundle bundle) {

    }

    @Override
    public void onBeginningOfSpeech() {

    }

    @Override
    public void onRmsChanged(float v) {

    }

    @Override
    public void onBufferReceived(byte[] bytes) {

    }

    @Override
    public void onEndOfSpeech() {

    }

    @Override
    public void onError(int i) {

    }

    @Override
    public void onResults(Bundle bundle) {

    }

    @Override
    public void onPartialResults(Bundle bundle) {

    }

    @Override
    public void onEvent(int i, Bundle bundle) {

    }
}
