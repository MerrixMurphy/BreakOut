package game.one.breakout.puzzlelist

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import game.one.breakout.MainActivity
import game.one.breakout.OnSwipeTouchListener
import game.one.breakout.R
import game.one.breakout.puzzles.*

class Puzzlelist4 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist4)

        val swipe4: TextView = findViewById(R.id.swipe4)

        var x = false

        swipe4.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist4) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist4, Puzzlelist3::class.java)
                this@Puzzlelist4.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist4, Puzzlelist5::class.java)
                    this@Puzzlelist4.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level17: ImageView = findViewById(R.id.level17)
        level17.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level17.isEnabled = false
        val level18: ImageView = findViewById(R.id.level18)
        level18.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level18.isEnabled = false
        val level19: ImageView = findViewById(R.id.level19)
        level19.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level19.isEnabled = false
        val level20: ImageView = findViewById(R.id.level20)
        level20.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level20.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 15
        val many4: TextView = findViewById(R.id.many4)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "four")
            editor.apply()
            val re16 = preferences.getString("puzzle16", "defaultValue")
            val re17 = preferences.getString("puzzle17", "defaultValue")
            val re18 = preferences.getString("puzzle18", "defaultValue")
            val re19 = preferences.getString("puzzle19", "defaultValue")
            val re20 = preferences.getString("puzzle20", "defaultValue")
            val re21 = preferences.getString("puzzle21", "defaultValue")
            val re22 = preferences.getString("puzzle22", "defaultValue")
            val re23 = preferences.getString("puzzle23", "defaultValue")
            val re24 = preferences.getString("puzzle24", "defaultValue")
            val re25 = preferences.getString("puzzle25", "defaultValue")
            val re26 = preferences.getString("puzzle26", "defaultValue")
            val re27 = preferences.getString("puzzle27", "defaultValue")
            val re28 = preferences.getString("puzzle28", "defaultValue")
            val re29 = preferences.getString("puzzle29", "defaultValue")
            val re30 = preferences.getString("puzzle30", "defaultValue")
            val re31 = preferences.getString("puzzle31", "defaultValue")
            val re32 = preferences.getString("puzzle32", "defaultValue")
            val re33 = preferences.getString("puzzle33", "defaultValue")
            val re34 = preferences.getString("puzzle34", "defaultValue")
            val re35 = preferences.getString("puzzle35", "defaultValue")
            val re36 = preferences.getString("puzzle36", "defaultValue")
            val re37 = preferences.getString("puzzle37", "defaultValue")
            val re38 = preferences.getString("puzzle38", "defaultValue")
            val re39 = preferences.getString("puzzle39", "defaultValue")
            val re40 = preferences.getString("puzzle40", "defaultValue")
            val re41 = preferences.getString("puzzle41", "defaultValue")
            val re42 = preferences.getString("puzzle42", "defaultValue")
            val re43 = preferences.getString("puzzle43", "defaultValue")
            val re44 = preferences.getString("puzzle44", "defaultValue")
            val re45 = preferences.getString("puzzle45", "defaultValue")
            val re46 = preferences.getString("puzzle46", "defaultValue")
            val re47 = preferences.getString("puzzle47", "defaultValue")
            val re48 = preferences.getString("puzzle48", "defaultValue")
            val re49 = preferences.getString("puzzle49", "defaultValue")
            val re50 = preferences.getString("puzzle50", "defaultValue")
            if (re16 == "sixteen"){
                num = 16
                val level16: ImageView = findViewById(R.id.level16)
                val level16title: TextView = findViewById(R.id.level16title)
                level16.setImageResource(R.drawable.unlocked1)
                level16.translationX = (-120F)
                level16title.translationX = (-120F)
                level17.colorFilter = null
                level17.isEnabled = true
            }
            if (re17 == "seventeen"){
                num = 17
                val level17title: TextView = findViewById(R.id.level17title)
                level17.setImageResource(R.drawable.unlocked1)
                level17.translationX = (-120F)
                level17title.translationX = (-120F)
                level18.colorFilter = null
                level18.isEnabled = true
            }
            if (re18 == "eighteen"){
                num = 18
                val level18title: TextView = findViewById(R.id.level18title)
                level18.setImageResource(R.drawable.unlocked1)
                level18.translationX = (-120F)
                level18title.translationX = (-120F)
                level19.colorFilter = null
                level19.isEnabled = true
            }
            if (re19 == "nineteen"){
                num = 19
                val level19title: TextView = findViewById(R.id.level19title)
                level19.setImageResource(R.drawable.unlocked1)
                level19.translationX = (-120F)
                level19title.translationX = (-120F)
                level20.colorFilter = null
                level20.isEnabled = true
            }
            if (re20 == "twenty"){
                num = 20
                val level20title: TextView = findViewById(R.id.level20title)
                level20.setImageResource(R.drawable.unlocked1)
                level20.translationX = (-120F)
                level20title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
            }
            if (re21 == "twenty-one"){
                num = 21
            }
            if (re22 == "twenty-two"){
                num = 22
            }
            if (re23 == "twenty-three"){
                num = 23
            }
            if (re24 == "twenty-four"){
                num = 24
            }
            if (re25 == "twenty-five"){
                num = 25
            }
            if (re26 == "twenty-six"){
                num = 26
            }
            if (re27 == "twenty-seven"){
                num = 27
            }
            if (re28 == "twenty-eight"){
                num = 28
            }
            if (re29 == "twenty-nine"){
                num = 29
            }
            if (re30 == "thirty"){
                num = 30
            }
            if (re31 == "thirty-one"){
                num = 31
            }
            if (re32 == "thirty-two"){
                num = 32
            }
            if (re33 == "thirty-three"){
                num = 33
            }
            if (re34 == "thirty-four"){
                num = 34
            }
            if (re35 == "thirty-five"){
                num = 35
            }
            if (re36 == "thirty-six"){
                num = 36
            }
            if (re37 == "thirty-seven"){
                num = 37
            }
            if (re38 == "thirty-eight"){
                num = 38
            }
            if (re39 == "thirty-nine"){
                num = 39
            }
            if (re40 == "forty"){
                num = 40
            }
            if (re41 == "forty-one"){
                num = 41
            }
            if (re42 == "forty-two"){
                num = 42
            }
            if (re43 == "forty-three"){
                num = 43
            }
            if (re44 == "forty-four"){
                num = 44
            }
            if (re45 == "forty-five"){
                num = 45
            }
            if (re46 == "forty-six"){
                num = 46
            }
            if (re47 == "forty-seven"){
                num = 47
            }
            if (re48 == "forty-eight"){
                num = 48
            }
            if (re49 == "forty-nine"){
                num = 49
            }
            if (re50 == "fifty"){
                num = 50
            }
            many4.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist4, MainActivity::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup4(view: View) {
        val goto = Intent(this@Puzzlelist4, Puzzlelist3::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown4(view: View) {
        val goto = Intent(this@Puzzlelist4, Puzzlelist5::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun levelsixteen(view: View) {
        val goto = Intent(this@Puzzlelist4, puzzle16::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelseventeen(view: View) {
        val goto = Intent(this@Puzzlelist4, puzzle17::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveleighteen(view: View) {
        val goto = Intent(this@Puzzlelist4, puzzle18::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelnineteen(view: View) {
        val goto = Intent(this@Puzzlelist4, puzzle19::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwenty(view: View) {
        val goto = Intent(this@Puzzlelist4, puzzle20::class.java)
        this@Puzzlelist4.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
