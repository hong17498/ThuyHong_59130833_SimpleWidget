package vn.edu.ntu.thuyhong.thuyhong_59130833_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTen, editNS, editSoThich;
    RadioGroup rdgGioiTinh;
    RadioButton rbNam, rbNu;
    CheckBox cb, cb2, cb3, cb4, cb5;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews(){
        editTen = findViewById(R.id.editTen);
        editNS = findViewById(R.id.editNS);
        cb = (CheckBox) findViewById(R.id.cb);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        cb5 = (CheckBox) findViewById(R.id.cb5);
        rdgGioiTinh = (RadioGroup) findViewById(R.id.rdgGioiTinh);
        rbNam = (RadioButton) findViewById(R.id.rbNam);
        rbNu = (RadioButton) findViewById(R.id.rbNu);
        editSoThich = findViewById(R.id.editSoThich);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }
    private void addEvents(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thongTin = "";
                thongTin += editTen.getText();
                thongTin += "\nNgày sinh: " + editNS.getText();
                if(rbNam.isChecked()){
                    thongTin += "\nGiới tính: " + rbNam.getText();
                }
                if(rbNu.isChecked()){
                    thongTin += "\nGiới tính: " + rbNu.getText();
                }
                if(cb.isChecked()){
                    thongTin +="\nSở thích: "+ cb.getText();
                }
                if(cb2.isChecked()){
                    thongTin +="; "+ cb2.getText();
                }
                if(cb3.isChecked()){
                    thongTin +="; "+ cb3.getText();
                }
                if(cb4.isChecked()){
                    thongTin +="; "+ cb4.getText();
                }
                if(cb5.isChecked()){
                    thongTin +="; "+ cb5.getText();
                }
                thongTin += "; "+editSoThich.getText();
                Toast.makeText(MainActivity.this, thongTin, Toast.LENGTH_LONG).show();
            }
        });
    }




}
