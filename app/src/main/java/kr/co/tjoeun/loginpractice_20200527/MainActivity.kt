package kr.co.tjoeun.loginpractice_20200527

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpBtn.setOnClickListener {

            val myIntent = Intent(this, SignUpActivity::class.java)
            startActivity(myIntent)

        }

        loginBtn.setOnClickListener {
            val inputEmail = emailEdt.text.toString()
            val inputPw = pwEdt.text.toString()

//            email / 비번 확인해서 맞으면 / 틀리면 처리가 다름.
//             => 분기 처리 => 조건문

            if (inputEmail == "admin@test.com" && inputPw == "qwer") {
                Log.d("로그인확인", "관리자 맞다")
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Log.d("로그인확인", "관리자 아님")
                Toast.makeText(this, "로그인에 실패했습니다." ,Toast.LENGTH_SHORT).show()
            }

        }

        eventBtn.setOnClickListener {

            Log.d("이벤트확인", "버튼 클릭")
            Log.e("이벤트확인", "에러 로그 발생")

            Toast.makeText(this, "버튼 클릭 됨", Toast.LENGTH_SHORT).show()

            val inputContent = contentEdt.text.toString()

            eventBtn.text = inputContent

        }

    }
}
