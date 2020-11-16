package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var firstPlayer = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){

        button00.setOnClickListener(){
            buttonPlay(button00)
        }
        button01.setOnClickListener(){
            buttonPlay(button01)
        }
        button02.setOnClickListener(){
            buttonPlay(button02)
        }
        button10.setOnClickListener(){
            buttonPlay(button10)
        }
        button11.setOnClickListener(){
            buttonPlay(button11)
        }
        button12.setOnClickListener(){
            buttonPlay(button12)
        }
        button20.setOnClickListener(){
            buttonPlay(button20)
        }
        button21.setOnClickListener(){
            buttonPlay(button21)
        }
        button22.setOnClickListener(){
            buttonPlay(button22)
        }
        buttonReset.setOnClickListener(){
            resetGame()
        }
    }
    private fun buttonPlay(button: Button){
        if(firstPlayer){
            button.text = "X"
        }else{
            button.text = "0"
        }
        button.isClickable = false
        firstPlayer = !firstPlayer
        checkWinCondition()
    }
    private fun checkWinCondition(){
        if(button00.text.toString().isNotEmpty() && button00.text.toString() == button01.text.toString() && button01.text.toString() == button02.text.toString()){
            win(button00.text.toString())
        }else if(button10.text.toString().isNotEmpty() && button10.text.toString() == button11.text.toString() && button11.text.toString() == button12.text.toString()){
            win(button10.text.toString())
        }else if(button20.text.toString().isNotEmpty() && button20.text.toString() == button21.text.toString() && button21.text.toString() == button22.text.toString()){
            win(button20.text.toString())
        }else if(button00.text.toString().isNotEmpty() && button00.text.toString() == button10.text.toString() && button10.text.toString() == button20.text.toString()){
            win(button00.text.toString())
        }else if(button01.text.toString().isNotEmpty() && button01.text.toString() == button11.text.toString() && button11.text.toString() == button21.text.toString()){
            win(button01.text.toString())
        }else if(button02.text.toString().isNotEmpty() && button02.text.toString() == button12.text.toString() && button12.text.toString() == button22.text.toString()){
            win(button02.text.toString())
        }else if(button00.text.toString().isNotEmpty() && button00.text.toString() == button11.text.toString() && button11.text.toString() == button22.text.toString()){
            win(button00.text.toString())
        }else if(button02.text.toString().isNotEmpty() && button02.text.toString() == button11.text.toString() && button11.text.toString() == button20.text.toString()){
            win(button02.text.toString())
        }else if(button00.text.toString().isNotEmpty() && button01.text.toString().isNotEmpty() && button02.text.toString().isNotEmpty() && button10.text.toString().isNotEmpty() && button11.text.toString().isNotEmpty() && button12.text.toString().isNotEmpty() && button20.text.toString().isNotEmpty() && button21.text.toString().isNotEmpty() && button22.text.toString().isNotEmpty()){
            draw()
        }
    }
    private fun win(winner: String){
        Toast.makeText(this, "${winner} won", Toast.LENGTH_LONG).show()
        unclickableButtons()
    }
    private fun draw(){
        Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show()
        unclickableButtons()
    }
    private fun unclickableButtons(){
        button00.isClickable = false
        button01.isClickable = false
        button02.isClickable = false
        button10.isClickable = false
        button11.isClickable = false
        button12.isClickable = false
        button20.isClickable = false
        button21.isClickable = false
        button22.isClickable = false
    }
    private fun resetGame(){
        button00.text = ""
        button00.isClickable = true
        button01.text = ""
        button01.isClickable = true
        button02.text = ""
        button02.isClickable = true
        button10.text = ""
        button10.isClickable = true
        button11.text = ""
        button11.isClickable = true
        button12.text = ""
        button12.isClickable = true
        button20.text = ""
        button20.isClickable = true
        button21.text = ""
        button21.isClickable = true
        button22.text = ""
        button22.isClickable = true
        firstPlayer = true
    }
}