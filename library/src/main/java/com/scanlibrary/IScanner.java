package com.scanlibrary;

import android.net.Uri;

import java.io.IOException;

/**
 * Created by jhansi on 04/04/15.
 */
public interface IScanner {

    void onBitmapSelect(Uri uri);

    void onScanFinish(Uri uri) throws IOException;
}