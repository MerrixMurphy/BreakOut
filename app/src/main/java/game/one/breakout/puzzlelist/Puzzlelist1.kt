package game.one.breakout.puzzlelist

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import game.one.breakout.MainActivity
import game.one.breakout.OnSwipeTouchListener
import game.one.breakout.R
import game.one.breakout.puzzles.*

class Puzzlelist1 : AppCompatActivity(){

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist1)

        val swipe1: TextView = findViewById(R.id.swipe1)

        var x = false

        swipe1.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist1) {
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist1, Puzzlelist2::class.java)
                    this@Puzzlelist1.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level2: ImageView = findViewById(R.id.level2)
        level2.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level2.isEnabled = false
        val level3: ImageView = findViewById(R.id.level3)
        level3.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level3.isEnabled = false
        val level4: ImageView = findViewById(R.id.level4)
        level4.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level4.isEnabled = false
        val level5: ImageView = findViewById(R.id.level5)
        level5.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level5.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 0
        val many1: TextView = findViewById(R.id.many1)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "one")
            editor.apply()
            val re1 = preferences.getString("puzzle1", "defaultValue")
            val re2 = preferences.getString("puzzle2", "defaultValue")
            val re3 = preferences.getString("puzzle3", "defaultValue")
            val re4 = preferences.getString("puzzle4", "defaultValue")
            val re5 = preferences.getString("puzzle5", "defaultValue")
            val re6 = preferences.getString("puzzle6", "defaultValue")
            val re7 = preferences.getString("puzzle7", "defaultValue")
            val re8 = preferences.getString("puzzle8", "defaultValue")
            val re9 = preferences.getString("puzzle9", "defaultValue")
            val re10 = preferences.getString("puzzle10", "defaultValue")
            val re11 = preferences.getString("puzzle11", "defaultValue")
            val re12 = preferences.getString("puzzle12", "defaultValue")
            val re13 = preferences.getString("puzzle13", "defaultValue")
            val re14 = preferences.getString("puzzle14", "defaultValue")
            val re15 = preferences.getString("puzzle15", "defaultValue")
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
            if (re1 == "one"){
                num = 1
                val level1: ImageView = findViewById(R.id.level1)
                val level1title: TextView = findViewById(R.id.level1title)
                level1.setImageResource(R.drawable.unlocked1)
                level1.translationX = (-120F)
                level1title.translationX = (-120F)
                level2.colorFilter = null
                level2.isEnabled = true
            }
            if (re2 == "two"){
                num = 2
                val level2title: TextView = findViewById(R.id.level2title)
                level2.setImageResource(R.drawable.unlocked1)
                level2.translationX = (-120F)
                level2title.translationX = (-120F)
                level3.colorFilter = null
                level3.isEnabled = true
            }
            if (re3 == "three"){
                num = 3
                val level3title: TextView = findViewById(R.id.level3title)
                level3.setImageResource(R.drawable.unlocked1)
                level3.translationX = (-120F)
                level3title.translationX = (-120F)
                level4.colorFilter = null
                level4.isEnabled = true
            }
            if (re4 == "four"){
                num = 4
                val level4title: TextView = findViewById(R.id.level4title)
                level4.setImageResource(R.drawable.unlocked1)
                level4.translationX = (-120F)
                level4title.translationX = (-120F)
                level5.colorFilter = null
                level5.isEnabled = true
            }
            if (re5 == "five"){
                num = 5
                val level5title: TextView = findViewById(R.id.level5title)
                level5.setImageResource(R.drawable.unlocked1)
                level5.translationX = (-120F)
                level5title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
            }
            if (re6 == "six"){
                num = 6
            }
            if (re7 == "seven"){
                num = 7
            }
            if (re8 == "eight"){
                num = 8
            }
            if (re9 == "nine"){
                num = 9
            }
            if (re10 == "ten"){
                num = 10
            }
            if (re11 == "eleven"){
                num = 11
            }
            if (re12 == "twelve"){
                num = 12
            }
            if (re13 == "thirteen"){
                num = 13
            }
            if (re14 == "fourteen"){
                num = 14
            }
            if (re15 == "fifteen"){
                num = 15
            }
            if (re16 == "sixteen"){
                num = 16
            }
            if (re17 == "seventeen"){
                num = 17
            }
            if (re18 == "eighteen"){
                num = 18
            }
            if (re19 == "nineteen"){
                num = 19
            }
            if (re20 == "twenty"){
                num = 20
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
            many1.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    fun levelone(view: View) {
        val goto = Intent(this@Puzzlelist1, puzzle1::class.java)
        this@Puzzlelist1.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwo(view: View) {
        val goto = Intent(this@Puzzlelist1, puzzle2::class.java)
        this@Puzzlelist1.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthree(view: View) {
        val goto = Intent(this@Puzzlelist1, puzzle3::class.java)
        this@Puzzlelist1.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfour(view: View) {
        val goto = Intent(this@Puzzlelist1, puzzle4::class.java)
        this@Puzzlelist1.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfive(view: View) {
        val goto = Intent(this@Puzzlelist1, puzzle5::class.java)
        this@Puzzlelist1.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist1, MainActivity::class.java)
        this@Puzzlelist1.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun godown1(view: View) {
        val goto = Intent(this@Puzzlelist1, Puzzlelist2::class.java)
        this@Puzzlelist1.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }
}
