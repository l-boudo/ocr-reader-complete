/*
 * Copyright (C) The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.gms.samples.vision.ocrreader;

import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;

import com.google.android.gms.samples.vision.ocrreader.ui.camera.GraphicOverlay;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.text.TextBlock;

import custom.MyPatterns;

/**
 * A very simple Processor which gets detected TextBlocks and adds them to the overlay
 * as OcrGraphics.
 */
public class OcrDetectorProcessor implements Detector.Processor<TextBlock> {

    public static final boolean MY_PATTERN = true;
    public static final boolean TEST = false;
    private GraphicOverlay<OcrGraphic> graphicOverlay;
    private GraphicOverlay<OcrGraphic> graphicOverlayHC;
    private GraphicOverlay<OcrGraphic> graphicOverlayHP;
    private int consoHP=-1;
    private int consoHC=-1;
    private int conso=-1;
    private String serie="";
    OcrDetectorProcessor(GraphicOverlay<OcrGraphic> ocrGraphicOverlay) {
        graphicOverlay = ocrGraphicOverlay;
        graphicOverlay = ocrGraphicOverlay;
        graphicOverlay = ocrGraphicOverlay;

    }

    /**
     * Called by the detector to deliver detection results.
     * If your application called for it, this could be a place to check for
     * equivalent detections by tracking TextBlocks that are similar in location and content from
     * previous frames, or reduce noise by eliminating TextBlocks that have not persisted through
     * multiple detections.
     */
    @Override
    public void receiveDetections(Detector.Detections<TextBlock> detections) {
        /*
        * On compare les y trouvé pour determiner si c'est un champ de la conso
        * Heure pleine ou Heure creuse
        * */
        int y_new;
        int y_old=0;
        graphicOverlay.clear();
        String text;
        Boolean already = false;
        SparseArray<TextBlock> items = detections.getDetectedItems();
        for (int i = 0; i < items.size(); ++i) {
            TextBlock item = items.valueAt(i);
            if (item != null && item.getValue() != null) {
                // filtrer
                // MyPatterns.TestPDL(item.getValue());
                //text = MyPatterns.TestPDL(item.getValue());
                //Log.d("OcrDetectorProcessor", "GET" + item.getValue());
                /*
                *
                * item.getCornerPoints()[0] pour recupérer la 'position du texte et la comparer'
                *
                * */
                if (MyPatterns.TestCONSO(item.getValue()) != null && MY_PATTERN == true){
                    //Log.d("OcrDetectorProcessor", "item " + item.getValue());
                    text = MyPatterns.TestCONSO(item.getValue().trim());
                    if (!already) {
                        y_old = item.getCornerPoints()[0].y;
                        conso = Integer.parseInt(text);
                        already = true;
                    }else{
                        y_new = item.getCornerPoints()[0].y;
                        if (y_new > y_old){// le y le plus bas est HP
                            consoHC = conso;
                            consoHP = Integer.parseInt(text);

                        }else {
                            consoHC = Integer.parseInt(text);
                            consoHP = conso;

                        }
                        already = false;

                    }
                    Log.d("OcrDetectorProcessor", "CONSO  HC" + consoHC);
                    Log.d("OcrDetectorProcessor", "CONSO  HP" + consoHP);
                    Log.d("OcrDetectorProcessor", "CONSO  " + conso);

                    OcrGraphic graphic = new OcrGraphic(graphicOverlay, item,Color.WHITE);
                    graphicOverlay.add(graphic);
                }

                else if (MyPatterns.TestNOSERIE(item.getValue()) != null && MY_PATTERN == true && !TEST){
                    text = MyPatterns.TestNOSERIE(item.getValue());
                    serie = text;
                    Log.d("OcrDetectorProcessor", "NOSERIE  " + text);
                    OcrGraphic graphic = new OcrGraphic(graphicOverlay, item,Color.WHITE);
                    graphicOverlay.add(graphic);
                }
                if ( MY_PATTERN == false){
                    Log.d("OcrDetectorProcessor", "Value " + item.getValue());
                    Log.d("OcrDetectorProcessor", "Trimmed Value " + MyPatterns.DeleteSpaces(item.getValue()));
                    OcrGraphic graphic = new OcrGraphic(graphicOverlay, item, Color.WHITE);
                    graphicOverlay.add(graphic);
                }


            }
        }
    }

    /**
     * Frees the resources associated with this detection processor.
     */
    @Override
    public void release() {
        graphicOverlay.clear();
    }
}
