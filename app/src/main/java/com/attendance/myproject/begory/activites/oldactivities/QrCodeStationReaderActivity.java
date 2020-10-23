package com.attendance.myproject.begory.activites.oldactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import com.attendance.myproject.begory.BaseActivity;
import com.attendance.myproject.begory.R;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QrCodeStationReaderActivity extends BaseActivity implements ZXingScannerView.ResultHandler{

    private ZXingScannerView mScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code_station_reader);
        mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
        // this paramter will make your HUAWEI phone works great!
        //mScannerView.setAspectTolerance(0.5f);
        setContentView(mScannerView);                // Set the scanner view as the content view
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
        mScannerView.startCamera();          // Start camera on resume
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();           // Stop camera on pause
    }

    @Override
    public void handleResult(Result rawResult) {
        // Do something with the result here
        //Log.v(TAG, rawResult.getBarcodeFormat().toString()); // Prints the scan format (qrcode, pdf417 etc.)
        if (rawResult.getText()!=null && !TextUtils.isEmpty(rawResult.getText().toString()))
        {
            //Log.v(TAG, rawResult.getText()); // Prints scan results
            // Utils.showToast(QrCodeStationReaderActivity.this,rawResult.getText().toString());

            String stationId = rawResult.getText().toString().replace("Id=","");
            // Here we should finish and navigate to fill fuel fragment
            Intent returnIntent = new Intent();
            returnIntent.putExtra("Id",stationId);
            setResult(Activity.RESULT_OK,returnIntent);
            finish();
            //Follow https://stackoverflow.com/questions/17085729/startactivityforresult-from-a-fragment-and-finishing-child-activity-doesnt-c
        }
        else
        {
            // If you would like to resume scanning, call this method below:
            mScannerView.resumeCameraPreview(this);
        }

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_CANCELED, returnIntent);
        finish();

    }
}
