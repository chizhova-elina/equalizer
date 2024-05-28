package com.example.equalizer;
public class Chorus extends Effect{

    public Chorus() {
        super();
    }

    public void setInputSampleStream(short[] inputAudioStream) {
        this.inputAudioStream = inputAudioStream;
    }

    @Override
    public synchronized short[] createEffect() {

        short amplitude;
        short chorusAmplitude;
        int checkFlag;
        int delay = 5000;
        int position = 0;

        for(int i = delay ; i < this.inputAudioStream.length; i ++) {
            amplitude = this.inputAudioStream[i];
            chorusAmplitude = this.inputAudioStream[position];
            checkFlag = ( (( chorusAmplitude) + (int)(0.9 * amplitude)));
            if(checkFlag < Short.MAX_VALUE && checkFlag > Short.MIN_VALUE) {
                chorusAmplitude = (short)checkFlag;
                this.inputAudioStream[position] =  chorusAmplitude;
                position += 1;
            }
        }
        return this.inputAudioStream;
    }

    @Override
    public synchronized short[] getOutputAudioStream() {
        return this.inputAudioStream;
    }
}
