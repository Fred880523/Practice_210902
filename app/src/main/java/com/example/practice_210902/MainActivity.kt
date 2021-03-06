package com.example.practice_210902

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userAge = 8
        if (userAge >= 20) {
            Log.d("if문예시", "성인이 맞습니다.")
        }

        else if (userAge >= 17) {
            Log.d("if문예시", "고등학생입니다.")

        }

        else if (userAge >= 14) {
            Log.d("if문예시", "중학생 입니다.")

        }

        else {
            Log.d("if문예시", "초등학생or미취학아동입니다.")
        }



        introduceToastBtn.setOnClickListener {
         //토스트 "자기소개" 문장 띄우기
Toast.makeText(this, "저는 박광현 입니다.",Toast.LENGTH_SHORT).show()



        }



        toastBtn.setOnClickListener {

            //토스트 " 반갑습니다." 문장 띄우기
            Toast.makeText(this, "반갑습니다.", Toast.LENGTH_SHORT).show()


        }


        logBtn.setOnClickListener {

            //이 중괄호 내부의 코드는, LlgBtn이 눌릴때마다 실행 됨

            Log.d("메인화면", "로그 버튼 눌림")


        }

        secondLogBtn.setOnClickListener {
            //두번쨰 버튼이  눌리면 할일을 따로 지정
            Log.e("메인화면", "두번째 로그 버튼 눌림")

        }




    }

}