package com.example.dtsapksmpnintrnal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;

public class InternalActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String FILENAME = "namafile.txt";
    Button buatFile, ubahFile, bacaFile, deleteFile;
    TextView txtBaca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);
        buatFile=findViewById(R.id.btnBuatFile);
        ubahFile=findViewById(R.id.btnUbahFile);
        bacaFile=findViewById(R.id.btnBacaFile);
        deleteFile=findViewById(R.id.btnHapusFile);
        txtBaca=findViewById(R.id.txtBaca);

        buatFile.setOnClickListener(this);
        ubahFile.setOnClickListener(this);
        bacaFile.setOnClickListener(this);
        deleteFile.setOnClickListener(this);

    }

    void buatFile(){
        String isiFile="Coba isi data file text";
        File file=new File(getFilesDir(), FILENAME);

        FileOutputStream outputStream=null;
        try {
            file.createNewFile();
            outputStream=new FileOutputStream(file, true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void hapusFile(){
        File file=new File(getFilesDir(),FILENAME);
        if (file.exists()){
            file.delete();
        }
    }

    @Override
    public void onClick(View v){ jalankanPerintah(v.getId());}

    public void jalankanPerintah(int id){
        switch (id){
            case R.id.btnBuatFile:
                buatFile();
                break;
            case R.id.btnBacaFile:
                bacaFile();
                break;
            case R.id.btnUbahFile:
                ubahFile();
                break;
            case R.id.btnHapusFile:
                hapusFile();
                break;
        }
    }

    private void ubahFile() {
        File file=new File(getFilesDir(), FILENAME);
    }

    private void bacaFile() {
        File file=new File(getFilesDir(), FILENAME);
    }

}