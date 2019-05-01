package com.br.tecladosq1;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;
import android.view.inputmethod.InputConnection;

import static com.br.tecladosq1.Globais.STR_VALUES;

public class TecladoService extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    @Override
    public View onCreateInputView() {
        // get the KeyboardView and add our Keyboard layout to it
        KeyboardView tecladoView = (KeyboardView) getLayoutInflater().inflate(R.layout.teclado_container, null);
        Keyboard teclado = new Keyboard(this, R.xml.painel_movimentos);
        tecladoView.setKeyboard(teclado);
        tecladoView.setOnKeyboardActionListener(this);
        return tecladoView;
    }

    @Override
    public void onPress(int primaryCode) {

    }

    @Override
    public void onRelease(int primaryCode) {

    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        InputConnection ic = getCurrentInputConnection();

        if (ic == null) return;

        ic.commitText(STR_VALUES[0][primaryCode], 1);

//        switch (primaryCode){
//            case 0:
//                ic.commitText(STR_VALUES[0][primaryCode], 1);
//                break;
//
//            case 1:
//                break;
//        }

//        switch (primaryCode) {
//            case Keyboard.KEYCODE_DELETE:
//                CharSequence selectedText = ic.getSelectedText(0);
//                if (TextUtils.isEmpty(selectedText)) {
//                    // no selection, so delete previous character
//                    ic.deleteSurroundingText(1, 0);
//                } else {
//                    // delete the selection
//                    ic.commitText("", 1);
//                }
//                ic.deleteSurroundingText(1, 0);
//                break;
//            default:
//                char code = (char) primaryCode;
//                ic.commitText(String.valueOf(code), 1);
//        }
    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
