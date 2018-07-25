package com.example.fadli.tictactoy

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun btnClick(view: View){
        val buSelected:Button = view as Button
        var cellID=0
        when(buSelected.id){
            R.id.button->cellID=1
            R.id.button2->cellID=2
            R.id.button3->cellID=3
            R.id.button4->cellID=4
            R.id.button5->cellID=5
            R.id.button6->cellID=6
            R.id.button7->cellID=7
            R.id.button8->cellID=8
            R.id.button9->cellID=9
        }

        //Toast.makeText(this,"ID:"+cellID,Toast.LENGTH_SHORT).show()
        PlayGame(cellID,buSelected)
    }

    fun PlayGame(cellID:Int,buSelected:Button){
        if(activePlayer==1){
            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.GREEN)
            player1.add(cellID)
            activePlayer=2
        }else{
            buSelected.text="0"
            buSelected.setBackgroundColor(Color.BLUE)
            player2.add(cellID)
            activePlayer=1
        }

        buSelected.isEnabled = false
        checkWinner();
    }

    fun checkWinner(){
        var winner = -1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner=1
        }
        if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner=2
        }


        if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner=1
        }
        if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner=2
        }


        if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner=1
        }
        if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner=2
        }

        if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner=1
        }
        if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner=2
        }


        if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner=1
        }
        if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner=2
        }


        if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner=1
        }
        if(player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }

        if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winner=1
        }
        if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winner=2
        }


        if(winner!=-1){
            if(winner==1){
                Toast.makeText(this,"Player 1 menang",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Player 2 menang",Toast.LENGTH_SHORT).show()
            }
        }


    }
}

